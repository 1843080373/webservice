package com.wx.service;

import javax.jws.WebService;

@WebService(endpointInterface="com.wx.service.Weather") 
public class WeatherImpl implements Weather{
    public String queryWeather(String name) {
        return "hello,"+name+"!今日天气为晴，偏北风二到三级";
    }
}