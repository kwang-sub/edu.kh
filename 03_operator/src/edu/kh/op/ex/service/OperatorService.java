package edu.kh.op.ex.service;

public class OperatorService {
	
//	�� ���� ������(!)�� ������ �ݴ�� �ٲٴ� ������
	public void example1() {
		System.out.println(true);
		System.out.println();
		
		boolean isTrue = true;
		System.out.println("isTrue: "+isTrue);
		System.out.println("isTrue: "+!isTrue);
	}
	
//	����������(++,--)�� �ǿ����ڸ� 1���� �Ǵ� ���� ��Ű�� ������
	public void example2() {
		int num = 10;
		num++;
		System.out.println("num: " + num);
//		���������� ���� 1�� ������Ų�� �ٸ� ���� ����
		int a1 = 10;
		int b1 = ++a1;
		System.out.println(a1+"/"+b1);
//		���������� �ٸ� ���� ������ 1�� ������Ŵ
		int a2 = 10;
		int b2 = a2++;
		System.out.println(a2+"/"+b2);
		int a3=3;
		int b3 = 5;
		int c3 = a3++ + --b3;
		System.out.println(a3);
		System.out.println(b3);
		System.out.println(c3);
	}
	public void example3() {
		int num1 = 5;
		int num2 = 2;
		System.out.println("��: " + (double)num1/num2);
		System.out.println("������: "+num1%num2);
	}
	public void example4() {
//		a == b : a��b�� ����.
//		a != b : a��b�� ���� �ʴ�.
//		a > b  : a��b���� ũ��.
//		a < b  : a��b���� �۴�.
//		a >= b : a��b���� ũ�ų� ����.
//		a <= b : a��b���� �۰ų� ����.
//		�� �������� ���� ����� ������ true �Ǵ� false �̴�.
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		System.out.println(!(num1 == num2));
		System.out.println((num1 == num2) == true);
	
		System.out.println("\n-------------------\n");
		
		System.out.println(num1 > num2);
		System.out.println(num1 > (num2 - num1));
		System.out.println((num1 > num2) != (num2 >= num1));
		
		System.out.println("\n-------------------\n");
		
//		% == �Ǵ� != �� �̿��ؼ� ¦��,Ȧ��,��� �Ǻ�
		int a = 5;
		System.out.println("a�� ¦���ΰ�?" + (a%2 == 0));
		System.out.println("a�� ¦���ΰ�?" + (a%2 != 1));
		
		System.out.println("a�� Ȧ���ΰ�? " + (a%2 == 1));
		System.out.println("a�� Ȧ���ΰ�? " + (a%2 != 0));
	
		System.out.println("a�� 5�� ����ΰ�?" + (a%5 == 0));
		
		
	}
	
}
