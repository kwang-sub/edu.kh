package edu.kh.array2.ex.service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array2Service {
//	������ �迭 : �ڷ����� ���� 1���� �迭�� ����.
//	������ �迭�� �Ҵ�� �������� �ΰ��� �ε��� ��ȣ�� �ο�����
//	�չ�ȣ�� �� �޹�ȣ�� ���� ǥ���Ѵ�
	
	public void example1() {
//		int[][] arr2;//2���� �迭�� ������ ���� ���� arr�� ����
//		�������� == ������ ���� == ���۷��� == ���۷�������
//		���������� �ּҸ� �Է¹ޱ� ����  4byte ������ �Ҵ��
		
//		������ �迭 �Ҵ�
	int[][] arr2 = new int[4][3];
//	arr[0][0]=0;
//	arr[0][1]=1;
//	
//	arr[1][0]=2;
//	arr[1][1]=3;
//	
//	arr[2][0]=4;
//	arr[2][1]=5;

	
	
//		 int[][] arr2 = {{0,1},{2,3},{4,5}};
	int num = 0;
	for(int col = 0; col<arr2[0].length; col++) {
		for(int row = 0; row<arr2.length;row++) {
			arr2[row][col]=++num;
			
		}
	}
	
//	System.out.print(arr2[0][0]);
//	System.out.println(arr2[0][1]);
//	
//	System.out.print(arr2[1][0]);
//	System.out.println(arr2[1][1]);
//	
//	System.out.print(arr2[2][0]);
//	System.out.println(arr2[2][1]);
	for(int i = 0; i<arr2.length; i++) {
		for(int j =0; j<arr2[i].length; j++) {
			System.out.print(arr2[i][j] + " ");
		}
		System.out.println();
	}
	}
	public void example2() {
		Scanner sc = new Scanner(System.in);
		int[][] arr =new int[2][3];
	
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("arr[%d][%d] �����Է� : ",i,j);
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=arr.length-1; i>=0; i--) {
			for(int j=arr[i].length-1; j>=0;j--) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.print("1���� �ۼ��� �� : ");
		for(int i=0; i<arr.length; i++) {
			
				System.out.print(arr[i][1]+" ");
			
		}
	}
	public void example3() {
		Scanner sc = new Scanner(System.in);
		int[][] arr =new int[3][3];
		for(int i=0; i<arr.length-1; i++) {
			for(int j =0; j<arr[i].length; j++) {
				System.out.printf("arr[%d][%d] �����Է� : ",i,j);
				arr[i][j]=sc.nextInt();
				arr[2][j]+=arr[i][j];	
			}
		}
//		for(int i=0; i<arr[0].length;i++) {
//			for(int j=0; j<arr.length-1;j++) {
//				arr[2][i]+=arr[j][i];
//			}
//		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	public void example4() {
//		�����迭
//		���� ������ ������ ������ ���� ������ �������� ���� 2�����迭
		int [][] arr =  new int [3][];
		arr[0] = new int[3];
		arr[1] = new int[4];
		arr[2] = new int[2];
	      int num = 0; 
	      
	      for(int row=0 ; row<arr.length ; row++ ) { 
	         for(int col=0 ; col<arr[row].length ; col++) {
	            arr[row][col] = num;
	            System.out.print(arr[row][col]);
	            
	            num++;  
	         }
	         System.out.println();
	      }
	}
}
