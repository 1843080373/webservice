package com.wx.httpclient;

import java.io.IOException;
import java.net.HttpURLConnection;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

@SuppressWarnings("deprecation")
public class TestWeather {
	// 通过Http-Client 框架来模拟实现 Http请求--get
	public static String getMobileCodeInfo1(String name) throws IOException {
		@SuppressWarnings("resource")
		HttpClient client = new DefaultHttpClient();
		HttpGet getMethod = new HttpGet("http://192.168.23.1:8888/weather?name=" + name);

		// 执行，得到消息码
		HttpResponse res = client.execute(getMethod);
		int code = res.getStatusLine().getStatusCode();
		System.out.println("消息码：" + code);
		String result = "";
		if (code == HttpURLConnection.HTTP_OK) {
			// 得到执行结果
			result = EntityUtils.toString(res.getEntity());
			System.out.println(result);
		}
		return result;
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println(getMobileCodeInfo1("chengdu"));
	}
}
