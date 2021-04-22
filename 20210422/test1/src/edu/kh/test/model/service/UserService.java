package edu.kh.test.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import edu.kh.test.model.vo.User;

public class UserService {
	private Scanner sc=new Scanner(System.in);
	private ArrayList<User> ulist = new ArrayList<User>();
	
	
	public void displayMenu()  {
		int sel=0;
		do {
			System.out.println("---����� ���� ���α׷�---");
			System.out.println("1.����� �߰�");
			System.out.println("2.��ü ����� ��ȸ");
			System.out.println("3.����� ����");
			System.out.println("0.����");
			
			try {			
				System.out.print("�޴� ����> ");
				sel = sc.nextInt();
				
			}catch(InputMismatchException e){
				sc.nextLine();
				System.out.println("������ �Է����ּ���");
			}
			switch(sel) {
			case 1 : addUser(); break;
			case 2 : selectAll(); break;
			case 3 : deleteUser(); break;
			case 0 : break;
			}
		}while(sel !=0);
		
		
	}
	private void addUser(){
		System.out.print("���̵� �Է����ּ��� : ");
		String userId = sc.next();
		System.out.print("��й�ȣ�� �Է����ּ��� : ");
		String userPwd = sc.next();
		System.out.print("�̸��� �Է����ּ��� : " );
		String name= sc.next();
		ulist.add(new User(userId, userPwd, name));
	}

	private void selectAll(){
		for(int i =0; i < ulist.size(); i++) {
			System.out.println(ulist.get(i));
		}
	}

	private void deleteUser(){
		System.out.println("������ ���̵� : ");
		String del = sc.next();
		int count =0;
		for(User u : ulist) {
			if(del.equals(u.getUserId())) {
				System.out.println(u+"����ڰ� �����Ǿ����ϴ�");
				ulist.remove(u);
				count ++;
				break;
			}
		}
		if(count==0) {
			System.out.println("��ġ�ϴ� ����ڰ� �����ϴ�");
		}
	}
}
