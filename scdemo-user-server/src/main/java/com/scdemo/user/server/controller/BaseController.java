package com.scdemo.user.server.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.wsp.utils.WSPGetID;

/**
 * 基础控制类
 * 
 * @author rex
 */
public class BaseController {

	protected Logger logger = LogManager.getLogger();

	private static final long serialVersionUID = 6357869213649815390L;

	/**
	 * 得到ModelAndView
	 */
	public ModelAndView getModelAndView() {
		return new ModelAndView();
	}

	/**
	 * 得到request对象
	 */
	public HttpServletRequest getRequest() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();

		return request;
	}

	/**
	 * 得到32位的uuid
	 * 
	 * @return
	 */
	public String get32UUID() {

		return WSPGetID.getUUID32();
	}

	/**
	 * @param gson
	 */
	protected Gson gson = new Gson();

	/**
	 * @param fastJson
	 */
	protected JSONObject json = new JSONObject();
	protected JSONArray jsonArray = new JSONArray();

}
