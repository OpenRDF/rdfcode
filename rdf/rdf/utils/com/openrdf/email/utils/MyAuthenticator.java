package com.openrdf.email.utils;
  
import javax.mail.*;

/**
 * E-mail MyAuthenticator
 * 
 * @description ��������������л�ȱ��ҵ���ģ�����ʹ������ϵ���ߡ�
 * @URL �����ַ��http://github.com/openRDF/rdfcode
 * @dateTime 2014-3-22 ����6:56:09
 * @author XieXianbin
 * @email a.b@hotmail.com
 *
 */

public class MyAuthenticator extends Authenticator{  
	
    String userName=null;
    String password=null;
       
    public MyAuthenticator(){  
    }  
    public MyAuthenticator(String username, String password) {   
        this.userName = username; 
        this.password = password; 
    }   
    protected PasswordAuthentication getPasswordAuthentication(){  
        return new PasswordAuthentication(userName, password);
    }  
}