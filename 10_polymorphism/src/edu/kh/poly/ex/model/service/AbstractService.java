package edu.kh.poly.ex.model.service;

import edu.kh.poly.ex.model.vo.Animal;
import edu.kh.poly.ex.model.vo.Chicken;
import edu.kh.poly.ex.model.vo.Dog;

public class AbstractService  {

	public void example1() {
		
//		Animal a1 = new Animal();
//		Animal�� �߻�Ŭ�������� ��ü�� ���� �� ����.
		
		Chicken c1 = new Chicken("����", "���", "����", 2);
		c1.move();
		c1.eat();
		c1.breath();
		
		
		Dog d1 = new Dog("��������", "���", "�츮��");
		d1.move();
		d1.eat();
		d1.breath();
		
		Animal[] arr = new Animal[3];
		
		arr[0] = c1;
		
		arr[1] = d1;
		arr[2] = new Dog("��������", "���� �Դ´�", "���������");
		System.out.println("========");
		for(Animal a : arr) {
			a.move();
			a.breath();
			a.eat();
		}
	}
}
