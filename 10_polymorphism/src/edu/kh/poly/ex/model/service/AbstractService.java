package edu.kh.poly.ex.model.service;

import edu.kh.poly.ex.model.vo.Chicken;

public class AbstractService  {

	public void example1() {
		
		Animal a1 = new Animal();
//		Animal�� �߻�Ŭ�������� ��ü�� ���� �� ����.
		
		Chicken c1 = new Chicken("����", "���", "����", 2);
		c1.move();
		c1.eat();
		c1.breath();
		
	}
}
