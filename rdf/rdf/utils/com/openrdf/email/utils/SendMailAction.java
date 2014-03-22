package com.openrdf.email.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


/**
 * Sender Mail Action
 * 
 * @description ��������������л�ȱ��ҵ���ģ�����ʹ������ϵ���ߡ� �����ʼ�������ʱ���ø÷������ɡ�
 * @URL �����ַ��http://github.com/openRDF/rdfcode
 * @dateTime 2014-3-22 ����7:43:59
 * @author XieXianbin
 * @email a.b@hotmail.com
 *
 */

public class SendMailAction {

	// �����Ƿ����ʼ����������
	private static String MailServerHost = null;
	private static int ServerPort = 25;
	private static String UserName = null;
	private static String Password = null;
	
	public boolean sendMail(String toAddress, String mailSubject, String mailContent){
		// ��ȡemail��������Ϣ
		if (MailServerHost == null || UserName == null || Password == null){
			
		}
		
		
		
		return true;
	}
	
	private void loadEmailProperties(){
		// ����email.properties�����ļ�
		try{
			final String EMAILPROPERTIES = "email.properties";
			// ��ȡ��ļ���Ŀ¼
			final String PATH = SendMailAction.class.getClassLoader().getResource("").toURI().getPath();
			// ���ļ������ڴ�
			FileInputStream fileInputStream = new FileInputStream(new File(PATH + EMAILPROPERTIES));
			// ���������ļ�
			Properties properties = new Properties();
			properties.load(fileInputStream);
			// ��ȡ�ļ�����
			MailServerHost = properties.getProperty("MailServerHost");
			ServerPort = Integer.parseInt(properties.getProperty("ServerPort"));
			UserName = properties.getProperty("UserName");
			// ����
			Password = properties.getProperty("Password");
		}catch (Exception e){
			
		}
		
	}
}
