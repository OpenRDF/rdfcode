package com.openrdf.junit;

import org.apache.log4j.Logger;

import junit.framework.TestCase;

public class log4j_test extends TestCase {

	public void test_log4j(){
		final Logger log = Logger.getLogger(log4j_test.class);
		log.debug("debug");
		log.error("error write by log4j.");
		
	}
}
