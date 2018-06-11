package com.scdemo.user.server.controller.user;


import com.scdemo.user.server.controller.BaseController;
import com.scdemo.user.server.inter.ISchedualTest;
import com.wsp.core.WSPCode;
import com.wsp.core.WSPResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Feign 方式调用服务
 * @author zhangjing
 *
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

	@Autowired
    ISchedualTest schedualTest;
    
    /**
     * 获取订单
     */
    @RequestMapping(value = "/getUser",method = RequestMethod.GET, headers = "Accept=*/*",produces = "application/json;charset=UTF-8")
    public String getParks (HttpServletRequest request,@RequestParam String name){
        
    	return schedualTest.getFromClientOne(name);
    }

}
