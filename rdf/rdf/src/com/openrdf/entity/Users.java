package com.openrdf.entity;

import java.util.Date;

/**
 * User bean
 * 
 * @description ��������������л�ȱ��ҵ���ģ�����ʹ������ϵ���ߡ�
 * @URL �����ַ��http://github.com/openRDF/rdfcode
 * @rdf com.openrdf.beans
 * @dateTime 2014-3-6 ����9:43:59
 * @author XieXianbin
 * @email a.b@hotmail.com
 *
 */

public class Users {

	// �û�id
	private String userId;
	// �û�����
	private String userName;
	// �û�����
	private String userPass;
	// �û�Ȩ��
	private String userStatus;
	// �˻�����ʱ��
	private Date accountCreateTime;
	// �û�����
	private int userAge;
	// �û���������
	private String userBirthday;
	// �û��Ա�
	private String userSex;
	// �û�����
	private String userCountry;
	// �û�ʡ��
	private String userProvince;
	// �û�����
	private String userCity;
	// �û���ַ
	private String userAddress;
	// �û��ʱ�
	private String userPostCode;
	// �û�Email
	private String userEmail;
	private String userEmail1;
	private String userEmail2;
	// �û��绰
	private String userPhone;
	// �û�QQ
	private String userQQ;
	// �û�MSN
	private String userMSN;
	// �û����
	private String userBriefInfroduction;
	// �û��˻����
	private double userBalance;
	// �û�����
	private String userOthers;
	
	// gets and sets ����
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
	
}
