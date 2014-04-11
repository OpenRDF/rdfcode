package com.openrdf.entity;

import java.util.Date;

/**
 * User bean
 * 
 * @description 本程序用于来自谢先斌毕业论文，如有使用请联系作者。
 * @URL 代码地址：http://github.com/openRDF/rdfcode
 * @rdf com.openrdf.beans
 * @dateTime 2014-3-6 下午9:43:59
 * @author XieXianbin
 * @email a.b@hotmail.com
 *
 */

public class Users {

	// 用户id
	private String userId;
	// 用户名称
	private String userName;
	// 用户密码
	private String userPass;
	// 用户权限
	private String userStatus;
	// 账户创建时间
	private Date accountCreateTime;
	// 用户年龄
	private int userAge;
	// 用户出生年月
	private String userBirthday;
	// 用户性别
	private String userSex;
	// 用户国家
	private String userCountry;
	// 用户省份
	private String userProvince;
	// 用户城市
	private String userCity;
	// 用户地址
	private String userAddress;
	// 用户邮编
	private String userPostCode;
	// 用户Email
	private String userEmail;
	private String userEmail1;
	private String userEmail2;
	// 用户电话
	private String userPhone;
	// 用户QQ
	private String userQQ;
	// 用户MSN
	private String userMSN;
	// 用户简介
	private String userBriefInfroduction;
	// 用户账户余额
	private double userBalance;
	// 用户其他
	private String userOthers;
	// 支付宝账户
	private String aliPayAccount;
	
	// gets and sets 方法
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	public Date getAccountCreateTime() {
		return accountCreateTime;
	}
	public void setAccountCreateTime(Date accountCreateTime) {
		this.accountCreateTime = accountCreateTime;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserBirthday() {
		return userBirthday;
	}
	public void setUserBirthday(String userBirthday) {
		this.userBirthday = userBirthday;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public String getUserCountry() {
		return userCountry;
	}
	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}
	public String getUserProvince() {
		return userProvince;
	}
	public void setUserProvince(String userProvince) {
		this.userProvince = userProvince;
	}
	public String getUserCity() {
		return userCity;
	}
	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserPostCode() {
		return userPostCode;
	}
	public void setUserPostCode(String userPostCode) {
		this.userPostCode = userPostCode;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserEmail1() {
		return userEmail1;
	}
	public void setUserEmail1(String userEmail1) {
		this.userEmail1 = userEmail1;
	}
	public String getUserEmail2() {
		return userEmail2;
	}
	public void setUserEmail2(String userEmail2) {
		this.userEmail2 = userEmail2;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserQQ() {
		return userQQ;
	}
	public void setUserQQ(String userQQ) {
		this.userQQ = userQQ;
	}
	public String getUserMSN() {
		return userMSN;
	}
	public void setUserMSN(String userMSN) {
		this.userMSN = userMSN;
	}
	public String getUserBriefInfroduction() {
		return userBriefInfroduction;
	}
	public void setUserBriefInfroduction(String userBriefInfroduction) {
		this.userBriefInfroduction = userBriefInfroduction;
	}
	public double getUserBalance() {
		return userBalance;
	}
	public void setUserBalance(double userBalance) {
		this.userBalance = userBalance;
	}
	public String getUserOthers() {
		return userOthers;
	}
	public void setUserOthers(String userOthers) {
		this.userOthers = userOthers;
	}
	public String getAliPayAccount() {
		return aliPayAccount;
	}
	public void setAliPayAccount(String aliPayAccount) {
		this.aliPayAccount = aliPayAccount;
	}
	
}
