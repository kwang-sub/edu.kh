package edu.kh.oop.encapsulation.model.service;

import edu.kh.oop.encapsulation.model.vo.Account;

public class EncapulationService {

	public void example1() {
		Account ac = new Account();
//		ĸ��ȭ ��Ģ���� ���� private�� ��������� ����Ǹ� ���������� �� ������.
//		ac.name = "�ֱ���";
//		ac.accountNumber="010-8955-7994";
//		ac.password="123";
//		ac.bankCode=1;
//		ac.money=1000000;
//		setter�� �̿��� ��������
		ac.setName("�ֱ���");
		ac.setAccountNumber("010-8955-7994");
		ac.setPassword("123");
		ac.setBankCode(1);
		ac.setMoney(100000);
		
//		System.out.println(ac.money);
//		System.out.println(ac.password);
//		��� ������ ���� ������ �����Ͽ� ������ ���� �����.
		
//		ĸ��ȭ�� ����Ǿ� ���� �� ���� �������� ������ ���
		System.out.println(ac.getName());
		System.out.println(ac.getAccountNumber());
		System.out.println(ac.getPassword());
		System.out.println(ac.getBankCode());
		System.out.println(ac.getMoney());
		
		String name = ac.getName();
		System.out.println("name : " +name);
	}
	
}
