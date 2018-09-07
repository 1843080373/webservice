package com.wx.service;

import javax.xml.ws.WebServiceException;

public class Test {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		try {
			UserService helloService = new UserServiceImplServiceLocator().getUserServiceImplPort();
			String s = helloService.testService("aabbcc");
			System.out.println(s);
			User user = new User();
			user.setId("123");
			user.setName("aabbcc");
			String s2 = helloService.testUser(user);
			System.out.println(s2);
		} catch (WebServiceException wse) {
			System.out.println("服务未启动");
			wse.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
