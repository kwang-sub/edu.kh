package edu.kh.variable.ex.service;

import java.util.Scanner;

public class B_KeyboardInput {

	public  void inputExample1() {
		Scanner sc = new Scanner(System.in);
		//�̸��� �Է¹޾� ������ ���� ����
		String inputName;
//		�ܼ�â��"�̸��� �Է����ּ���: " ���ڿ� ���
		System.out.print("�̸��� �Է����ּ���:");
//		Scanner�� �̿��Ͽ� �̸��� �Է� �޾� inputName�� ����
		inputName = sc.next();// ����ڰ� �Է��� ���� �ܾ �о��
		System.out.println(inputName+"�� ȯ���մϴ�");
//		Ű����� ����,�Ǽ�,���ڿ��� �Է¹޴� ����� �����ϴ� Ŭ����
		
	}
//	������ �Է¹ޱ�
	public void inputExample2() {
//		�̸� ���� Ű�� �Է¹޾� ������ ����
//		" ooo����  oo�� �̸�, Ű��ooo.ooocm �Դϴ�."
//		1.�Է��� ���� scanner��ü����
		Scanner sc = new Scanner(System.in);
//		2."�̸� �Է�:"��������� ����������
		System.out.print("�̸��Է�: ");
		String inputName = sc.next();
//		"�����Է�:"����� ��������
		System.out.print("�����Է�: ");
		int inputAge = sc.nextInt();
		System.out.print("Ű�Է�: ");
		double inputHight = sc.nextDouble();
		System.out.println(inputName+"���� "+inputAge+"�� �̸�, "
				+ "Ű��"+inputHight+"cm �Դϴ�.");
	}

}
