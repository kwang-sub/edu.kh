package edu.kh.test.model.vo;
//�ʵ� : userId, userPwd, name
//
//�⺻������, �Ű����� �ִ� ������, getter/setter
public class User {
	private String userId;
	private String userPwd;
	private String name;
	
	public User() {
		
	}
	
	public User(String userId, String userPwd, String name) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.name = name;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	 "���̵� : OOO, ��й�ȣ : OOO, �̸� : OOO" 
	@Override
	public String toString() {
		return "���̵� : " +  userId + ", ��й�ȣ : " + userPwd + ",�̸� : " + name;
	}
	
	
}
