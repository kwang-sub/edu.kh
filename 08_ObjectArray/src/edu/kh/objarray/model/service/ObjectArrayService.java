package edu.kh.objarray.model.service;

import java.util.Scanner;

import edu.kh.objarray.model.vo.Book;

public class ObjectArrayService {
	private Book[] books = null;
	private Scanner sc = new Scanner(System.in);
	
	
	public void displayMenu() {
		int sel = 0;
		do {
			System.out.println("==================");
			
			System.out.println("1.�ʱ�ȭ1");
			System.out.println("2.�ʱ�ȭ2");
			System.out.println("3.��� å ���� ���");
			System.out.println("4.��� å ���� ���");
			System.out.println("5.���� �˻�");
			System.out.println("6.10%�� ���� ����");
			System.out.println("0.���α׷� ����");
			System.out.println("==================");
			System.out.print("�޴� ���� : ");
			sel = sc.nextInt();
			sc.nextLine();
//			���� Ŭ���� ������ �ʵ� �޼ҵ�� �ܼ��� �̸��� �ۼ��ϴ� ������ ȣ���� �����ϴ�.
			switch(sel) {
			case 1 : init1();break;
			case 2 : init2();break;
			case 3 : printBooks();break;
			case 4 : System.out.println(printTitle());break;
			case 5 : System.out.println(searchAuthor());break;
			case 6 : priceCut(10);break;
			
			case 0 : System.out.println("���α׷��� �����մϴ�"); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}while(sel != 0);
	}
	
	public void init1() {
//		3ĭ¥�� Book �迭�������Ͽ� �� �迭 ��Ҹ� �ʱ�ȭ
		
		books = new Book[3];
		
		books[0] = new Book();
		books[0].setTitle("�ڹ��� ����");
		books[0].setContent("�ڹ��� ���� ������ ��������.");
		books[0].setAuthor("���ü�");
		books[0].setPublisher("��������");
		books[0].setPrice(30000);
				
		books[1] = new Book("�����", "������� �̾߱�", "�����㺣��", "����", 10000);
		books[2] = new Book("�ﱹ��", "��������", "�̹���", "�˿���ġ�ڸ���", 1300000);
		
		
		
	}
	public void printBooks() {
//		System.out.println(books[0].toString());
//		System.out.println(books[1].toString());
//		System.out.println(books[2].toString());
//
//		for(int i = 0; i<books.length; i++) {
//			System.out.println(books[i].toString());
//		}
//		3.���� for�� (for each��)
//		ó������ ������ �迭,�÷��ǵ��� ��� ��Ҹ� �����Ҷ� ���
//		for(�迭���� ���� ���� ������ ���� :�迭��){
//		�ݺ� ������ ����
//		}
		for(Book book : books) {
			System.out.println(book.toString());
		}
		
	}
	public void init2() {
	
		books = new Book[5];
		for(int i=0; i<books.length; i++) {
			System.out.print("���� : ");
			String title = sc.nextLine();
			System.out.print("���� : ");
			String content = sc.nextLine();
			System.out.print("���� : ");
			String author = sc.nextLine();
			System.out.print("���ǻ� : ");
			String publisher = sc.nextLine();
			System.out.print("���� : ");
			int price = sc.nextInt();
			sc.nextLine();//�Է¹��ڿ� ���� ���๮�� ����
			
			books[i] = new Book(title, content, author, publisher, price);
		}
	}
	public String printTitle() {
		
		String str = "";
		for(Book book : books) {
			str+=book.getTitle()+"\n";
			
		}
		return str;
	}
	public String searchAuthor() {
		
		while(true) {
			System.out.print("�����Է� : ");
			String in = sc.nextLine();
		
			for(Book book : books) {
				if(book.getAuthor().equals(in)) {
					return book.toString();
				}
			}
			System.out.println("�ٽ� �Է����ּ���");
		}

	}
	public void priceCut (int cut) {
//		System.out.print("������(1~99) : ");
//		int cut = sc.nextInt();
		
		if (cut>0 && cut<100) {
			for(Book book:books) {
			book.setPrice((int)(book.getPrice()*(1-(cut/100.0) )));
				
			}
		}else {
			System.out.println("1~99������ ���� �Է��ϼ���");
		}
	}
}
