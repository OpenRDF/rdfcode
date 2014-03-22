package com.openrdf.email.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


/**
 * Sender Mail Action
 * 
 * @description 本程序用于来自谢先斌毕业论文，如有使用请联系作者。 发送邮件，调用时调用该方法即可。
 * @URL 代码地址：http://github.com/openRDF/rdfcode
 * @dateTime 2014-3-22 下午7:43:59
 * @author XieXianbin
 * @email a.b@hotmail.com
 *
 */

public class SendMailAction {

	// 下面是发送邮件的相关配置
	private static String MailServerHost = null;
	private static int ServerPort = 25;
	private static String UserName = null;
	private static String Password = null;
	
	public boolean sendMail(String toAddress, String mailSubject, String mailContent){
		// 获取email的配置信息
		if (MailServerHost == null || UserName == null || Password == null){
			
		}
		
		
		
		return true;
	}
	
	private void loadEmailProperties(){
		// 加载email.properties配置文件
		try{
			final String EMAILPROPERTIES = "email.properties";
			// 获取类的加载目录
			final String PATH = SendMailAction.class.getClassLoader().getResource("").toURI().getPath();
			// 把文件读入内存
			FileInputStream fileInputStream = new FileInputStream(new File(PATH + EMAILPROPERTIES));
			// 加载属性文件
			Properties properties = new Properties();
			properties.load(fileInputStream);
			// 读取文件内容
			MailServerHost = properties.getProperty("MailServerHost");
			ServerPort = Integer.parseInt(properties.getProperty("ServerPort"));
			UserName = properties.getProperty("UserName");
			// 解密
			Password = properties.getProperty("Password");
		}catch (Exception e){
			
		}
		
	}
}
