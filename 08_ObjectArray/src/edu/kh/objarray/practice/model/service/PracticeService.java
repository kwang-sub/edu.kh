package edu.kh.objarray.practice.model.service;

import java.util.Scanner;

import edu.kh.objarray.practice.model.vo.Student;

public class PracticeService {
	private Student[] students =null;
	private Scanner sc = new Scanner(System.in);
	public void start() {
		students = new Student[10];
		int sum = 0;
		
		do{
			
			System.out.print("�г� : ");
			int grade = sc.nextInt();
			System.out.print("�� : ");
			int classroom = sc.nextInt();
			sc.nextLine();
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("�������� : ");
			int kor = sc.nextInt();
			System.out.print("�������� : ");
			int eng = sc.nextInt();
			System.out.print("�������� : ");
			int math = sc.nextInt();
			
			students[sum] =new Student(grade, classroom, name, kor, eng, math);
		
			
			while(true) {
				System.out.print("��� �Է� �Ͻðڽ��ϱ�? (y/n)");
				char ch = sc.next().charAt(0);
				if(ch == 'n'||ch == 'N') {
					sum =10;
					break;
				}else if(ch == 'y'||ch == 'Y') {
					sum++;
					break;
				}else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���");
				}
			}
		}while(sum !=10 );
		
		
		for(Student student :students) {
			if(student == null){
			break;
			}{
			System.out.println(student.toString());
			}
		}
		
	}

		
	
}
