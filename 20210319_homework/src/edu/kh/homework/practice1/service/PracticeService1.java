package edu.kh.homework.practice1.service;

import java.util.Scanner;

public class PracticeService1 {
	
	public void practice1() {
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;
		double dNum = 2.5;		
		char ch = 'A';
		
		System.out.println(iNum1/iNum2);
		System.out.println((int)dNum);
		
		System.out.println(iNum2*dNum);
		System.out.println((double)iNum1);
		
		System.out.println((double)iNum1/iNum2);
		System.out.println(dNum);
		
		System.out.println((int)fNum);
		System.out.println(iNum1 / (int)fNum);
		
		System.out.printf("%.7f",(iNum1/fNum));
		System.out.printf("%.16f",(double)iNum1/fNum);
//		Ʋ������ float������ǥ���ϸ� �Ҽ��� 8�ڸ����� ǥ����
//		double���� �Ҽ��� 16�ڸ�����
		
		System.out.println(ch);
		System.out.println((int)ch);
		System.out.println((int)ch+iNum1);
		System.out.println((char)(ch+iNum1));
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ο� ��: ");
		int people = sc.nextInt();
		
		System.out.print("���� ����: ");
		int candy = sc.nextInt();
		
		System.out.println();
		
		System.out.println("1�δ� ���� ���� : " + candy/people);
		System.out.println("���� ���� ���� : " + candy%people);
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸�: ");
		String name = sc.next();
		
		System.out.print("�г�(������): ");
		int year = sc.nextInt();
		
		System.out.print("��(������): ");
		int cl = sc.nextInt();
		
		System.out.print("��ȣ(������): ");
		int num = sc.nextInt();
		
		System.out.print("����(���л�/���л�): ");
		String sex = sc.next();
		
		System.out.print("����(�Ҽ��� �Ʒ� ��° �ڸ�����): ");
		double record = sc.nextDouble();
		
		System.out.println();
		
		System.out.printf("%d�г� %d�� %d�� %s %s�� ������ %.2f�̴�.",year, cl, num, name, sex, record);

	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int ko =sc.nextInt();
		
		System.out.print("���� : ");
		int en =sc.nextInt();
		
		System.out.print("���� : ");
		int ma =sc.nextInt();
		
		System.out.println();
		System.out.println("�հ� : "+(ko+en+ma));
		System.out.println("��� : "+(double)((ko+en+ma)/3.0));
	}
	
}
