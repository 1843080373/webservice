package com.ws.axis;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;

/**
 * @author created by Pjc
 * @date 2017年7月18日
 * @version 1.0
 * @problem
 * @answer
 * @action
 */
public class TestWebservice {

	public static void main(String[] args) {
		axis();
	}

	// 通过axis方式调用webservice接口
	public static void axis() {
		try {
			String endpoint = "http://192.168.23.1:8888/weather?wsdl";
			// 创建一个服务（service）调用（call）
			Service service = new Service();
			Call call = (Call) service.createCall();

			// 设置service所在的url
			call.setTargetEndpointAddress(new java.net.URL(endpoint));

			call.setOperationName(new QName("http://service.wx.com/","queryWeather"));
			call.addParameter("arg0", XMLType.XSD_STRING,
                    ParameterMode.IN);//接口的参数
            call.setReturnType(org.apache.axis.encoding.XMLType.XSD_STRING);//设置返回类型
			String ret = (String) call.invoke(new Object[] { "张三" });
			System.out.println(ret);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
