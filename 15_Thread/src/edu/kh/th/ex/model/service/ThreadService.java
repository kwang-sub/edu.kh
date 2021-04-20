package edu.kh.th.ex.model.service;

import java.util.Scanner;

import edu.kh.th.ex.model.thread.ThreadEx1;
import edu.kh.th.ex.model.thread.ThreadEx2;
import edu.kh.th.ex.model.thread.ThreadEx3;
import edu.kh.th.ex.model.thread.ThreadEx4;

public class ThreadService {
	public void example1() {
		ThreadEx1 th1 = new ThreadEx1();
//		th1.run();
		th1.start();
		ThreadEx2 th2 = new ThreadEx2();
//		th2.run();
		Thread thread = new Thread(th2,"������2");
		thread.start();
		
	}
	public void example2() {
//		������ �켱 ���� Ȯ��
		for(int i=1; i<=20; i++) {
			ThreadEx3 th3 = new ThreadEx3();
			Thread t = new Thread(th3,"������" + i);
			if(i==10) {//10��° �����尡 �ֿ켱���� ����
				t.setPriority(Thread.MAX_PRIORITY);
			}else {
				t.setPriority(Thread.MIN_PRIORITY);
			}
			t.start();
		}
	}
	public void example3() {
		Thread t1 = new Thread(new ThreadEx4(3),"1��");
		Thread t2 = new Thread(new ThreadEx4(7),"2��");
		Thread t3 = new Thread(new ThreadEx4(20),"3��");
		System.out.println("����");
//		t1.start();
//		t2.start();
		t3.start();
		Scanner sc = new Scanner(System.in);
		System.out.println("�ƹ� ���̳� �Է��ϼ��� : ");
		String input = sc.next();
		
		t3.interrupt();//�ƹ� ���̳� �Է� ������ t3������ ������ �����.
		
		System.out.println(t1.isInterrupted());
		System.out.println(t2.isInterrupted());
		System.out.println(t3.isInterrupted());
		
	}
}
