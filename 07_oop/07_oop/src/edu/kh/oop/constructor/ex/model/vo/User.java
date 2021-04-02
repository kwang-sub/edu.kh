package edu.kh.oop.constructor.ex.model.vo;

public class User {
	
//	Ŭ���� ����
//	public class Ŭ������{
//	 �ʵ�
//	 ������
//	 �޼ҵ�
//  }
	
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	
//	������
//	new �����ڸ� ���� ��ü ������ ������ ��ü�� ���� �ʱ�ȭ �ϰ� ������ ����� �����ϴ� ���� �����̴�.
//
//	������ �ۼ��� ���ǻ���
//	1.�����ڸ��� �ݵ�� Ŭ������� �����ؾ��Ѵ�.
//	2.��ȯ���� �������� �ʴ´�.
//	3.�Ű����� �ִ� ������ �ۼ��� �⺻ �����ڰ� �����Ϸ��� ���� �ڵ����� �������� �����Ƿ� �⺻�����ڸ� �ݵ�� �ۼ��ؾ��Ѵ�.
//	
//	�⺻������
//	[����������] Ŭ������(){}
//	�⺻�����ڰ� �ۼ����� ���� ��� �����Ϸ��� ���ؼ� �ڵ����� �⺻ �����ڰ� �����ȴ�.
//	
//	�Ű����� �ִ� ������
//	�Ű����� : �޼ҵ� ȣ�� �� ���޵Ǵ� ���� ������ ����(�Ű�ü ��Ȱ)
//	��ü ���� �� �Ű������� ���� ���� ���� �̿��ؼ� �ʵ� ���� �ʱ�ȭ �ϴ�  ������
//	�Ű������� ���� �ڷ����� ���޵Ǵ� ���������� ���� ���簡 �̷�� ����.
	
//	�����ε�
//	�� Ŭ���� ���� ������ �̸��� �޼ҵ带 ���� �� �ۼ��Ѵ� ���
//	���δ� �Ű������ִ� ������ ������ �⺻������ �����ϰ� ���� �̸��� �Ű������ִ� �����ڸ� �����ϴ°� �����ϸ� �ȴ�.
//	
//	�����ε� ���� ����
//	1.�޼ҵ���� ���ƾ� �Ѵ�.
//	2.�Ű������� Ÿ��,����,�ڷ����� ���� �� �ϳ��� �޶�� �Ѵ�.
//	
//	�����ε��� ���ǻ���
//	�Ű������� ������ �ٲٰ� �� ��� �Ű������� �ڷ����� Ȯ���ؾ��Ѵ�.
//	
//	this() ������
//	���� Ŭ���� ���� �ִ� �ٸ� �����ڸ� ȣ���� �� ���
//	������ ���ο����� �ۼ��Ҽ� �ְ� �ݵ�� ù��° �ٿ� �ۼ� �Ǿ�� �Ѵ�.
//	�����ε��ÿ� �ٸ� �����ڿ��� ���� �Ű������� ����ϴ� ���
//
//	this() ������ �������
//	�ݺ��Ǵ� ������ ������ �ҽ��ڵ� �ߺ��� �ذ��ϱ� ���ؼ��̴�.
	public User() {
	}
	public User(String userId,String userPwd,String userName,int age,char gender) {
		
		this(userId,userPwd);
	
//		this.userId = userId;
//		this.userPwd = userPwd;
		
		this.userName = userName;
		this.age = age;
		this.gender = gender;
	}
	public User(String userId,String userPwd) {
		this.userId = userId;
		this.userPwd = userPwd;
	}
	public User(String userName,int age) {
		this.userName = userName;
		this.age = age;
	}
//	public User(String userId,String userName) {
//		this.userId = userId;
//		this.userName = userName;
//	}
	
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String toString() {
		String result = userId + "/" + userPwd + "/" + userName + "/" + age + "/" + gender;
		return result;
	}
	

}
