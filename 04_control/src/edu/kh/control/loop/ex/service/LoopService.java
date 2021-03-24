package edu.kh.control.loop.ex.service;

import java.util.Scanner;

public class LoopService {

//	for��
//	for(�ʱ��; ���ǽ�; ������){
//	�ݺ� ������ �ڵ�
//	}
//	
//	�ʱ�� : for�� ������ �ݺ��� �����ϱ� ���ػ���ϴ� ������ �ۼ��ϴ� �κ�
//	���ǽ� : for���� �ݺ� ���θ� �����ϴ� �κ�
//	������ : �ʱ�Ŀ� �ۼ��� ������ for���� ������ �� ���� ���� �Ǵ� ���� ��Ű�� �κ�
//	
//	1.�ʱ�Ŀ� �ۼ��� ���� ����(int i)
//	2.�ۼ��� ������ ���� ���ǽĿ� ���������� true���� Ȯ��
//	3.(���ǽ��� true�� ���) for�� ���� �ڵ带 1ȸ ����
//	4.������ 1ȸ ���� (i++)
//	5.���������� ��ȭ�� �� i�� ���ǽĿ� ����
//	->true�� ��� 2~5�� �ݺ�, false�� ��� ����
	public void example1() {
		
		for (int i =1; i <= 10; i++) {
			System.out.println(i+ "���");
		}
	}
	    
	public void example2() {
		for (int i = 5; i>0; i--) {
			System.out.println(i+"��°");
		}
	}
	public void example3() {
		for (int i=1; i<21; i+=2) {
			System.out.print(i+" ");
		}
	}
	public void example4() {
		for (double i=1; i<11; i+=0.5) {
			
			System.out.print(i+" ");
		}
	}
	public void example5() {
		for (char ch = 'A'; ch<='Z'; ch++) {
			System.out.print(ch + " ");
		}
	}
	public void example6() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i=1; i<=5; i++) {
			System.out.print("�Է�"+i+" : " );
			sum += sc.nextInt();
			
		}
		
		System.out.printf("���: %.1f \n", sum/5.0 );
		
		
	}
	public void challenge1() {
//		2~9���� ������ �Է¹޾� �Է¹��� ���� ���������
		
		Scanner sc = new Scanner(System.in);
		System.out.print("2~9���� ���� �Է� : ");
		int num = sc.nextInt();
		if(num<10 && num>1) {
		for(int i = 1 ; i < 10 ; i++) {
			System.out.println(num+"x"+i +" = " + num*i);
		    }
		}	else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
			}
		
	}
	public void example7() {
//		java.lang.Math - ���а� ���õ� ����� �����ϴ� Ŭ����
//		(java.lang ��Ű���� ������ �� �ڵ����� import �ȴ�)
//		Math.random() �޼ҵ� - ������ �߻���Ű�� ��� (0.0 <= ���� < 1.0)
		for(int i = 1; i<11; i++) {
		int random =(int) (Math.random()*10+1);
		System.out.println(random);
		}
	}
	
	public void example8() {
		int sum = 0;
		for(int i = 1; i<6; i++) {
			int random =(int) (Math.random()*20+1);
			System.out.println(random);
			sum += random;
		}
		System.out.println("�հ�" + sum);
	}
	public void example9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("���� �Է� : ");
		int num2 = sc.nextInt();
		
		int sum = 0;
	
		if(num1<num2) {
			for(int i= num1; i<=num2; i++) {
				sum+=i;
			}
		System.out.println("�հ�" + sum);
		}else {
			System.out.println("�Է�1�� �Է�2�� ���ų� �۽��ϴ�");
		}
	
	}
	public void example10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		String in1 = sc.next();
		sc.nextLine();
		System.out.print("�Է� : ");
		String in2 = sc.nextLine();
		
		if(in1.equals(in2)) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ�");
		}
	}
	public void example11() {
		for(int min = 0; min < 60; min++) {
			
			for(int sec = 0; sec < 60; sec ++) {
			System.out.printf("%02d�� %02d��\n",min,sec);	
			}
		}

	
	}
	public void example12() {
		for(int i = 0; i < 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public void example13() {
		for(int i = 0; i<3; i++) {
			for(int j = 5; j>=1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public void example14() {
		for(int i=2; i<10; i++) {
			System.out.println("======"+i+"��======");
			for(int j = 1; j<10; j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
	    }
	}
	public void example15() {
		for(int i=9; i>1; i--) {
			System.out.println("======"+i+"��======");
			for(int j = 9; j>0; j--) {
				System.out.println(i+"x"+j+"="+i*j);
			}
	    }
		
		
	}
	public void example16() {
		for(int i = 1; i<=4; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public void example17() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� : ");
		int num = sc.nextInt();	
		for(int i = 1; i<=num; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}	
	}
	
//	while��
//	while(���ǽ�){
//	���ǽ��� true�� ��� ������ �ڵ�
//	}
//
////	for��     : �ʱ�Ŀ��� ����� ������ �̿��Ͽ� �ݺ��� ���� �Ҽ� ����
////	while��: ������ �ʱ���� �������� �ʾƵ� �ǰ� �ݺ� ���� ������ �����Ӱ� ���� ����
	public void example18() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		int input = 0;
		while(input != 9) {
		System.out.println("----------");
		System.out.println("1.��ȸ");
		System.out.println("2.�ۼ�");
		System.out.println("3.����");
		System.out.println("4.����");
		System.out.println("9.����");

		System.out.print("����>> ");
		input = sc.nextInt();
		
		}
		System.out.println("���α׷� ����");
	}
	public void example19() {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int input = -1;
		
		while(input != 0) {
		
			System.out.print("�����Է� : ");
			input = sc.nextInt();
			sum += input;	
		}
	 System.out.println("�հ� : "+sum);
	}
//	do ~ while��
//	do{�ۼ����ڵ� �ѹ��� ������ ����}
//	do {
//		�ݺ��������ڵ��ۼ�
//	}while(���ǽ�);
	public void example20() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int input = 0;
		do {
			System.out.println("�Է� : ");
			input = sc.nextInt();
			sum += input;
		}while(input != 0);
		System.out.println("�հ�: "+ sum);
	}


}
