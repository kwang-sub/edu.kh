package edu.kh.control.condition.ex.service;

import java.util.Scanner;

public class ConditionService {

//	���
//	 ���α׷��� �帧�� �ٲٴ� (�����ϴ�) ������ �ϴ� �ڵ�
	
//	���ǹ�
//	 ����� �ϳ��� ���ǿ� ���� �ٸ� ����(�ڵ�)�� ����ǵ��� �ϴ� �ڵ�
	
//	if�� ����
	public void example1() {
//		�ܵ� if��
//		if(���ǽ�) {
//		���ǽ��� ture�ϰ�� ������ �ڵ�
//		}
//
//		
//		if - else
//		if(���ǽ�) {
//			���ǽ��� ture�ϰ�� ������ �ڵ�
//		}else{
//			���ǽ��� false�ϰ�� ������ �ڵ�
//		}	
//		
//		
//		if - else if - else ��
//		 ������ �ټ��� ��� ����ϴ� ���ǹ�
//		if(���ǽ�1){
//		���ǽ� 1�� true�� ��� ����
//		}else if (���ǽ�2){
//		���ǽ�2�� true�� ��� ����
//	 	}else{
//		�ռ� ���ǽ��� ��� �������� ���ϴ� ��� ����
//		}
		
//		�Է¹��� ������ ������� �ƴ��� Ȯ��
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int input = sc.nextInt();
		if(input>0) {
			System.out.println("����Դϴ�.");
		}else {
			System.out.println("����� �ƴϴ�.");
		}
		
//		if(input <= 0) {
//			System.out.println("����� �ƴϴ�");
//		}
		
	}
	public void example2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		int input = sc.nextInt();
		if(input%2==0) {
			System.out.println("¦���Դϴ�.");
		}else {
			System.out.println("Ȧ���Դϴ�.");
	    }
	}
	public void example3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�1 : ");
		int num1 = sc.nextInt();
		System.out.print("���� �Է�2 : ");
		int num2 = sc.nextInt();
		if(num1>num2) {
			System.out.println(num1 + "�� " + num2+"���� ũ��");
		}else {
			System.out.println(num1 + "�� " + num2 + "���� �۰ų� ����");
		}
		
		
	}
		
	public void example4() {
//		�Է� ���� ������ ��� , ���� , 0 �� � ������ Ȯ��
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�: ");
		int input = sc.nextInt();
		
		if(input > 0) {
			System.out.println("���");
		}else if(input < 0){
			System.out.println("����");
		}else {
			System.out.println("0");
		}
	}
	public void example5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12���� ���ڸ� �Է����ּ���: ");
		int month = sc.nextInt();
		
		String result = null;//�Ʒ� if���� ���� ������ ��� ������ ������ ��������
		
		if(month >= 3 && month <= 5) {
			result = "��";
		}else if(month >= 6 && month <= 8) {
			result = "����";
		}else if(month >= 9 && month <= 11) {
			result = "����";
		}else if(month == 12 || month == 1 ||month == 2 ){
			result = "�ܿ�";
		}else {
			result = "�߸� �Է��ϼ̽��ϴ�.";
		}
			System.out.println(result);
		
		
	
	}

	public void example6() {
//		���̸� �Է¹޾�
//		13���ϴ� ���, 19�� ���ϴ� û�ҳ�, 19�� �ʰ��� �������� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�: ");
		
		int age = sc.nextInt();
		
		String result = null;
		
		if(age <= 13) {
			result = "���";
		}else if(age <= 19) {
			result = "û�ҳ�";
		}else {
			result = "����";
		}
		System.out.println(result);
		
	}
	public void example7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�: ");
		
		int age = sc.nextInt();
		String result = null;
		
		if(age > 0) {
			if(age <= 13) {
				result = "���";
			}else if (age <= 19) {
				result = "û�ҳ�";
			}else {
				result = "����";
			}
			
			
		}else  {
		result 	= "�߸� �Է��ϼ̽��ϴ�.";
		}
		System.out.println(result);
	}
//	switch��
//	�� �ϳ��� ���� ����� ���� ó���� ��� ���
//	���� ��� ���� ��ġ�ϴ� case���� ����
//	switch(��){
//	case �����1:�����ڵ� 1; break;
//	case �����2:�����ڵ� 2; break;
//	case �����3:�����ڵ� 3; break;
//	}
//	switch������ case�� ���̿� break�� �������� ������ ���� case���� ������
	
	public void example8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int input = sc.nextInt();
		String result = null;
//		if(input == 1) {
//			result = "������";
//		}else if(input == 2) {
//			result = "��Ȳ��";
//		}else if (input == 3) {
//			result = "�����";
//		}else {
//			result = "�߸� �Է��ϼ̽��ϴ�";
//		}
		switch(input) {
		case 1 : result = "������"; break; 
		case 2 : result = "��Ȳ��"; break; 
		case 3 : result = "�����"; break; 
		default : result = "�߸� �Է��ϼ̽��ϴ�.";
		}
		System.out.println(result);
	}
	public void example9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12���� ���ڸ� �Է����ּ���: ");
		int month = sc.nextInt();
		
		String result = null;
		
		switch(month){
		
		case 3 : case 4 :case 5 : result = "��";break;
		case 6 : case 7 :case 8 : result = "����";break;
		case 9 : case 10 :case 11 : result = "����";break;
		case 12 : case 1 :case 2 : result = "�ܿ�";break;
		default : result = "�߸��Է��Ͽ����ϴ�.";
		}
		System.out.println(result);
	}
	public void example10 () {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�1 : ");
		int num1 = sc.nextInt();
		System.out.print("���� �Է�2 : ");
		int num2 = sc.nextInt();
		System.out.print("������ : ");
		char op = sc.next().charAt(0);
		int result = 0;
		switch(op) {
		case '-' : result = num1 - num2;break;
		case '+' : result = num1 + num2;break;
		case '*' : result = num1 * num2;break;
		case '/' : result = num1 / num2;break;
		case '%' : result = num1 % num2;break;
		}
		System.out.printf("%d %c %d = %d \n",num1, op, num2, result);
		
		
				
	}
	
	
}
