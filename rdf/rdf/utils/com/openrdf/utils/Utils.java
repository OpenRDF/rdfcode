package com.openrdf.utils;

import java.text.DateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Utils工具包
 * 
 * @description 本程序用于来自谢先斌毕业论文，如有使用请联系作者。
 * @URL 代码地址：http://github.com/openRDF/rdfcode
 * @rdf com.openrdf.utils
 * @dateTime 2014-2-27 
 * @author XieXianbin
 * @email a.b@hotmail.com
 *
 */

public class Utils {

	/**
	 * 获取当前时间，格式如：2014-2-28
	 */
	public static String getDate(){
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateInstance();
		return dateFormat.format(date);
	}
	
	/**
	 * 获取当前时间，格式如：2014-2-28 0:12:27
	 */
	public static String getDateTime(){
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance();
		return dateFormat.format(date);
	}
	
	/**
	 * 生成UUID，用来唯一的标识一个用户id
	 */
	
	public static UUID geneUUID(){
		// 生成一个UUID
		UUID uuid = UUID.randomUUID();
		return uuid;
	}
}
