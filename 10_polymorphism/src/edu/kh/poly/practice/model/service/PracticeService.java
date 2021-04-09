package edu.kh.poly.practice.model.service;

import java.util.Scanner;

import edu.kh.poly.practice.model.vo.Employee;
import edu.kh.poly.practice.model.vo.Person;
import edu.kh.poly.practice.model.vo.Student;

public class PracticeService implements QuestionInterface{
	
	private Scanner sc = new Scanner(System.in);
	
	private Person[] pArr = new Person[3];

	@Override
	public  void displayMenu() {
		
		
		int sel = 0;
		
		do {
			System.out.println("===== ���� ���� =====");
			System.out.println("1. Person �迭 pArr�� �л� �Ǵ� ���� ����ϱ�.");
			System.out.println("2. pArr �迭�� ����Ǿ��ִ� ��� ��� ����ϱ�.");
			System.out.println("3. pArr�迭���� �л� ������ ����ϱ�");
			System.out.println("4. pArr�迭���� ���� ������ ����ϱ�");
			System.out.println("5. pArr�迭���� �Է� ���� �̸��� ���� ��� ������ ���� ����ϱ�");
			System.out.println("6. ��� ����� �̸��� �� �ٷε� ���ڿ��� ���� ����ϱ�");
			System.out.println("7. ��� ����� ���� �հ�, �ְ�/���� ���� ����ϱ�");
			System.out.println("8. Ư�� �ε����� �ִ� ����� ������ �����ϰ�,������ ��� ������ ���� ����ϱ�");
			System.out.println("9. �迭 ũ�⸦ 1ĭ �ø���, �þ ĭ�� ���ο� �л� �Ǵ� ����  ����ϱ�");
			System.out.println("0. ����");
			
			System.out.print("�޴����� >>");
			sel = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch (sel) {
			case 1: insertPerson();break;
			case 2: selectAll();break;
			case 3: selectStudent();break;
			case 4: selectEmployee();break;
			case 5: System.out.println(searchName());break;
			case 6: System.out.println(printName());break;
			case 7: printAge();break;
			case 8: System.out.printf(" %s ������ ���� �Ǿ����ϴ�.",deletePerson()); break;
			case 9: break;
			case 0:  break;
			
			
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
			}
			
			
		}while(sel != 0);
	}

	@Override
	public void insertPerson() {
		for(int i=0; i<pArr.length; i++) {
			System.out.print("1.�л� / 2.����(����) : ");
			int sel = sc.nextInt();
			sc.nextLine();
			if(sel == 1) {
				System.out.println("===�л� ���� �Է�===");
				System.out.print("�̸� : ");
				String name = sc.next();
				System.out.print("���� : ");
				int age = sc.nextInt();
				System.out.print("�г� : ");
				int grade = sc.nextInt();
				System.out.print("�� : ");
				int classroom = sc.nextInt();
				
				pArr[i] = new Student(name, age, grade, classroom);
			
			}else if(sel == 2) {
				System.out.println("===���� ���� �Է�===");
				System.out.print("�̸� : ");
				String name = sc.next();
				System.out.print("���� : ");
				int age = sc.nextInt();
				System.out.print("��� : ");
				int empNo = sc.nextInt();
				System.out.print("���� : ");
				String position = sc.next();
				System.out.print("�޿� : ");
				int salary = sc.nextInt();
				
				pArr[i] = new Employee(name, age, empNo, position, salary);
				
			}else {
				pArr[i] = null;
			}
		}
	}
	// 2.pArr �迭�� ����Ǿ��ִ� ��� ��� ����ϱ�.	
//	�迭�� ���� �̷µ��� ���� ��� "�迭�� ����� ������ �����ϴ�."
	@Override
	public void selectAll() {
		for(int i = 0; i<pArr.length; i++) {
			if(pArr[i]==null) {
				System.out.println("�迭��ҿ� ����� ������ �����ϴ�.");
			}else {
				
				System.out.println(pArr[i].toString());
			}
		}
		
	}
	// 3. pArr�迭���� �л� ������ ����ϱ�
	@Override
	public void selectStudent() {
		for(Person p : pArr) {
			if(p instanceof Student) {
				System.out.println(p);
			}
		}
			
	}
	// 4. pArr�迭���� ���� ������ ����ϱ�
	@Override
	public void selectEmployee() {
		for(Person p : pArr) {
			if(p instanceof Employee) {
				System.out.println(p);
			}
		}
		
	}
	// "5. pArr�迭���� �Է� ���� �̸��� ���� ��� ������ ���� ����ϱ�"
	@Override
	public Person searchName() {
		System.out.print("�̸� �Է� : ");
		String name = sc.next();
		String result ="";
		for(Person p : pArr) {
			if(name.equals(p.getName())) {
				return p;
			}
		}
		return null;
	}

	@Override
	public String printName() {
		String name ="";
		for(int i = 0; i<pArr.length-1; i++) {
			
			if()
		}
		return name;
	}

	@Override
	public void printAge() {
		int sum = 0;
		int min = Integer.MAX_VALUE;
		int max = 0;
		for(Person p : pArr) {
			sum += p.getAge();
			if(max<p.getAge()) {
				max = p.getAge(); 
			}else if (min>p.getAge()) {
				min=p.getAge();
			}
		}
		System.out.println("��� ����� ���� �� : " + sum);
		System.out.println("�ְ� ���� : " + max);
		System.out.println("���� ���� : " + min);
	}

	@Override
	public Person deletePerson() {
		
		System.out.println("������ �ε��� : ");
		int in = sc.nextInt();
		
		Person str = pArr[in];
		pArr[in] =null;
		
		return str;
	}

	@Override
	public void addPerson() {
		
		
	}
	
}
