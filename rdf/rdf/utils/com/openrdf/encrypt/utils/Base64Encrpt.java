package com.openrdf.encrypt.utils;

/**
 * Base64Encrpt ��������ܵĹ�����
 * 
 * @description ��������������л�ȱ��ҵ���ģ�����ʹ������ϵ���ߡ�
 * @URL �����ַ��http://github.com/openRDF/rdfcode
 * @rdf com.openrdf.utils
 * @dateTime 2014-2-27 
 * @author XieXianbin
 * @email a.b@hotmail.com
 *
 */

public class Base64Encrpt {
	// �����ַ���
	private final static String encryptKey = "!qa#2.D3sSd3E/234=";
	// ����ʵ����
	private static Encrypt encrypt = null;
	
	public Base64Encrpt(){
		// ��һ�ε���ʱʵ����encrypt
		if(encrypt == null){
			encrypt = new Encrypt();
			encrypt.setKey(encryptKey);
		}
	}
	
	// ����
	public String getEncString(String enString){
		// ����
		encrypt.setEncString(enString);
		// ����
		return encrypt.getEncString();
	}
	
	// ����
	public String getDesString(String deString){
		// ����
		encrypt.setDesString(deString);
		// ����
		return encrypt.getDesString();
	}
}
