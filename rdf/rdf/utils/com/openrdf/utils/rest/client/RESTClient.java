package com.openrdf.utils.rest.client;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import org.apache.log4j.Logger;

import net.sf.json.JSONObject;

/**
 * REST Client, to invoke Other API
 * 
 * @description 本程序用于来自谢先斌毕业论文，如有使用请联系作者。
 * @URL 代码地址：http://github.com/openRDF/rdfcode
 * @rdf package com.openrdf.utils.rest.client;
 * @dateTime 2014-3-23
 * @author XieXianbin
 * @email a.b@hotmail.com
 *
 */

public class RESTClient {

	Logger logger = Logger.getLogger(Class RESTClient());
	
	public String RESTPOST(String uri, String headers, String payload){
		// ת��headersΪjson��ʽ
		Object headersJson = JSONObject.fromObject(headers);
		// ��ȡutf-8��ʽ�ֽ���
		try {
			byte[] headersByte = String.valueOf(headersJson).getBytes("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			
		}
		
		
		return null;
	}
	
	public String RESTGET(String uri){
		
		
		return null;
	}
}
