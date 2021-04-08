package edu.kh.inh.ex.model.vo;
//	�������̵�(Overriding) : �ڽ� Ŭ������ ��� ���� �θ� �޼ҵ带 ���ۼ�(������) �ϴ°�
//	Ư¡
//	-@Override �޼ҵ� ���� ������̼��� �ۼ��ؾߵȴ�
// 	-�������̵� �� ���������ڴ� �θ� �Ͱ� ���ų� �� ���� ������ ���� �� �ִ�.
// 	-�������̵� �� ����ó�� Ŭ������ �θ� �Ͱ� ���ų� �� ���� ������ ������ �� �ִ�.
//	��������
//	-�θ� Ŭ������ �޼ҵ�� �޼ҵ���� �����ؾߵȴ�
// 	-�Ű������� ����, Ÿ��, ������ �����ؾߵȴ�
// 	-���� Ÿ���� ���� �ؾߵȴ�
//	-�θ��� private �޼ҵ�� �������̵� �Ұ��� �ϴ�.
//
//	equals():��� ���� Ŭ������ ������ ��ü���� ���� ��(���� ������)�� ���� �ڽ� Ŭ�������� ������ �ؼ� ����ϴ� �뵵�� �޼ҵ�

public class Person extends Object{
	
	private String name;
	private int age;
	
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	Object�� toString() �������̵�
//	toString() : ��ü�� ������ �ִ� �ʵ带 �ϳ��� ���ڿ��� ��Ÿ�� �� �ֵ��� Ŭ���� �ۼ� �� �������ؼ� ����ϴ� ���� �������� ������� �޼ҵ�.
//	@Override ������ ����� �޼ҵ�� ������ �Ǿ����� �����Ϸ� + �����ڿ��� �˷��ִ� ��Ȱ

	@Override
	public String toString() {
		return name + " / " + age;
	}
	
	
	
}
