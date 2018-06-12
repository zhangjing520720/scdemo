package com.scdemo.parking.server.service;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service("orderService")
public class OrderService {
    @Autowired
    RestTemplate restTemplate;
    
    //Hystrix断路器测试
    //@HystrixCommand(fallbackMethod = "getError")
    public String getService(String name) {
        return restTemplate.getForObject("http://common/test/get?name="+name,String.class);
    }
    //getService 调不通或者服务挂了后的回调
    public String getError(String name) {
        return "{\"msg\":\"hi,"+name+",sorry,error!\"}";
    }
    
}
