package com.scdemo.config.client.controller.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 测试config client
 * @author zhangjing
 *
 */
@RefreshScope
@RestController
@RequestMapping("/configClient")
public class ConfigClientController  {
    
    /**
     * 获取配置foo
     */
	@Value("${foo}")
	String foo;

    @RequestMapping(value = "/getFoo",method = RequestMethod.GET, headers = "Accept=*/*",produces = "application/json;charset=UTF-8")
    public String getFoo (HttpServletRequest request){
        
    	return foo;
    }
    /**
     * 获取配置port
     */

	@Value("${foo}")
	String port;
    @RequestMapping(value = "/getPort",method = RequestMethod.GET, headers = "Accept=*/*",produces = "application/json;charset=UTF-8")
    public String getPort (HttpServletRequest request){
        
    	return port;
    }
}
