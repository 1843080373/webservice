/**
 * Weather.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.wx.service;

import javax.jws.WebService;

@WebService
public interface Weather {
    public String queryWeather(String name);
}
