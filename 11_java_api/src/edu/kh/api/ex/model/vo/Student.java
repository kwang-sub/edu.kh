package edu.kh.api.ex.model.vo;

public class Student {
	private String name;
	private int grade;
	private int classroom;
	
	
	public Student() {
		
	}


	public Student(String name, int grade, int classroom) {
		super();
		this.name = name;
		this.grade = grade;
		this.classroom = classroom;
	}
	
	public String getter() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
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
//	Object.toString()
//	java.lang ��Ű���� ����
//	��ü�� ������ �ִ� �ʵ� ���� �ϳ��� ���ڿ��� ��ȯ�� �� �ֵ��� �ϴ� �뵵�� �ڹٿ��� �⺻ �����ϴ� �޼ҵ�(�������̵� �ؼ� ���)


	@Override
	public String toString() {
		return name + " / " + grade + " / " + classroom;
	}
	
//	Objext.equals(Object obj)
//	���� ��ü�� ���� ���� ��ü�� �������� Ȯ���ϴ� �޼ҵ�
//	
//	Object obj : ���ҷ��� �ٸ� ��ü ���� ����
//	this.(ths ��������) : ���簴ü�� �����ּҸ� �����ϴ� ���� ���� ��ü���� �����Ǿ� ����
//	this() (this ������) : Ŭ������ �ۼ��� �ٸ� �����ڸ� ȣ���ϴ� ���� Ŭ������ ������ ù��° �ٿ� �ۼ��Ǿ� ����
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(obj == this) {
			return true;
		}
//		obj�� �����ϴ� ��ü�� Student Ÿ���� �ƴҶ�
		if(!(obj instanceof Student)) {
			return false;
		}
//	���� �� ��찡 �ƴϸ� ���� �ٸ� ��ü
		Student other = (Student)obj;
		if(!name.contentEquals(other.name)) {
			return false;
		}else if (grade != other.grade) {
			return false;
		}else if (classroom != other.classroom) {
			return false;
		}
		return true;
		
	}
//	object.hashcode() : ������ ��ü (equals() ����� true�� �ΰ�ü)�� ������ hashCode�� ��ȯ�ؾ� �Ѵ�.�̷��� ������ equals() �������̵��� hashCode()�� �������̵���.
//						�ؽ����̺� ���ĵ� �� �ִ� ���� �����ؼ� �˻� �ӵ��� ��� ��Ŵ ex) Hashset, LinkedHashSet, HashMap
	@Override					
	public int hashCode() {
		final int PRIME = 31; //prime : �Ҽ�
		int result = 1;
		
		result = PRIME * result + (name == null ? 0 : name.hashCode());
		result =  PRIME * result + grade;
		result = PRIME * result + classroom;
		
		return result;
	}
	
}
