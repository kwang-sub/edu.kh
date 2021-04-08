package edu.kh.inh.ex.model.vo;

public class Student extends Person {

	private int grade;
	private int classroom;
	
	public Student() {
		super();
//		super(); (super������,�θ������) : �ڽ� ��ü ������ ��ӹ��� �θ� ��ü�� ���� ���� �Ǿ�� �Ǳ� ������ �ڽ� ������ ���� ù �ٿ� �ۼ���.���ۼ� �� �����Ϸ��� �ڵ����� �߰� ���ش�.
		
	}

	public Student(String name, int age, int grade, int classroom) {
//		super(name,age);
		super.setName(name);
		super.setAge(age);
//		this.name = name;
//		this.age = age;
		this.grade = grade;
		this.classroom = classroom;
	}



	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	@Override
	public String toString() {
		return super.toString() + " / " + grade + " / " + classroom;
	}
	
	
	public void test() {
		System.out.println("���躸��");	
	}
	public void test(String subject) {
		System.out.println(subject + "���� ���躸��");
	}
	public String test(String sub1,String sub2) {
		return sub1+ " / " + sub2 + " �� ���� ���躸��";
	}
	protected int test (int num) {
		return num + 10;
	}
	public final void study() {
		System.out.println("�л��� �����ؾ� �ȴ�");
	}
	@Override
	public boolean equals(Object obj) {
		Student other = (Student)obj;
		if(!this.getName().equals(other.getName())) {
			return false;
		}else if( this.getAge() != other.getAge()) {
			return false;
		}else if(this.grade != other.grade) {
			return false;
		}else if(this.classroom != other.classroom) {
			return false;
		}else {
			return true;
			
		}
		
	}
}
