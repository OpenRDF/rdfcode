package com.openrdf.junit;

import com.openrdf.email.utils.SendMailAction;

import junit.framework.TestCase;

public class SendMailTest extends TestCase {

	public void test(){
		SendMailAction sendMailAction = new SendMailAction();
		System.out.println(sendMailAction.sendMail("1067890036@qq.com", "来自小谢的测试邮件", "看什么看。"));
	}
}
