package com.ws.wsimport;

public class TestWeather {

	public static void main(String[] args) {
		WeatherImplService  ws=new WeatherImplService();
		Weather w=ws.getWeatherImplPort();
		System.out.println(w.queryWeather("北京"));
	}
}
