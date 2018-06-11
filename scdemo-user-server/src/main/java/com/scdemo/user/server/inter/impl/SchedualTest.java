package com.scdemo.user.server.inter.impl;

import org.springframework.stereotype.Component;

import com.scdemo.user.server.inter.ISchedualTest;

@Component
public class SchedualTest implements ISchedualTest{

	@Override
	public String getFromClientOne(String name) {
		// TODO Auto-generated method stub
		return "{\"msg\":\"hi,"+name+",error!\"}";
	}

}
