package com.demo.test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;


public class Test {

	protected static int cach_size = 3 * 1024 * 1024;
	
	public static void main(String[] args) throws Throwable {
		String path = "http://192.168.100.127:8080/image?username=admin&password=ca714c6a79714609&tenantId=089c166bb05d4443bb5d83922ef7cb5b&authenticate=true";
		Object json = JSONObject.fromObject("{'action': 'image_list'}");
		byte[] data = String.valueOf(json).getBytes("UTF-8");//得到了xml的实体数据
		
		URL url = new URL(path);
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		conn.setConnectTimeout(5 * 1000);
		conn.setRequestMethod("POST");
		conn.setDoOutput(true);
		conn.setRequestProperty("Content-Type", "text/xml; charset=UTF-8");
		conn.setRequestProperty("Content-Length", String.valueOf(data.length));
		OutputStream outStream = conn.getOutputStream();
		outStream.write(data);
		outStream.flush();
		outStream.close();
		
		System.out.println(conn.getResponseCode());
		System.out.println(conn.getResponseMessage());
		System.out.println(conn.getInputStream());
		
		InputStream is;
		if (conn.getResponseCode() >= 400) {
			is = conn.getErrorStream();
		} else {
			is = conn.getInputStream();
		}
		BufferedReader in = new BufferedReader(new InputStreamReader(is),
				cach_size);
		StringBuilder sbd = new StringBuilder();
		String line;
		while ((line = in.readLine()) != null) {
			sbd.append(line);
		}
		in.close();
		String response = sbd.toString();
		conn.disconnect();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("httpCode", conn.getResponseCode());
		map.put("response", response);
		
		
		byte [] tager = response.getBytes("UTF-8");
		System.out.println(new String(tager, "UTF-8"));
		
		System.out.println(new String(response.getBytes("unicode"),"UTF-8"));
		
		System.out.println(sbd);
		System.out.println(tager);
	}
}

