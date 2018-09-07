package com.wx.service;

import javax.jws.WebService;
@WebService
public interface UserService {
	public String testService(String params);
 
    public String testUser(String userJson);
    
    public String getUser();
}
