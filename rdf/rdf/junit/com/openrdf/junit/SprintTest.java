package com.openrdf.junit;

import org.junit.Test;
import org.springframework.context.*;

public class SprintTest {

	@Test
	public void test() {
		String[] beans = new String[]{"beans.xml"};
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(beans);
		aax = applicationContext.getBean("aa");
		aax.method();
	}

}
