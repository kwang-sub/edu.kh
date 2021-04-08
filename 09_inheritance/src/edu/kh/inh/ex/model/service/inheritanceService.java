package edu.kh.inh.ex.model.service;

import edu.kh.inh.ex.model.vo.Employee;
import edu.kh.inh.ex.model.vo.Person;
import edu.kh.inh.ex.model.vo.Student;

public class inheritanceService extends Student {
	public void example1() {
		
		Person p = new Person();
		p.setName("ȫ�浿");
		p.setAge(20);
		
		Student std = new Student();
		std.setName("��ö��");
		std.setAge(15);
		std.setGrade(2);
		std.setClassroom(3);
		
		
		
		Employee emp = new Employee();
		emp.setName("������");
		emp.setAge(18);
		emp.setPosition("����");
		emp.setEmpNo(1);
		emp.setSalary(4000000);
		
		
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		
		
		Student std2 = new Student("��", 28, 3, 1);
		System.out.println(std2.getName());
		System.out.println(std2.getAge());
		System.out.println(std2.getGrade());
		System.out.println(std2.getClassroom());
		
	}
	public void example2() {
		Person p = new Person("ȫ�浿", 20);
		Employee e = new Employee("��浿", 40, 10, "����", 500);
		System.out.println(p.toString());
		System.out.println(p);
//		print ���� �޼ҵ��� �Ű������� ������������ �ۼ��� ��� �ڵ����� ���������� �����ϴ� ��ü�� toString() �޼ҵ带 ȣ���Ѵ�.
		System.out.println(e);
		Student std = new Student("���̹�", 19, 3, 5);
		System.out.println(std);
		std.test();
		std.test("����");
		System.out.println(std.test("����", "����"));
		
		System.out.println(test(10));
	}
	public void example3() {
		Student s1 = new Student("ȫ�浿", 18, 2, 7);
		Student s2 = new Student("ȫ�浿", 18, 2, 7);
		Student s3 = s1;
		Student s4 = new Student("ȫ�浿", 18, 2, 8);
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s3);
		
	}
}
