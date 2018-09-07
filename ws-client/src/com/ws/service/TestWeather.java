package com.ws.service;

public class TestWeather {

	public static void main(String[] args) {
		try {
			WeatherImplServiceLocator service = new WeatherImplServiceLocator();
			java.net.URL url = new java.net.URL("http://192.168.23.1:8888/weather?WSDL");
			WeatherImplPortBindingStub stub = new WeatherImplPortBindingStub(url, service);
			String x2 = stub.queryWeather("成都");
			System.out.println(x2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			WeatherImplService ws = new WeatherImplServiceLocator();
			Weather stub = ws.getWeatherImplPort();
			String x2 = stub.queryWeather("成都");
			System.out.println(x2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			WeatherProxy IWeatherServiceProxy = new WeatherProxy(); //使用代理类实例化对象，调用webservice
			String tel = IWeatherServiceProxy.queryWeather("城市"); //要查询的城市
			System.out.println(tel);
		} catch (Exception e) {
			e.printStackTrace();
		}  
	}
}
