package edu.kh.array.ex.service;

import java.util.Scanner;

public class ArrayService1 {
	public void example1() {
	//	1.�迭���� :int[] ���� ���� arr ����
		int[] arr;
		
		
		
	//	2.�迭 �Ҵ�
		arr = new int[4];
	//	heap ������ ���ο� int �ڷ��� ���� 4ĭ�� �Ҵ�
	//	���� ������ int[]�� �����ּҸ� arr ���������� ���� arr������ �ڷ����� int[]�� ���� ������ int[]�� �ڷ����� ��ġ�� ->���Կ��� ����
	
	//	3.�迭 �ʱ�ȭ & �����
		arr[0] = 1;
		arr[1] = 10;
		arr[2] = 5;
		System.out.println("arr[0] : "+arr[0]);
		System.out.println("arr[1] : "+arr[1]);
		System.out.println("arr[2] : "+arr[2]);
		System.out.println("arr[3] : "+arr[3]);
		System.out.println(arr);
		for(int i=0; i<4; i++) {
			System.out.printf("arr[%d] : %d\n",i,arr[i]);
		}
		
	}
	public void example2() {
//		for���� �̿��� �迭 �ʱ�ȭ
//		�ʱ�ȭ�� ���� ��Ģ���̶�� for���� �̿��Ͽ� �ʱ�ȭ �Ҽ��ִ�
		int[] arr = new int[5];
		for(int i =0; i<arr.length; i++) {
		arr[i] = i;
		System.out.println("arr["+i+"] : " + arr[i]);
		}
		
	}
	public void example3() {
		int[] arr2 = new int[7];
		for(int i = 0; i < arr2.length; i++) {
			arr2[i]=i*2;
			
		}
		for(int i= arr2.length-1; i>=0; i-- ) {
			System.out.println("arr["+i+"] : "+ arr2[i]);
		}
	}
	public void example4() {
		Scanner sc = new Scanner(System.in);
		double[] arr = new double[3];
		double sum = 0;
		for(int i = 0; i<arr.length; i++) {
			System.out.print("�Ǽ��Է� : ");
			double num = sc.nextDouble();
			arr[i] = num;
			sum += arr[i];
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("�հ� : "+sum);
	}
	public void example5() {
		int[] arr = {1,2,3,4,5};
		System.out.println(arr[2]);
		System.out.println(arr[4]);
		
		String[] fruits = {"����","�ٳ���","���","������","�丶��","�ƺ�ī��"};
		System.out.println("fruits.length : "+ fruits.length);
		System.out.println(fruits[2] + fruits[5] + "�꽺");
	}
	public void challenge1() {
		Scanner sc = new Scanner(System.in);
		int[] num =new int[5];
		for(int i=0; i<num.length; i++) {
			System.out.print("�����Է� : ");
			int in =sc.nextInt();
			num[i]=in;
		}
		while(true) {
			System.out.print("1~5���� ���� �ϳ� �Է�  : ");
			int input =sc.nextInt();
			if(input<6&&input>0) {
				System.out.println(input + "���� �Է��� �� : "+num[input-1]);
				break;
			}else {
				System.out.println("���� �� �½��ϴ�");
			}
		}
	}
	public void example6() {
		Scanner sc = new Scanner(System.in);
		double[] arr = new double[5];
		double sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.print("Ű �Է� : ");
			arr[i] = sc.nextDouble();
		}
		double max = arr[0];
		double min = Double.MAX_VALUE;
		for(int i =0; i<arr.length; i++) {
			sum += arr[i];
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("��� : " + sum/arr.length);
		System.out.println("����� : " + max);
		System.out.println("�ִܽ� : " + min);
	}
	public void example7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ο��� : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d��° �ε��� �Է�: ",i);
			arr[i] = sc.nextInt();
		}
		for(int i = arr.length-1;i>-1; i-- ) {
			System.out.print(arr[i]+ " ");
		}
	}
	public void example8() {
//		�迭����: �ѹ� ũ�Ⱑ �������� �ٲܼ� ���� �� ���� �ڷ����� ����
		int[] arr= new int[3];	
		System.out.println("arr �迭�� ���� : "+arr.length);
		arr = new int[6];
		System.out.println("arr �迭�� ���� : "+arr.length);
		
	}
//	String�� char�� ������ ���ִ� ���ڹ迭�������̴�
//	char�� ������ �ʴ�
//	�迭�� ����ϰ� ����Ҽ��ִ�
	public void example9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();
		
		System.out.print("�˻��� ���� : ");
		char ch = sc.next().charAt(0);
		int count=0;
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}System.out.printf("%s�� %s�� %d�� �ۼ��ƽ��ϴ�",str,ch,count);
	}
	
}
