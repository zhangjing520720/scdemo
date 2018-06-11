package com.scdemo.parking.server.controller.order;


import com.scdemo.parking.server.controller.BaseController;
import com.scdemo.parking.server.service.OrderService;
import com.wsp.core.WSPCode;
import com.wsp.core.WSPResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * rest+ribbon 方式调用服务
 * @author zhangjing
 *
 */
@RestController
@RequestMapping("/order")
public class OrderController extends BaseController {

	@Autowired
    OrderService orderService;
    
    /**
     * 获取订单
     */
    @RequestMapping(value = "/getOrder",method = RequestMethod.GET, headers = "Accept=*/*",produces = "application/json;charset=UTF-8")
    public String getParks (HttpServletRequest request,@RequestParam String name){
        
        return orderService.getService(name);
    }

	
}
