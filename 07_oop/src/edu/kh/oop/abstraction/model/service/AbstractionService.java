package edu.kh.oop.abstraction.model.service;

import java.util.Scanner;

import edu.kh.oop.abstraction.model.vo.Student;

public class AbstractionService {
//	Ŭ������ �ݵ�� �Ӽ�,��� �Ѵ� �ۼ��� �ʿ�� ����
	public void example1() {
		Student std = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		std.name = sc.next();
		
		System.out.print("�б��� :");
		std.schoolName =sc.next();
		
		System.out.print("�г� : ");
		std.grade = sc.nextInt();
		
		System.out.print("���� : ");
		std.gender = sc.next().charAt(0);
		
		Student std2 = new Student();
		System.out.println("===�ι�° �л����� �Է�===");
		System.out.print("�̸� : ");
		std2.name = sc.next();
		
		System.out.print("�б��� :");
		std2.schoolName =sc.next();
		
		System.out.print("�г� : ");
		std2.grade = sc.nextInt();
		
		System.out.print("���� : ");
		std2.gender = sc.next().charAt(0);
//		System.out.println(std.name);
//		System.out.println(std.schoolName);
//		System.out.println(std.grade);
//		System.out.println(std.gender);
		
//		std.goToSchool();
//		std.study();
//		std.goToHome();
		std.introduce();
		std2.introduce();
	}
}
