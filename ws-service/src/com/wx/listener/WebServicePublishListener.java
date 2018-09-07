package com.wx.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.xml.ws.Endpoint;

import com.wx.service.UserServiceImpl;
import com.wx.service.WeatherImpl;

public class WebServicePublishListener implements ServletContextListener {
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// WebService的发布地址
		String address = "http://192.168.23.1:8888/weather";
		// 发布WebService，WebServiceImpl类是WebServie接口的具体实现类
		Endpoint.publish(address, new WeatherImpl());

		// WebService的发布地址
		String address2 = "http://192.168.23.1:8888/UserService";
		Endpoint.publish(address2, new UserServiceImpl());
		System.out.println("使用WebServicePublishListener发布WeatherService成功!");
	}
}
