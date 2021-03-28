package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {

	public void practice1() {
		int[] arr = new int[9];
		int sum =0;
		for(int i =0; i<arr.length; i++) {
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
			if(i%2==0) {
				sum+=arr[i];
			}
		}
		System.out.println();
		System.out.println("¦�� ��° �ε��� �� :"+sum);
	}
	public void practice2() {
		int[] arr = new int[9];
		int sum =0;
		for(int i =arr.length-1; i>=0; i--) {
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
			if(i%2==1) {
				sum+=arr[i];
			}
		}
		System.out.println();
		System.out.println("Ȧ�� ��° �ε��� �� :"+sum);
		
	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int in = sc.nextInt();
		int[] arr = new int[in];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}
	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++) {
			System.out.print("�Է�"+i+" : ");
			arr[i] = sc.nextInt();
		}
		System.out.print("�˻��� �� : ");
		int re = sc.nextInt();
		for(int i=0; i<arr.length; i++) {
		if(arr[i]==re) {
			System.out.println("�ε��� : "+i);
			}
		}
	}
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� : ");
		String str =sc.next();
		System.out.print("���� : ");
		char ch = sc.next().charAt(0);
		String result="";
		int count = 0;
		for(int i =0; i<str.length(); i++) {
			if(str.charAt(i)==ch) {
				result+= i+" ";
				count++;
			}
		}
		System.out.println(str+"�� "+ch+"�� �����ϴ� ��ġ(�ε���) : "+result );
		System.out.println(ch+" ���� : "+count);
	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int in = sc.nextInt();
		int[] arr = new int[in];
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			System.out.print("�迭 "+i+"��° �ε����� ���� �� : ");
			int input=sc.nextInt();
			sum+=input;
			arr[i]=input;
			
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("���� : "+sum);
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
		String str = sc.nextLine();
		
		for(int i= 0; i<str.length(); i++) {
			if(i<8) {
				System.out.print(str.charAt(i));
			}else{
				System.out.print("*");
			}
		}
	}
	
//	�޼ҵ� �� : public void practice8(){}
//	3�̻��� Ȧ���� �Է� �޾� �迭�� �߰������� 1���� 1�� �����Ͽ� ������������ ���� �ְ�,
//	�߰� ���ĺ��� �������� 1�� �����Ͽ� ������������ ���� �־� ����ϼ���.
//	��, �Է��� ������ Ȧ���� �ƴϰų� 3 �̸��� ��� ���ٽ� �Է��ϼ��䡱�� ����ϰ�
//	�ٽ� ������ �޵��� �ϼ���.
	public void practice8() {
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("���� : ");
			int in = sc.nextInt();
			if(in<3 || in%2==0) {
				System.out.println("3�̻��� Ȧ�� �Է����ּ���");
			}else {
			
				int[] num = new int[in];
				if(in >=3) {
					for(int i = 0; i<num.length; i++ ) {
						num[i] = i+1;
						System.out.print(num[i]+",");
					}
					
					for(int i= num.length-2; i>=1; i--) {
						System.out.print(num[i]+",");
					}
					System.out.println(num[0]);
				}
				break;
			}
			
		}
		
	
	
	}
	public void practice9() {
		System.out.print("�߻��� ���� : ");
		int[] arr = new int[10];
		for(int i =0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
			
			System.out.print(arr[i]+" ");
		}
		
		
	}
	public void practice10() {
		System.out.print("�߻��� ���� : ");
		int[] arr = new int[10];
		int max = 0;
		int min = arr.length;
		for(int i =0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
			
			System.out.print(arr[i]+" ");
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println();
		System.out.println("�ִ밪 : "+max);
		System.out.println("�ּҰ� : "+min);
		
	}
	
	
}
