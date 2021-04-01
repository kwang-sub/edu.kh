package edu.kh.array2.practice.service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	
	public void practice1() {
		String[][] arr = new String[3][3];
		for(int i =0; i<arr.length; i++) {
			for(int j =0; j<arr[i].length;j++) {
			arr[i][j]= "("+i+", "+j+")";
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	public void practice2() {
		int[][] arr = new int[4][4];
		int num = 1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j]=num;
				num++;
				System.out.printf("%2d ",arr[i][j]);
			}
			System.out.println();
		}
	}
	public void practice3() {
		int[][] arr = new int[4][4];
		int num = 16;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j]=num;
				num--;
				System.out.printf("%2d ",arr[i][j]);
			}
			System.out.println();
		}
	}
	public void practice4() {
		int[][] arr = new int[4][4];
		for(int i=0; i<arr.length-1; i++) {
			for (int j=0; j<arr[0].length-1; j++) {
				arr[i][j] = (int)(Math.random()*10+1); 
				arr[3][j] += arr[i][j];
				arr[i][3] += arr[i][j];
				
				
			}
			
		}
	
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.printf("%2d ",arr[i][j]);
				if(i==arr.length-1||j==arr[0].length) {
					if(!(i==arr.length-1&&j==arr[0].length-1)) {
						arr[3][3]+=arr[i][j];
						
					}
				}
			}
			System.out.println();
		}
	}
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("�� ũ�� : ");
			int num1 = sc.nextInt();
			System.out.print("�� ũ�� : ");
			int num2 = sc.nextInt();
			char[][] arr= new char[num1][num2];
			if(num1>0 && num1 <11 && num2>0 && num2<11){
				for(int i=0; i<arr.length; i++) {
					for(int j=0; j<arr[0].length;j++) {
						arr[i][j]=(char)((int)((Math.random()*26)+65));
					}
					
				}
				for(int i=0; i<arr.length; i++) {
					for(int j=0; j<arr[0].length; j++) {
						System.out.print(arr[i][j]+" ");
					}
					System.out.println();
				}
				break;
			}
			else {
				System.out.println("�ݵ�� 1~10������ ������ �Է��ؾ� �մϴ�.");
			}
		}
	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ũ�� : ");
		int input = sc.nextInt();
		char[][] arr = new char[input][];
		char ch= 'a';
		for(int i=0; i<arr.length; i++) {
			System.out.print(i+"�� ���� ũ�� : ");
			int in = sc.nextInt();
			arr[i]=new char[in];
			for(int j=0; j<arr[i].length;j++) {
				
			}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=ch++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void practice7() {
		String[] students = {"���ǰ�","������","�����","�����","���̹�","�ں���","�ۼ���","������","������","��õ��","��ǳǥ","ȫ����"};
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		System.out.println("====1�д�====");
		int n = 0;
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[0].length; j++) {
				arr1[i][j]=students[n];
				n++;
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("====2�д�====");
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[0].length; j++) {
				arr2[i][j]=students[n];
				n++;
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}
	public void practice8() {
		String[] students = {"���ǰ�","������","�����","�����","���̹�","�ں���","�ۼ���","������","������","��õ��","��ǳǥ","ȫ����"};
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		System.out.println("====1�д�====");
		int n = 0;
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[0].length; j++) {
				arr1[i][j]=students[n];
				n++;
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("====2�д�====");
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[0].length; j++) {
				arr2[i][j]=students[n];
				n++;
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("==============");
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� �л� �̸��� �Է��ϼ��� : ");
		String name = sc.next();
		for(int i=1; i<=arr1.length; i++) {
			for(int j=0; j<arr1[0].length; j++) {
			
				if(name.equals(arr1[i-1][j]) && j%2==0) {
					System.out.printf("�˻��Ͻ� %s �л��� 1�д� %d��° �� ���ʿ� �ֽ��ϴ�.\n",name,i);			
					}else if(arr1[i-1][j].equals(name)&& j%2==1) {
						System.out.printf("�˻��Ͻ� %s �л��� 1�д� %d��° �� �����ʿ� �ֽ��ϴ�.\n",name,i);
					}
				
			}	
		}
		for(int i=1; i<=arr2.length; i++) {
			for(int j=0; j<arr2[0].length; j++) {
			
				if(name.equals(arr2[i-1][j]) && j%2==0) {
					System.out.printf("�˻��Ͻ� %s �л��� 2�д� %d��° �� ���ʿ� �ֽ��ϴ�.\n",name,i);			
					}else if(arr2[i-1][j].equals(name)&& j%2==1) {
						System.out.printf("�˻��Ͻ� %s �л��� 2�д� %d��° �� �����ʿ� �ֽ��ϴ�.\n",name,i);
					}
				
			}	
		}
	}
	
}
