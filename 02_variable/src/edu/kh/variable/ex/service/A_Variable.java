package edu.kh.variable.ex.service;

public class A_Variable {

//	������ ������� �ʴ� ���
	public void example1() {
		System.out.println("���� ��� X");
		System.out.println(2*3.141592653589793*10);
		System.out.println(3.141592653589793*10*10);
		System.out.println(3.141592653589793*10*10*20);
		System.out.println(4*3.141592653589793*10*10);
	}
//	������ ����ϴ� ���
	public void example2() {
		double pi = 3.141592653589793;
		int radius = 5;
		int height = 20;
		System.out.println("\n���� ��� o");
		System.out.println(2*pi*radius);//���ǵѷ�
		System.out.println(pi*radius*radius);//���ǳ���
		System.out.println(pi*radius*radius*height);//������Ǻ���
		System.out.println("\n\n\n");
		System.out.println(4*pi*radius*radius);//���ǰѳ���
		
		
		
	}
//	��������(�ʱ�ȭ����)
	public void example3() {
//		��������:�޸𸮰����� �����͸� ������ �� �ִ� ������ �Ҵ� �ϴ� ��.
//		->����� ������ ������ ���� ������ �� �ִ� �������� ���¿� ũ�Ⱑ �޶���.
		
//		���� �ۼ��ǰų� ������ ���ԵǴ� �� ��ü�� ���ͷ��̶� ��
//		�ڷ������� ���ͷ� ǥ����̴ٸ�
//		���Կ�����(=)�� = �������� �����ʿ� �ִ°��� ���� ������ �����϶�� ������
		boolean isTrue;//1byte
		isTrue = true;//boolean �ڷ����� ǥ����� true/false
		
		byte byteNumber;//1byte
		byteNumber = 1;
		
		short shortNumber;//2byte
		shortNumber = 2;
		
		int intNumber;//4byte �����⺻��
		intNumber = 4;
		long longNumber;//8byte
		longNumber = 8L;
		float floatNumber; //4byte
		floatNumber = 1.23f;
		
		double doubleNumber; //8byte �Ǽ��⺻��
		doubleNumber = 3.14;
		
		char ch;//2byte(�ڹ�),�����ϳ�
		ch = 'a'; //''Ȧ����ǥ ��ȣ�� char �ڷ����� ���ͷ� ǥ���
		String str;//4byte �⺻�ڷ���x
		str = "���ڿ�";//""�ֵ���ǥ ��ȣ�� string �ڷ����� ���ͷ� ǥ���

		System.out.println(isTrue);
		System.out.println(byteNumber);
		System.out.println(shortNumber);
		System.out.println(intNumber);
		System.out.println(longNumber);
		System.out.println(floatNumber);
		System.out.println(doubleNumber);
		System.out.println(ch);
		System.out.println(str);
	}
		
	public void example4() {
		int age = 28;//���� ����� ���ÿ� �ʱ�ȭ
		final int AGE = 28;//��� ����� ���ÿ� �ʱ�ȭ
//		final ����� :�������̶�� �ǹ̸� ���� �����
		
		age = 29;
//		AGE = 29; ����� �� ������ �Ұ����Ͽ� ������ �߻�
		
		final double PI = 3.141592;
		
	}
	public void example5() {
		String name = "�ֱ���";//��������� �ʱ�ȭ
		int age = 28;
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
		name = "ȫ�浿";
		age = 20;
		System.out.println(name+"���� ���̴� "+age+"�� �Դϴ�.");
//		���ڿ��� �ٸ� �ڷ��� ���̿� + ��ȣ�� �̾�⸦ �ǹ��Ѵ�.
		System.out.println(age+10+"123");
		System.out.println(age+"123"+10);
		System.out.println(age+"10");
		
//		���� ���ڿ��� ȥ�յǴ� ��� ��Ģ���� ������ �°� ���
	}
	
}
