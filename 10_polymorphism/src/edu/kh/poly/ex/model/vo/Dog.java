package edu.kh.poly.ex.model.vo;

public class Dog extends Animal {
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	public Dog(String type, String eatType, String habitation) {
		super(type, eatType, habitation);
	}

	@Override
	public void move() {
		System.out.println("�׹߷� �����̰� ������ ����.");
		
	}
	
	@Override
	public void eat() {
		System.out.println("������ �ͱ��ͱ� �þ�Դ´�.");
		
	}
	
	@Override
	public void breath() {
		System.out.println("�ڿ� ������ ����.");
		
	}
	
}

