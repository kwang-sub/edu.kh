package edu.kh.oop.encapsulation.model.vo;

public class Account {
//	�Ӽ�(�ʵ�) : ���� �ۼ� �κ� 

//	������� : �ش� Ŭ������ �Ҽӵ� ����
//	Ŭ��������
	private String name;
	private String accountNumber;
	private String password;
	private int bankCode;
	private int money;

//  ���(�޼ҵ�)	
	public void depsit() {
		
	}
	public void withdraw() {
		
	}
//	private���� ���� ������ ���ѵ� ��� ������ ���������� ������ �� �ִ� ����� �ۼ�
//	������� �ϳ��� �ΰ��� ����� ������
//	getter/setter


//	setter �ۼ� ���
//	public void set���������(��������ڷ��� ���������){
//	this.���������=���������;
//  }
	public void setName(String name) {
		this.name=name;//���� ���� �Ű����� name ���� ��� ���� name�� ����
//		this.:����Ŭ����
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setBankCode(int bankCode) {
		this.bankCode = bankCode;
	}
	public void setMoney(int money) {
		this.money = money;
	}
//	getter �ۼ� ���
//	public ��������ڷ��� get���������(){
//	return ���������;
//	}
	
//	return : �޼ҵ带 �����ϰ� �����ʿ� �ۼ��� ���� ȣ��η� ��������
	public String getName() {
//		   String -> return �ϴ� ���� �ڷ��� ==��ȯ��(return type)
		return name;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public String getPassword() {
		return password;
	}
	public int getBankCode() {
		return bankCode;
	}
	public int getMoney() {
		return money;
	}
}
