package edu.kh.api.ex.model.service;

import java.util.Scanner;

import edu.kh.api.ex.model.vo.Student;

public class APIService {
	public void example1() {
		Student std1 = new Student("홍길동", 3, 2);
		Student std2 = new Student("홍길동", 3, 5);
		System.out.println(std1);
		System.out.println(std1.equals(std2));
		
		System.out.println(std1.hashCode());
	}
	
	
	
	public void example2() {
//		String 리터럴로 생성된 문자열은 String Pool이라는 Heap영역 공간에 생성됨.
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		
		System.out.print("abc 입력 : ");
		String str4 = sc.next();
		
		System.out.println(str1 == str2);
//		String 리터럴로 "abc"가 초기화된 str1, str2는 String Pool에 있는 같은 "abc"의 주소를 참조한다.
		
		System.out.println(str1 == str3);
		System.out.println(str1 == str4);
		System.out.println("std1 : " + System.identityHashCode(str1));
		System.out.println("std2 : " + System.identityHashCode(str2));
		System.out.println("std3 : " + System.identityHashCode(str3));
		System.out.println("std4 : " + System.identityHashCode(str4));
		
//		System.identityHashCode()를 사용하여 str1과 str2가 참조하는 주소가 실제로 같은지 확인한다 하지만 자바는 실제 메모리 주소를 볼수는 없지만 메모리 주소를 이용해 일정한 형태에  숫자로 변환하여 보여준다.
//		
		
	}

}
