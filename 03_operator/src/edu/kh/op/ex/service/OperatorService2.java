package edu.kh.op.ex.service;

import java.util.Scanner;

public class OperatorService2 {
	
//	��������
	public void example1() {
//		�� �� �� ���� ���ϴ� ������
//		&&(and) : �� �� �� ���� ��� true�� ���� true�� ��ȯ
//		-> true && true == true
		
//		||(or) : �� �� �� ���� ���  false�� ���� false�� ��ȯ(true�� �ϳ��� ������ true)
//		-> false || false == false
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է�: ");
		int input = sc.nextInt();
		
		boolean result = (input>0 && input<101);
		
		System.out.println("�Է¹��� ������ 1~100���� �����ΰ�? :" + result);
	}

	public void example2() {
		
//		�Է¹��� ���ĺ��� �빮�� A~Z ������ �������� Ȯ���ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���ĺ� �ϳ� �Է�: ");
		char a = sc.next().charAt(0); 
		
		boolean result = (a >= 'A' && a <= 'Z');
		System.out.println("�Է¹��� ���ĺ��� A~Z ���̰� �´°�?" + result);
		
	}
	
	public void example3() {
//		�Է¹��� ������ 0 �̸� �Ǵ� 100 �ʰ����� Ȯ��
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		boolean result = (input < 0 || input >100);
		System.out.println("�Է¹��� ���� 0�̸� �Ǵ� 100 �ʰ��ΰ�?" + result);
	}
//	public void example4() {
//		�Է¹��� ������ 0 �̸� �Ǵ� 100 �ʰ����� Ȯ��
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���� �Է� : ");
//		int input = sc.nextInt();
//		
//		boolean result = !(input >= 0 && input <=100);
//		System.out.println("�Է¹��� ���� 0�̸� �Ǵ� 100 �ʰ��ΰ�?" + result);
//	}
// 	�Է¹��� ���� �ϳ��� 'y'���� Ȯ��(��ҹ��� ����x)
	public void example4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����ϳ��Է�: ");
		char input = sc.next().charAt(0);
		
		boolean result = input == 'y' || input == 'Y';
		System.out.println(result);
		
		
	}	
	public void example5() {
		int num = 10;
		num = num + 10;
		
		int num2 = 10;
		num2+= 10;
	}
	public void example6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int input = sc.nextInt();
		String result = input>0 ? "���":"����";
		System.out.println(input+ "��/�� "+ result+"�̴�");
	}
	
	public void example7() {
	Scanner sc = new Scanner(System.in);
	System.out.print("���� �ϳ� �Է� : ");
	int input = sc.nextInt();
	char result = input>0 ? '+':(input == 0 ? '0':'-');
			System.out.println(input+ "��/�� "+ result+"�̴�");
	}
	public void example8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹε�Ϲ�ȣ�� �Է����ּ���( - �������� �ۼ�):");
		char input = sc.next().charAt(7);
		String result = input == '1' ||input == '3'  ? "�����Դϴ�" : (input == '2' || input == '4' ? "�����Դϴ�":"�߸��Է��ϼ̽��ϴ�");  
			System.out.println(result);
	}
	
		
	
	
	
}
