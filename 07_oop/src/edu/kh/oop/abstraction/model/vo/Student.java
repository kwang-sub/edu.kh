package edu.kh.oop.abstraction.model.vo;
//	mode : ����Ͻ� ���� ���� Ŭ������ ��Ƶδ� ��Ű��
//	vo(value object) : �� ����� ��ü		
public class Student {

	public String name;
	public String schoolName;
	public int grade ;
	public char gender;
	
	public void study() {
		System.out.println(name + "�� ���θ� ������ �մϴ�");
	}
	public void goToSchool() {
		System.out.println("��ϱ�");
	}
	public void goToHome() {
		System.out.println("���� ����");
	}
	public void introduce() {
		System.out.printf("�̸��� %s�̰�, %s %d�г� �������� %c���Դϴ�.\n",name,schoolName,grade,gender);
	}
//	public void playGame() {
//		System.out.println("�����ϱ�");
//	}  
//	�л����� ���������� �ʿ��� ����� �ƴϴ�.
}
