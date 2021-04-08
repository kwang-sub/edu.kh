package edu.kh.poly.ex.model.service;

import edu.kh.poly.ex.model.vo.Car;
import edu.kh.poly.ex.model.vo.ModelX;
import edu.kh.poly.ex.model.vo.Porter;
import edu.kh.poly.ex.model.vo.Spark;

public class PolymorphismService {
	
//	��ĳ���� : �θ�Ÿ�� ���� ������ �ڽ� ��ü �ּҸ� ����
//	
//	�ٿ�ĳ���� : �θ� Ÿ���� ���� ������ �ڽ� Ÿ������ ����ȯ�Ͽ� �ڽ� ��ü�� ������ ������
	public void example1() {
	
		Car c = new Car();
//		�θ� Ÿ�� ��������  = �θ� ��ü
//		�θ� Ÿ�� ���� ������ �θ� ��ü�� �޼ҵ带 ������ �� �ִ�.
		c.setEngine("��������");
		c.setHandle("�����ڵ�");
		c.setWheel(4);
		
		Porter p = new Porter();
//		�ڽ� Ÿ�� �������� = ���� ��ü
		p.setEngine("��쿣��");
		p.setHandle("ũ�� ���׶� �ڵ�");
		p.setWheel(8);
		p.setWeight(4.5);
		p.setBay("ū ��ĭ");
		
//		������ ���� 
//		�θ� Ÿ�� �������� = �ڽ� Ÿ�� ��ü
		Car c2 = new Porter();
//		�θ� Ÿ���� ���� ������ �ڽ� ��ü�� �����ϰ� �־ ��� ���� �θ� �κи� ���� �����ϴ�.
		c2.setEngine("��������");
		c2.setHandle("ũ�� ���׶� �ڵ�");
		c2.setWheel(8);
		
		System.out.println(c2.getEngine());
		System.out.println(c2.getHandle());
		System.out.println(c2.getWheel());
		System.out.println(c2);
		
		Car c3 = new Spark();
		Car c4 = new ModelX();
	}
	public void example2() {
		Car c =  new Spark("�ֹ�������", 4, "���� �ڵ�", "����");
		
		Car c3 =  new Porter("��������", 12, "��û ū �ڵ�", 11, "¯ŭ");
		
		System.out.println(c.getEngine());
		System.out.println(c.getWheel());
		System.out.println(c.getHandle());
		
//		System.out.println(c.getColor());
//		������ �ڽ� ����̹Ƿ� �θ� ���� �����δ� ���Ұ�
		
		System.out.println(((Spark)c).getColor());
//		Car Ÿ�� ���� ���� c3�� �ڽ��� Porter Ÿ�� ���� ������ �ٿ� ĳ�����Ͽ� c3�� ����� �ּҸ� Poter��
		Porter p = (Porter)c3;
		System.out.println("====p====");
		System.out.println(p.getEngine());
		System.out.println(p.getHandle());
		System.out.println(p.getWheel());
		System.out.println(p.getWeight());
		System.out.println(p.getBay());
		
	}
	public void example3() {
		
//		��ü�迭�� ������
//		�迭 : ���� �ڷ����� �ϳ��� �������� �ٷ�� ��
//		��ü �迭 : ��ü ���� ���� ���� ���� �ϳ��� �������� �ٷ�� ��
//		Porter[] porters = new Porter[5];
//		Spark[] sparks = new Spark[10];
		
//		�ڵ��� ���� ���α׷�
		Car[] carArr = new Car[5];
//		Car ���� ���� 5ĭ ¥�� �迭�� Heap�� �����ؼ� �ش� �ּҸ� Car�迭 �������� carArr�� �����Ͽ� �����ϰ���.
		
		carArr[0] = new Porter("��������", 4, "�����ڵ�", 1, "����");
		carArr[1] = new Spark("��������", 5, "�����ڵ�", "��Ʈ��");
		carArr[2] = new ModelX("ū����", 7, "ū�ڵ�", "�̿�����");
		carArr[3] = new Car("�𸣴¿���", 5, "�𸣴��ڵ�");
		carArr[4] = new Spark("��������", 5, "�����ڵ�", "���");
		
//		carArr �� �迭 ��Ұ� �����ϴ� ��ü ���� ��� ���
//		System.out.println(((Porter)carArr[0]).toString());
//		carArr[]�� car ���� �����̰� �����ϰ� �ִ� ��ü�� Porter�̴�
//		���� ���ϴ� �� : Porter�� �������̵��� toString() ȣ��
		System.out.println(((Spark)carArr[1]).toString());
		System.out.println(((ModelX)carArr[2]).toString());
		System.out.println(carArr[3].toString());
		System.out.println(carArr[4].toString());
		carArr[0].toString();
//		==�������ε� : ���α׷� ���� �� ������ �ܰ迡�� �޼ҵ�� �޼ҵ� ȣ��θ� ����
//		carArr[0]�� Car �������� �̹Ƿ� CarŬ������ toString() �޼ҵ带 ȣ���Ѵ�.
//		CarŬ������ toString() �޼ҵ��carArr[0].toString()�� �����.
		
//		==�������ε� : ���α׷� ���� �� ���� ���ε��� �޼ҵ带 �����ϴ� ���� �ƴ� �����ϴ� ��ü�� �������̵��� �޼ҵ�� �����Ͽ� �����ϴ� ���̴�.
//		���� �ڵ� ���� ��
//		carArr[0].toString() ������ Car Ŭ������ toString() �ƴ϶� �������̵� �� Porter Ŭ������ toString()�� ȣ���ϰ� ��.
		System.out.println("==============");
		for(int i = 0;  i <carArr.length; i++) {
			System.out.println(carArr[i].toString());
		}
		System.out.println("=============");
		for(Car car:carArr) {
			System.out.println(car);
		}
		System.out.println("=============");
		for(Car car:carArr) System.out.println(car);
	
		
	}
//	�Ű������� ������ ����
//	�Ű������� Ÿ���� �޸��ϴ� �޼ҵ带 �ۼ��� �ʿ䰡 ���ٴ� ������ �ִ�.(�ڵ� ���� ����, ���뼺)
	public void example4() {
		ModelX m1 = new ModelX("����", 6, "��������", "��������");
		Porter p1 = new Porter("����", 20, "ū", 20, "ū");
		Spark s1 = new Spark("����", 4, "����", "�ʷ�");
		Car c1 = new Car("���� 6����", 4, "����");
		printCar(m1);
		printCar(p1);
		printCar(s1);
		printCar(c1);
		
//		Car ��ü Ÿ���� �ּҸ� �����ϰų� Car�� ��� ���迡 �ִ� ��ü Ÿ���� �ּҸ� �����ؾ� �Ѵ�.(������ (��ĳ����))
	}
	public void printCar(Car car) {
//		(Car car) : Car Ÿ�� ��ü �ּҸ� ���� �޴� �Ű����� ,Car Ÿ�� ���� ���� , Porter, Spark, ModelX�� �θ�Ÿ�� ���� ����
		
//		instanceof ������
//		1. ���������� �����ϴ� ��ü�� Ư�� �ڷ��� ��ü�� �´°�
//		2. ���������� �����ϴ� ��ü�� Ư�� �ڷ����� ��� �޾Ҵ°�
//		   -> true == Ư�� �ڷ�������  ��ĳ����, �ٿ�ĳ������ ������ ����
		if(car instanceof Porter) { 
			Porter p = (Porter)car;
			System.out.printf("%s������ ����ϴ� %.1f�� ���ʹ� %s��ĭ�� %d���� ����, %s�ڵ��� ����Ѵ�.\n",
	                  p.getEngine(), p.getWeight(), p.getBay(), p.getWheel(), p.getHandle());
		}else if(car instanceof Spark) {
			Spark s = (Spark) car;
			System.out.printf("%s�� ����ũ�� %s������ ����ؼ� ���� ����.\n", s.getColor(), s.getEngine());
		}else if(car instanceof ModelX) {
			ModelX m = (ModelX)car;
			System.out.printf("�׽��󿡼� ���� ModelX�� %s���͸���, %s������ ����Ѵ�. \n",m.getBattery(),m.getEngine());
		}else if (car instanceof Car) {
			System.out.printf("������ ������ %s����, ����%d��, %s�ڵ��� �ִ�.\n", car.getEngine(), car.getWheel(), car.getHandle());
		}
	}
	public Car searchCar(Car c) {
//		Car[] ��ü�迭 3ĭ�� �����ؼ� �� �ε����� Porter, Car, Spark ��ü�� �ʱ�ȭ
//		���޹��� c�� Ÿ���� ���� ��ü�� Car[] ��ü �迭�� �����ϸ� �ش� ��ü�� ��ȯ ������ null�� ��ȯ
		Car[] carArr = new Car[3];
		carArr[0] = new Porter("����", 8, "��", 5, "��");
		carArr[1] = new Car("����", 4, "����");
		carArr[2] = new Spark("����", 4, "����", "����");
		if(c instanceof Porter) {
			
			return carArr[0];
		
		}else if (c instanceof Spark) {
			
			return carArr[2];
		
		}else if(c instanceof ModelX) {
			
			return null;	
		
		}else if(c instanceof Car){
			return carArr[1];
		}
//		���� ���� c�� �ƹ��͵� �������� �ʴ� null�� ��� 
		return null;
		
	}
	public void example5() {
		Porter p1 = new Porter();
		System.out.println(searchCar(p1));
		System.out.println(searchCar(new Spark()));
		System.out.println(searchCar(new Car()));
		System.out.println(searchCar(null));
		
		Car c1 = searchCar(new Spark());
		System.out.println("c1 : " +c1);
	}
	
}
