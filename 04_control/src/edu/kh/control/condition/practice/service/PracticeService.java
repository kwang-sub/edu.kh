package edu.kh.control.condition.practice.service;

import java.util.Scanner;

public class PracticeService {
	public void practice1() {
		
		System.out.println("1.�Է�");
		System.out.println("2.����");
		System.out.println("3.��ȸ");
		System.out.println("4.����");
		System.out.println("7.����");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		int num = sc.nextInt();
		String result = null;
	switch(num){
		case 1 : result = "�Է� �޴��Դϴ�"; break;
		case 2 : result = "���� �޴��Դϴ�"; break;
		case 3 : result = "��ȸ �޴��Դϴ�"; break;
		case 4 : result = "���� �޴��Դϴ�"; break;
		case 5 : result = "���� �޴��Դϴ�"; break;
	}
		System.out.println(result);
	}


	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Ѱ� �Է��ϼ��� : ");
		int num =sc.nextInt();
		
		if(num%2==1 && num >-1) {
			System.out.println("Ȧ���Դϴ�.");
		}else if(num%2==0  && num >-1) {
			System.out.println("¦���Դϴ�.");
		}else {
			System.out.println("����� �Է��ϼ���");
		}
	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������� : ");
		int ko = sc.nextInt();
		
		System.out.print("�������� : ");
		int ma = sc.nextInt();
		
		System.out.print("�������� : ");
		int en = sc.nextInt();
		
		int sum = ko+en+ma;
		int avg =sum/3;
		
		if(ko>=40 && ma>=40 && en>=40 && avg >= 60 ) {
			System.out.println("���� : "+ko);
			System.out.println("���� : "+ma);
			System.out.println("���� : "+en);
			System.out.println("�հ� : "+sum);
			System.out.println("��� : "+sum/3);
			System.out.println("�����մϴ�, �հ��Դϴ�!");
		}else {
			System.out.println("���հ��Դϴ�.");
		}
	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 ������ ���� �Է� : ");
		int num = sc.nextInt();
		
		int day = 0;
		
		if(num>0 && num<13) {
		switch(num) {
		case 1 : case 3 : case 5 : case 7 : case 10 : case  12 : day = 31;break;
		case 4 : case 6 : case 8 : case 9 : case 11 : day = 30;break;
		case 2 : day = 28;break;
		
		}
		System.out.println(num + "���� " + day + "�� ���� �ֽ��ϴ�.");
		}else {
			System.out.println(num +"���� �߸� �Էµ� ���Դϴ�.");
		}
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
		double ht = sc.nextDouble();
		
		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		double wt = sc.nextDouble();
		
		double bmi = wt / (ht*ht);
		System.out.println(" BMI ����: " + bmi);
		if (bmi<18.5) {
			System.out.println("��ü��");
		}else if (bmi<23) {
			System.out.println("����ü��");
		}else if(bmi<25) {
			System.out.println("��ü��");
		}else if(bmi<30) {
			System.out.println("��");
		}else {
			System.out.println("�� ��");
		}
	
	
	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�߰� ��� ���� : ");
		double num1 = sc.nextDouble();
		
		System.out.print("�⸻ ��� ���� : ");
		double num2 = sc.nextDouble();
		
		System.out.print("���� ���� : ");
		double num3 = sc.nextDouble();
		
		System.out.print("�⼮ ȸ�� : ");
		double num4 = sc.nextDouble();
		
		
		
		System.out.println("========= ��� ========");
		double me = num1 * 0.2;
		double fi = num2*0.3;
		double cl = num3*0.3;
		double sum = me+fi+cl+num4;
		
		
		if(num4 < 15) {
			System.out.println("Fail [�⼮ ȸ�� ����("+num4+"/20)]");
		}
		else if(sum <70 ) {
			System.out.println("�߰� ��� ���� (20) : " + me);
			System.out.println("�⸻ ��� ���� (30): "+ fi);
			System.out.println("���� ����            (30) : "+ cl);
			System.out.println("�⼮���� :   (20) : "+ num4);
			System.out.println("���� : "+ sum);
			System.out.println("Fail [���� �̴�]");
		}else {
			System.out.println("�߰� ��� ���� (20) : " + me);
			System.out.println("�⸻ ��� ���� (30): "+ fi);
			System.out.println("���� ����            (30) : "+ cl);
			System.out.println("�⼮���� :   (20) : "+ num4);
			System.out.println("���� : "+ sum);
			System.out.println("PASS");
		}
		
	}
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ǿ�����1 �Է�  : ");
		int num1 = sc.nextInt();
		
		System.out.print("������ �Է�(+,-,*,/,%) : ");
		char ch = sc.next().charAt(0);
		
		System.out.print("�ǿ�����2 �Է�  : ");
		int num2 = sc.nextInt();
		
		double result = 0;
		String str = null;
		
		if(num1 == 0) {
			switch(ch) {
			case '+' : str = "���� �� �����ϴ�";break;
			case '-' : str = "�� �� �����ϴ�";break;
			case '*' : str = "���� �� �����ϴ�";break;
			case '/' : str = "���� �� �����ϴ�";break;
			case '%' : str = "������ ���� ���� �� �����ϴ�. ";break;
			}
			System.out.println("0�� "+str);
		}else if(!(ch == '+' || ch == '-'|| ch == '*'|| ch == '/'|| ch == '%') ) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			
		}else {
			switch(ch) {
			case '+' : result = num1+num2;break;
			case '-' : result = num1-num2;break;
			case '*' : result = num1*num2;break;
			case '/' : result = num1/(double)num2;break;
			case '%' : result = num1%num2;break;
			}
			System.out.printf("%d %c %d = %.6f",num1,ch,num2,result);
		}
		
	}




}








