package edu.kh.variable.practice1.service;

import java.util.Scanner;

public class VariablePractice1 {
//	�ǽ�����1
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ���: ");
		String inputName = sc.next();
		System.out.print("������ �Է��ϼ���(����/����): ");
		String inputGender = sc.next();
		System.out.print("���̸� �Է��ϼ���: ");
		int inputAge= sc.nextInt();
		System.out.print("Ű�� �Է��ϼ���(cm): ");
		double hight = sc.nextDouble();
		
		System.out.println("Ű"+hight+"cm�� "+inputAge+"�� "+inputGender+
				" "+inputName+"�� �ݰ����ϴ�^^");
		
		
	}
	
	
//	�ǽ�����2
	
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ����: ");
		int one = sc.nextInt();
		System.out.print("�� ��° ����: ");
		int two = sc.nextInt();
		System.out.println("\n");
		System.out.println("���ϱ� ���: "+(one+two));
		System.out.println("���� ���: "+(one-two));
		System.out.println("���ϱ� ���: "+one*two);
		System.out.println("������ �� ���: "+one/two);
		
	}
	
	
//	�ǽ�����3
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����: ");
		double a = sc.nextDouble();
		System.out.print("����: ");
		double b = sc.nextDouble();
		System.out.println("\n");
		System.out.println("����:"+a*b);
		System.out.println("�ѷ�: "+(a+b)*2);
		
	}
}
