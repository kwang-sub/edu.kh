package edu.kh.objarray.practice.model.service;

import java.util.Scanner;

import edu.kh.objarray.practice.model.vo.Employee;

public class EmployeeService {

	private Employee[] employees = new Employee[3]; // ��� ������ ������ Employee �迭
	private Scanner sc = new Scanner(System.in); 

	
	public void displayMenu() {
		
		int sel = 0;
		do {
			
			System.out.println("=== ���� ���� ���α׷� ===");
			System.out.println("1. ���� ���� �Է�(3��)");
			System.out.println("2. ��� ���� ���� ���");
			System.out.println("3. Ư�� ���� ���� ���(�̸� �˻�)");
			System.out.println("4. Ư�� ���� �޿�/���� ���(��� �˻�)");
			System.out.println("5. ��� ���� �޿� ��/���� �� ���");
			System.out.println("6. ��� ������ �޿��� ���� ���� ������ �̸�, �μ�, �޿� ���");
			System.out.println("0. ����");
			System.out.print("�޴� ���� >> ");
			sel = sc.nextInt();
			sc.nextLine();
			
			switch (sel) {
			case 1: initEmployee(); break;
			case 2: System.out.println(allEmployeesInformation()); break;
			case 3: System.out.println(searchEmployee()); break;
			case 4: System.out.println(salaryCheck()); break;
			case 5: System.out.println("=== ��� ��� �޿� ��===\n�� ���� �޿� �� : " +allSalaryCheck() ); 
					System.out.println("�� ���� ���� �� : " + allSalaryCheck()*12);
					break;
			case 6: topSalaryEmployee(); break;
			case 0: System.out.println("���α׷� ����."); break;

			default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			
		}while(sel != 0);
		
	}
	
	// 3���� ���� ������ �Է¹޾� �迭�� �� ��ҿ� �ʱ�ȭ  
	public void initEmployee() {
		// ���, �̸�, �μ�, ����, �޿� ������ �Է¹ޱ�
		for(int i = 0; i<employees.length; i++) {
			System.out.println("==="+(i+1)+"��° ��� ���� �Է� ====");
			System.out.print("��� : ");
			int empNo = sc.nextInt();
			System.out.print("�̸� : ");
			String empName = sc.next();
			System.out.print("�μ� : ");
			String department = sc.next();
			System.out.print("���� : ");
			String position = sc.next();
			System.out.print("�޿� : ");
			int salary= sc.nextInt();
			
			employees[i] = new Employee(empNo, empName, department, position, salary);
		}
	}
	
	
	// ��� ���� ������ �ϳ��� ���ڿ��� ��ȯ
	public String allEmployeesInformation() {
		String str = "";
		for(int i = 0; i<employees.length; i++) {
			str += employees[i].toString()+"\n";
		}
		return str;
	}
	
	// Ư�� ��� ���� ��ȯ �޼ҵ�(�̸� �˻�)
	// ��ġ�ϴ� �̸��� ���� ��� "��ġ�ϴ� �̸��� ����� �����ϴ�." ��ȯ
	public String searchEmployee() {
		System.out.println("=== Ư�� ��� ���� ���(�̸��˻�)===");
		System.out.print("�̸� �Է� : ");
		String in = sc.next();
		String str = "";
		for(int i = 0; i<employees.length; i++) {
			if(in.equals(employees[i].getEmpName())) {
				str = employees[i].toString();
			}
		}
		if(str=="") {
		str = "��ġ�ϴ� �̸��� ����� �����ϴ�";
		}
		return str;
	}
	
	
	// �Է¹��� ����� ��ġ�ϴ� ������ �޿�, ���� ���� ��ȯ(���� == �޿� * 12)
	// ��ġ���� �ʴ� ��� "����� ��ġ�ϴ� ���� �����ϴ�." ��ȯ
	public String salaryCheck() {
		System.out.println("===�޿�/���� ��ȸ ===");
		System.out.print("��� �Է� : ");
		int in = sc.nextInt();
		String str = "";
		for(int i = 0; i<employees.length; i++) {
			if(in==employees[i].getEmpNo()) {
				str = "�޿�  : " + employees[i].getSalary() + "/ ���� : " + employees[i].getSalary()*12;
			}
			
		}
		if(str=="") {
		str ="����� ��ġ�ϴ� ���� �����ϴ�.";
		}
		return str;
	}
	
	
	// ��� ��� �޿� ��/���� �� ��ȯ
	public int allSalaryCheck() {
		
		
		int sum = 0;
		for(int i = 0; i<employees.length; i++) {
			sum += employees[i].getSalary();
				
			}
		
		return sum;
	}
	
	// ��� ������ �޿��� ���� ���� ���� ���
	// (������ �޿��� ��� ����� ���� ����� ���)
	public void topSalaryEmployee() {
		String good = ""; 
		int best = 0;
		int num = Integer.MAX_VALUE;
		for(int i = 0; i<employees.length; i++) {
			if(num>employees[i].getEmpNo() && best<=employees[i].getSalary()) {
				num = employees[i].getEmpNo();
				best=employees[i].getSalary();
				good = employees[i].toString();
			}
				
			}
		System.out.println(good);
		
	}
	
}