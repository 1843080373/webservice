package com.wx.service;

public class UserServiceProxy implements com.wx.service.UserService {
  private String _endpoint = null;
  private com.wx.service.UserService userService = null;
  
  public UserServiceProxy() {
    _initUserServiceProxy();
  }
  
  public UserServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initUserServiceProxy();
  }
  
  private void _initUserServiceProxy() {
    try {
      userService = (new com.wx.service.UserServiceImplServiceLocator()).getUserServiceImplPort();
      if (userService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)userService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)userService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (userService != null)
      ((javax.xml.rpc.Stub)userService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.wx.service.UserService getUserService() {
    if (userService == null)
      _initUserServiceProxy();
    return userService;
  }
  
  public java.lang.String testUser(com.wx.service.User arg0) throws java.rmi.RemoteException{
    if (userService == null)
      _initUserServiceProxy();
    return userService.testUser(arg0);
  }
  
  public java.lang.String testService(java.lang.String arg0) throws java.rmi.RemoteException{
    if (userService == null)
      _initUserServiceProxy();
    return userService.testService(arg0);
  }
  
  
}