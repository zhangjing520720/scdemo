package com.scdemo.user.server.inter;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.scdemo.user.server.inter.impl.SchedualTest;

@FeignClient(value = "common" ,fallback = SchedualTest.class)
public interface ISchedualTest {
	
	
	 @RequestMapping(value = "/test/get",method = RequestMethod.GET)
	 String getFromClientOne(@RequestParam(value = "name") String name);

}
