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
		System.out.println("짝수 번째 인덱스 합 :"+sum);
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
		System.out.println("홀수 번째 인덱스 합 :"+sum);
		
	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
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
			System.out.print("입력"+i+" : ");
			arr[i] = sc.nextInt();
		}
		System.out.print("검색할 값 : ");
		int re = sc.nextInt();
		for(int i=0; i<arr.length; i++) {
		if(arr[i]==re) {
			System.out.println("인덱스 : "+i);
			}
		}
	}
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str =sc.next();
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		String result="";
		int count = 0;
		for(int i =0; i<str.length(); i++) {
			if(str.charAt(i)==ch) {
				result+= i+" ";
				count++;
			}
		}
		System.out.println(str+"에 "+ch+"가 존재하는 위치(인덱스) : "+result );
		System.out.println(ch+" 개수 : "+count);
	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int in = sc.nextInt();
		int[] arr = new int[in];
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			int input=sc.nextInt();
			sum+=input;
			arr[i]=input;
			
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("총합 : "+sum);
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.nextLine();
		
		for(int i= 0; i<str.length(); i++) {
			if(i<8) {
				System.out.print(str.charAt(i));
			}else{
				System.out.print("*");
			}
		}
	}
	
}
