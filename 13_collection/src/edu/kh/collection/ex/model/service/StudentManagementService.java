package edu.kh.collection.ex.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.ex.model.vo.Student;

public class StudentManagementService {
	private Scanner sc = new Scanner(System.in);
	
	private List<Student> stdList = new LinkedList<Student>();
//	ArrayList, LinkedList, Vetor�� ��� List�� ������ �ڽ� Ŭ������ ������ �޼ҵ带 ������ �ִ�.
//	�������̽�+������ ���� ��Ÿ���� ����
	
	public void displayMenu() {
		int sel = 0;
		do {
			System.out.println("==========�л� ���� ���α׷�===========");
			System.out.println("1.�л� ��ü ��ȸ");
			System.out.println("2.�л� ���� �߰�");
			System.out.println("3.�л� ���� ����");
			System.out.println("4.�л� ���� ����");
			System.out.println("5.�̸� �˻�");
			System.out.println("0.����");
			System.out.print("�޴� ���� >> ");
			try {
				sel = sc.nextInt();
				sc.nextLine();			
				switch(sel) {
				case 1 : selectAll();break;
				case 2 : addStudent();break;
				case 3 : updateStudent();break;
				case 4 : deleteStudent();break;
				case 5 : serchName();break;
				case 0 : System.out.println("���α׷� ����");break;
				default : System.out.println("�޴��� �ִ� ���ڸ� �Է����ּ���.");
				}
			}catch(InputMismatchException e) {
				System.out.println("������ �Է����ּ���");
				sel =-1;
				sc.nextLine();
			}
		}while(sel != 0 );
	}
	private void selectAll() {
		System.out.println("[�л� ��ü ��ȸ]");
		if(stdList.isEmpty()) {
			System.out.println("�Էµ� �л��� �����ϴ�.");
		}else {
			for(int i=0; i<stdList.size(); i++) {
				Student s = stdList.get(i);
				System.out.printf("%d��° %s %d %d\n", i+1,s.getAge(),s.getAge(),s.getGrade());
			}
		}
		
	}
	
	public Student createStuden() throws InputMismatchException {
		System.out.print("�̸� �Է� : ");
		String name = sc.nextLine();
		
		System.out.print("���� : ");
		int age = sc.nextInt();
	
		System.out.print("�г� : ");
		int grade = sc.nextInt();
		sc.nextLine();
		return new Student(name, age, grade);
	}
	private void addStudent() throws InputMismatchException {
		System.out.println("[�л� ���� �߰�]");
		stdList.add(createStuden());
	}
	private void updateStudent() throws InputMismatchException {
		System.out.println("[�л� ���� ����]");
		System.out.print("������ �ε��� �Է� : ");
		int in = sc.nextInt();
		sc.nextLine();
		if(!stdList.isEmpty() && in >= 0 && in < stdList.size()) {
			
			Student s = createStuden();
			stdList.set(in, s);
			System.out.println("�����Ǿ����ϴ�.");
		}else {
			System.out.println("�л� ������ ���ų�, �ε����� �߸� �ԷµǾ����ϴ�.");
		}
	}
	private void deleteStudent() throws InputMismatchException {
		System.out.println("[�л� ���� ����]");
		System.out.print("������ �ε��� �Է� : ");
		int in = sc.nextInt();
		if(!stdList.isEmpty() && in>=0 && in<stdList.size()) {
			System.out.println(stdList.remove(in)+" ���� �Ǿ����ϴ�.");
		}else {
			System.out.println("�л� ������ ���ų�, �ε����� �߸� �ԷµǾ����ϴ�.");
		}
	}
	private void serchName() {
		System.out.print("�̸� �Է� : ");
		String in = sc.next();
		
		
		for(Student s : stdList) {
			if(!stdList.isEmpty()&&s.getName().contentEquals(in)) {
				System.out.println(s);
			}
		}
		
	}
}
