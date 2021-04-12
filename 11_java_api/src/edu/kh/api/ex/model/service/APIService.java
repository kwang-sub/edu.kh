package edu.kh.api.ex.model.service;

import java.util.Scanner;

import edu.kh.api.ex.model.vo.Student;

public class APIService {
	public void example1() {
		Student std1 = new Student("ȫ�浿", 3, 2);
		Student std2 = new Student("ȫ�浿", 3, 5);
		System.out.println(std1);
		System.out.println(std1.equals(std2));
		
		System.out.println(std1.hashCode());
	}
	
	
	
	public void example2() {
//		String ���ͷ��� ������ ���ڿ��� String Pool�̶�� Heap���� ������ ������.
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		
		System.out.print("abc �Է� : ");
		String str4 = sc.next();
		
		System.out.println(str1 == str2);
//		String ���ͷ��� "abc"�� �ʱ�ȭ�� str1, str2�� String Pool�� �ִ� ���� "abc"�� �ּҸ� �����Ѵ�.
		
		System.out.println(str1 == str3);
		System.out.println(str1 == str4);
		System.out.println("std1 : " + System.identityHashCode(str1));
		System.out.println("std2 : " + System.identityHashCode(str2));
		System.out.println("std3 : " + System.identityHashCode(str3));
		System.out.println("std4 : " + System.identityHashCode(str4));
		
//		System.identityHashCode()�� ����Ͽ� str1�� str2�� �����ϴ� �ּҰ� ������ ������ Ȯ���Ѵ� ������ �ڹٴ� ���� �޸� �ּҸ� ������ ������ �޸� �ּҸ� �̿��� ������ ���¿�  ���ڷ� ��ȯ�Ͽ� �����ش�.
//		
		
	}

}
