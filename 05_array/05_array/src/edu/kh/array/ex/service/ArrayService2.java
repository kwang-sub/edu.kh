package edu.kh.array.ex.service;

import java.util.Arrays;
import java.util.Collections;

//		���� ���� : �����ϴ� �迭�� �ּҸ��� ����
//		-> ��ü�� �Ű�����, ��ȯ�� ���� �� ���
//		���� ���� : ���� �迭�� ������ �ڷ���, ������ ũ�⸦ ������ �迭�� ����� ���� �����ͱ��� �Ȱ��� �ۼ��ϴ� ����
//		->���� ������ ����, ������ �Ȱ��� ���ο� �迭 �ʿ� �� ���
//		Arrays Ŭ���� : java.util ��Ű���� ���� �ϴ� �迭�� ���� ����ϰų� �߰����� ����� �������ִ� Ŭ����
//		Arrays.toString(�迭��) : �ش� �迭�� �ִ� ��� ���� �ϳ��� ���ڿ��� ������ش�
//		hashCode() : �ּҸ� �̿��ؼ� ������ ������ ������ ����� ���� ���
public class ArrayService2 {
	public void example1() {
		int[] arr = {10,20,30,40,50};
		int[] copyarr = arr;
		
		System.out.println("arr : "+Arrays.toString(arr));
		System.out.println("copyarr : "+Arrays.toString(copyarr));
		copyarr[0] = 99;
		System.out.println("arr : "+Arrays.toString(arr));
		System.out.println("copyarr : "+Arrays.toString(copyarr));
		System.out.println(arr.hashCode());
		System.out.println(copyarr.hashCode());
	}
	public void example2() {
		int[] arr = {10,20,30,40,50};
		int[] copyArr = new int[arr.length];
//		for(int i = 0; i<arr.length; i++) {
//			copyArr[i] = arr[i];
//		}
//		System.arraycopy
		System.arraycopy(arr,0,copyArr,0,arr.length);
		
		System.out.println("arr : "+ Arrays.toString(arr));
		System.out.println("copyArr : "+ Arrays.toString(copyArr));
	
		copyArr[0] = 99;
		System.out.println("arr : "+ Arrays.toString(arr));
		System.out.println("copyArr : "+ Arrays.toString(copyArr));
		
	}
	public void example3() {
		int[] arr = {1,8,7,5,6,4,3,2,9,10};
//		����,����,�������� �˰���
//		 for(int i=1 ; i<arr.length ; i++) {
//	         
//	         for(int j=0 ; j < i ; j++) {
//	            
//	            if(arr[i] < arr[j]) {
//	               
//	               int tmp = arr[i];
//	               arr[i] = arr[j];
//	               arr[j] = tmp;
//	            }
//	         }
//	         
//	      }
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		Integer[] arr2 = {1,8,7,5,6,4,3,2,9,10};
		Arrays.sort(arr2,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr2));
	}
	public void example4() {
		int[] arr = {1,2,3,4,2};
		for(int i =0; i<arr.length-1; i++) {
			for(int j =i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]+"�� �ߺ��Դϴ�");
				}
			}
		}
	}
	public void example5() {
		int[] arr = new int[6];
		for(int i = 0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*45+1);
			for(int j =0; j<i; j++) {
				if(arr[i]==arr[j]) {
					i--;
					break;
				}
			}
			
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
