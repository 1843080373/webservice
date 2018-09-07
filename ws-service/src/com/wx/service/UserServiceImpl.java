package com.wx.service;

import java.util.Arrays;

import javax.jws.WebService;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.wx.bean.User;
@WebService(endpointInterface="com.wx.service.UserService") 
public class UserServiceImpl implements UserService{
	public String testService(String params){
        return "hello " + params;
    }
 
    public String testUser(String userJson){
    	User user=JSON.toJavaObject(JSON.parseObject(userJson), User.class);
        return user.getName() + " : " + user.getId();
    }

	@Override
	public String getUser() {
		return JSONArray.toJSONString(Arrays.asList(new User("2","uduud"),
				new User("3","7788yyu")));
	}

}
