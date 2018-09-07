package com.ws.axis;

import java.util.List;
import java.util.stream.Collectors;

import javax.xml.namespace.QName;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.wx.service.User;

/**
 * @author created by Pjc
 * @date 2017年7月18日
 * @version 1.0
 * @problem
 * @answer
 * @action
 */
public class TestWebservice3 {

	public static void main(String[] args) {
		axis();
	}

	// 通过axis方式调用webservice接口
	@SuppressWarnings("unchecked")
	public static void axis() {
		try {
			String endpoint = "http://192.168.23.1:8888/UserService?wsdl";
			// 创建一个服务（service）调用（call）
			Service service = new Service();
			Call call = (Call) service.createCall();

			// 设置service所在的url
			call.setTargetEndpointAddress(new java.net.URL(endpoint));

			call.setOperationName(new QName("http://service.wx.com/","getUser"));
		
            call.setReturnType(org.apache.axis.encoding.XMLType.XSD_STRING);//设置返回类型
			String ret = (String) call.invoke(new Object[] {  });
			List<JSONObject> userJsonArrays=JSON.toJavaObject(JSON.parseArray(ret), List.class);
			List<User> users = userJsonArrays.stream()
	                .map(e -> new User(e.getString("id"), e.getString("name")))
	                .collect(Collectors.toList());
			for (User u : users) {
				System.out.println(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
