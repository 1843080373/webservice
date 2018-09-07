package com.ws.service;

public class WeatherProxy implements com.ws.service.Weather {
  private String _endpoint = null;
  private com.ws.service.Weather weather = null;
  
  public WeatherProxy() {
    _initWeatherProxy();
  }
  
  public WeatherProxy(String endpoint) {
    _endpoint = endpoint;
    _initWeatherProxy();
  }
  
  private void _initWeatherProxy() {
    try {
      weather = (new com.ws.service.WeatherImplServiceLocator()).getWeatherImplPort();
      if (weather != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)weather)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)weather)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (weather != null)
      ((javax.xml.rpc.Stub)weather)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ws.service.Weather getWeather() {
    if (weather == null)
      _initWeatherProxy();
    return weather;
  }
  
  public java.lang.String queryWeather(java.lang.String arg0) throws java.rmi.RemoteException{
    if (weather == null)
      _initWeatherProxy();
    return weather.queryWeather(arg0);
  }
  
  
}