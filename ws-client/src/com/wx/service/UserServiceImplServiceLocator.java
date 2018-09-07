/**
 * UserServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.wx.service;

public class UserServiceImplServiceLocator extends org.apache.axis.client.Service implements com.wx.service.UserServiceImplService {

    public UserServiceImplServiceLocator() {
    }


    public UserServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UserServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for UserServiceImplPort
    private java.lang.String UserServiceImplPort_address = "http://192.168.23.1:8888/UserService";

    public java.lang.String getUserServiceImplPortAddress() {
        return UserServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String UserServiceImplPortWSDDServiceName = "UserServiceImplPort";

    public java.lang.String getUserServiceImplPortWSDDServiceName() {
        return UserServiceImplPortWSDDServiceName;
    }

    public void setUserServiceImplPortWSDDServiceName(java.lang.String name) {
        UserServiceImplPortWSDDServiceName = name;
    }

    public com.wx.service.UserService getUserServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(UserServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUserServiceImplPort(endpoint);
    }

    public com.wx.service.UserService getUserServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.wx.service.UserServiceImplPortBindingStub _stub = new com.wx.service.UserServiceImplPortBindingStub(portAddress, this);
            _stub.setPortName(getUserServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUserServiceImplPortEndpointAddress(java.lang.String address) {
        UserServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.wx.service.UserService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.wx.service.UserServiceImplPortBindingStub _stub = new com.wx.service.UserServiceImplPortBindingStub(new java.net.URL(UserServiceImplPort_address), this);
                _stub.setPortName(getUserServiceImplPortWSDDServiceName());
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
        if ("UserServiceImplPort".equals(inputPortName)) {
            return getUserServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.wx.com/", "UserServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.wx.com/", "UserServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("UserServiceImplPort".equals(portName)) {
            setUserServiceImplPortEndpointAddress(address);
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
