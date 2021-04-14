package edu.kh.eh.model.service;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.imageio.IIOException;
import javax.security.sasl.SaslException;

import edu.kh.eh.model.exception.SonjeolException;

public class ExceptionService {
	
//	����(Exception) : �ҽ��ڵ� �������� �ذ� ������ ����(������ ����, ��Ÿ�� ����)
//	try : ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ带 ���ο� �ۼ��ؼ� �õ��Ѵ�.
//	catch :  try �������� ���ܰ� �߻��ϸ� ��Ƴ��� ó���Ѵ�.
//	finally : try-catch ���� �� �������� ������ �����ؾ� �ϴ� �ڵ带 �ۼ��Ѵ�.
//	java.lang.Exception : ��� ������ �ֻ��� �θ�
//	Exception e�� ��� ����ó���� ���� ��Ȳ���� �ٸ� ó���� �Ҽ� ���Եȴ�.
//	try���� ���� �߻� �� catch���� �ۼ� ������� ����Ǹ� Exception�� ��ü�� ��ӵǹǷ� �ֻ��� �θ��� Exception���� catch�� �ۼ��� ���߿� �ۼ��� catch�� ������ �ȵǹǷ� �ڽ�Ÿ���� Exception ������ �ۼ��Ѵ�.
//	throws : ���� �޼ҵ忡�� �߻��� ���ܸ� ȣ��η� �����ش�.
//	throw : ���� ���� �߻� ����
//	�ڽ��� �������̵� ��  ������ ó���� �� �ְų� �������� �ڵ尡 ���ܸ� �߻���Ű�� ������ throws�� �ۼ��� ���ܸ� ������ ���� �Ǵ� �ۼ����� ���� �� �ִ�.
//	CheckedException : �ݵ�� ����ó�� ������ �ۼ��ؾߵǴ� Exception �ҽ��ڵ� �Ǵ� if������ �ذ� �Ұ����ϱ� ������ ���� ó�� ������ ������ �ۼ��ؾ� �ȴ�. 
//	UnCheckedException : �ݵ�� ����ó�� ������ �ۼ����� �ʾƵ� �Ǵ� Exception RuntimeException�� �ڽ��� �ش�ȴ� �����ڰ� �ڵ� �ۼ��� �Ǵ� ����ڰ� ���α׷� �̿� �� �Ǽ��� ���� �߻��ϴ� ����(�ҽ��ڵ� �����Ǵ� if������ �ذ�)	
	public void example1() {
	Scanner sc = new Scanner(System.in);
	System.out.println("�� ������ �Է¹޾� ���� ���� ��� ");
	
	System.out.print("�����Է�1 : ");
	int num1 = sc.nextInt();
	
	System.out.print("�����Է�2 : ");
	int num2 = sc.nextInt();
	
		try {
			
		System.out.println(num1 + " / " + num2 + " = " + num1/num2 );
	//	       (�߻��� ���� ��ü�� ������ ���� ����)
		}catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
			
		}finally {
			System.out.println("��� ����.");
		}
	
	}
	public void example2() {
//		3ĭ¥�� int �迭�� �����Ͽ� �Է¹��� ������ ��� �迭 ��Ҹ� �ʱ�ȭ�ϰ� ������� ���
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		try {
			for(int i = 0; i<arr.length; i++) {
				System.out.print(i+"��° �ε��� ��� : ");
				arr[i] = sc.nextInt();
			}
			for(int i = 0; i<=arr.length; i++) {
				System.out.println(arr[i]);
			}
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ������ �ʰ��ؼ� ������ �� �����ϴ�.");
		}catch(InputMismatchException e) {
			System.out.println("������ �ƴ� ������ �ԷµǾ����ϴ�.");
		}
		
	}
	public void example3() {
//		try-catch �ߺ����
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		try {
			for(int i =0; i<arr.length; i++) {
				System.out.print(i + "��° �ε��� �Է� : ");
				try {
					
					arr[i] = sc.nextInt();
				}catch(InputMismatchException e) {
					System.out.println("������ �Է����ּ���.");
					sc.nextLine();
					i--; //
				}
			
			}
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ���� �ʰ��� ���α׷� ����.");
		}
		
	}
	public void example4() {
//		catch���� �ۼ��Ǵ� ���� Ŭ������ ��� ����
//		catch�� ������ �ۼ��ϴ� ��� ��� ���踦 ����ؾ� �Ѵ�.
//		�߻��ϴ� ���ܵ鵵 ����Ŭ������ �̿��� ������ ���� ��ü���̴�.
//		catch(������������) ������ �������������� ������ ���� ��ü�� �����Ѵ�.
//		���ܿ��� ��� ���谡 �ִ� == �θ�, �ڽİ��谡 �ִ�. == �������� ����ȴ�.
		String[] arr = new String[3];
		arr[0] = "���";
		arr[1] = "�ٳ���";
		try {
			for(int i=0; i<arr.length; i++) {
				System.out.println(arr[i].charAt(0));
			}
			
		}catch(NullPointerException e) {
			
		}catch(Exception e) {
			System.out.println("null�� ������ �� �����ϴ�.");
		}
	}
	public void example5() {
		Scanner sc = new Scanner(System.in);
		int sel = 0;
		do {
			try {
				System.out.println("[������ �޼ҵ� ���� (1,2)]");
				System.out.print("��ȣ �Է� : ");
				sel = sc.nextInt();
				
				switch(sel) {
				case 1: methodA();break;
				case 2: methodB();break;
				case 0:System.out.println("���α׷� ����"); break;
				default : System.out.println("�߸� �Է��ϼ˽��ϴ�.");
				}
			}catch(InputMismatchException e) {
				System.out.println("���� 1,2�� �Է����ּ���.");
				sc.nextLine();
				sel = -1;
			}catch(ArithmeticException e) {
				System.out.println("0���� ���� �� �����ϴ�.");
			}catch(Exception e ) {
				System.out.println("���� �𸣰����� ����ó����");
				e.printStackTrace();
			}
		}while(sel != 0);
	
	}
	
	public void methodA() throws ArithmeticException {
		
		System.out.println(2/0);
	}
	
	public void methodB() throws IOException {
		throw new IOException();
	}
	
	public void example6() {
//		CheckedException : �ݵ�� ����ó�� ������ �ۼ��ؾߵǴ� Exception
//		UnCheckedException : �ݵ�� ����ó�� ������ �ۼ����� �ʾƵ� �Ǵ� Exception

		
//		throw new RuntimeException();
//		����ó�� ������ �������� �ʾƼ� �������� �ȳ�Ÿ����.
		
//		throw new IOException();
//		������ �߻��� ���ɼ��� �ֱ� ������ ���� ó�� ������ �����ȴ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� 1 : ");
		int num1 = sc.nextInt();
		System.out.print("�Է� 2 : ");
		int num2 = sc.nextInt();
		if(num2 == 0) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}else {
			
			System.out.println(num1/num2);
		}
	}
	public void example7() {
//		����� ���� ���� : Java���� �����ϴ� Exception Class������ ó���� �� ���� ���ܸ� ����ڰ� �ʿ信 ���ؼ� ����� Exception Class
		
		double money = 1000000.0;
		int count = 0;
//		System.out.println(ran);
		try {
			
			for(int i = 0; i<10; i++) {
				int ran = (int)Math.round(Math.random());
				
				int sign = 0;
				if(ran == 1) {
					sign = +1;
				}else {
					sign = -1;
					count += 1;
					if(count == 3) {
						throw new SonjeolException();
					}
				}
				int ran2 = (int)(Math.random()*20+1);
				
				money = money + (money*(sign*(ran2/100.0)));
				System.out.println(money);
			}
		}catch(SonjeolException e){
			e.printStackTrace();
		}
	}
	
}
