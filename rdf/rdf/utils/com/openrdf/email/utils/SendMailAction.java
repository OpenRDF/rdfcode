package com.openrdf.email.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import com.openrdf.encrypt.utils.Base64Encrpt;

import org.apache.log4j.Logger;

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

	// �����Ǽ�¼��־�ķ���
	Logger logger = Logger.getLogger(SendMailAction.class);

	// �����Ƿ����ʼ����������
	private static String mailServerHost = null;
	private static String serverPort = null;
	private static String userName = null;
	private static String password = null;
	private static MailSender mailSender = null;
	
	public boolean sendMail(String toAddress, String mailSubject, String mailContent){
		// ��ȡemail��������Ϣ
		if (mailServerHost == null || userName == null || password == null || serverPort == null){
			this.loadEmailProperties();
		}
		// ��ʼ��mailSender
		if (mailSender == null){
			mailSender = new MailSender();
		}
		// ��ʼ��MailSenderBean
		MailSenderBean mailSenderBean = new MailSenderBean();
		mailSenderBean.setMailServerHost(mailServerHost); // SMTP������
		mailSenderBean.setMailServerPort(serverPort); // SMTP�˿�
		mailSenderBean.setValidate(true);
		mailSenderBean.setUserName(userName); // ��������
		mailSenderBean.setPassword(password); // �����˻�
		mailSenderBean.setFromAddress(userName); // ��ʾ������
		mailSenderBean.setToAddress(toAddress); // �ռ���
		mailSenderBean.setSubject(mailSubject); // �ʼ�����
		mailSenderBean.setContent(mailContent); // �ʼ�����
		// ������HTML��ʽ�����ʼ�
		boolean send_state = mailSender.sendHtmlMail(mailSenderBean);
		logger.debug("Send Mail to: " + toAddress + " with subject: " + mailSubject + " state is " + send_state);
		// ���ط����ʼ�
		return send_state;
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
			mailServerHost = properties.getProperty("MailServerHost");
			serverPort = properties.getProperty("ServerPort");
			userName = properties.getProperty("UserName");
			// ����
			Base64Encrpt base64Encrpt = new Base64Encrpt();
			password = base64Encrpt.getDesString(properties.getProperty("Password"));
		}catch (Exception e){
			//log.error();
		}
	}
}
