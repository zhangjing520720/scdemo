package com.scdemo.common.util.controller.test;


import com.scdemo.common.util.controller.BaseController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/test")
public class TestController extends BaseController {


    /**
     * 测试获取
     */
	@Value("${server.port}")//从配置文件获取值
    String port;
    @RequestMapping(value = "/get",method = RequestMethod.GET, headers = "Accept=*/*",produces = "application/json;charset=UTF-8")
    public String getParks (HttpServletRequest request,@RequestParam String name){
        return "{\"name\":"+name.hashCode()+",\"port\":"+port+"}";
    }

	
}
