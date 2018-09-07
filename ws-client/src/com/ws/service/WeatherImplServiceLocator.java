/**
 * WeatherImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ws.service;

public class WeatherImplServiceLocator extends org.apache.axis.client.Service implements com.ws.service.WeatherImplService {

    public WeatherImplServiceLocator() {
    }


    public WeatherImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WeatherImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WeatherImplPort
    private java.lang.String WeatherImplPort_address = "http://192.168.23.1:8888/weather";

    public java.lang.String getWeatherImplPortAddress() {
        return WeatherImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WeatherImplPortWSDDServiceName = "WeatherImplPort";

    public java.lang.String getWeatherImplPortWSDDServiceName() {
        return WeatherImplPortWSDDServiceName;
    }

    public void setWeatherImplPortWSDDServiceName(java.lang.String name) {
        WeatherImplPortWSDDServiceName = name;
    }

    public com.ws.service.Weather getWeatherImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WeatherImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWeatherImplPort(endpoint);
    }

    public com.ws.service.Weather getWeatherImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ws.service.WeatherImplPortBindingStub _stub = new com.ws.service.WeatherImplPortBindingStub(portAddress, this);
            _stub.setPortName(getWeatherImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWeatherImplPortEndpointAddress(java.lang.String address) {
        WeatherImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ws.service.Weather.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ws.service.WeatherImplPortBindingStub _stub = new com.ws.service.WeatherImplPortBindingStub(new java.net.URL(WeatherImplPort_address), this);
                _stub.setPortName(getWeatherImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WeatherImplPort".equals(inputPortName)) {
            return getWeatherImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.wx.com/", "WeatherImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.wx.com/", "WeatherImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WeatherImplPort".equals(portName)) {
            setWeatherImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
