package edu.kh.collection.ex.model.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetService {
	
private static final boolean InputMismatchException = false;
//	Set	(����)
//	-������ ���� ���� �ʴ´�.
//	-�ߺ� ������ ���� �Ұ����ϴ�.
//	-> �ߺ� Ȯ���� ���ؼ� equals()�� �ݵ�� �������̵� �Ǿ��־�� �Ѵ�.
//	
//	HashSet
//	- ��ü ���� �� hashCode() (�ؽ��Լ�)�� �̿��� ���� ó���� �ߺ��˻簡 ������ set
//	-equals()�Ӹ� �ƴ϶� hashCode()�� �������̵� �Ǿ� �־�� �Ѵ�.
//	
//	1.Iterator(�ݺ���) : �÷��� �����ӿ�ũ���� �����ϴ� �÷��� ��ü ��Ҹ� �ϳ��� �ݺ� ������ ������ ���
//	TreeSet : ���� Ʈ�� �ڷ� ������ �̿��� ����� �����Ͱ� �ڵ� ���ĵǴ� Set(Set�̱� ������ ������ �ߺ� ���� �Ұ�)
	public void example1() {
		Set<String> set1 = new HashSet<String>();
		
		set1.add(new String("Apple"));
		set1.add(new String("Samsung"));
		set1.add(new String("LG"));
		set1.add(new String("Apple"));
		set1.add(new String("��"));
		set1.add(new String("��"));
		set1.add(new String("��"));
		set1.add(new String("�ֱ���"));
		System.out.println(set1);
		
		Iterator<String> it = set1.iterator();
//		set1���տ� ����� ������ �ϳ��� �����ü� �ִ� ���·� �����ϴ� �޼ҵ�
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-----------------");
		for(String s : set1) {
			System.out.println(s);
		}
	}
	public void lotto1() {
		Set<Integer> lotto = new HashSet<Integer>();
		
		while(true) {
			int ran = (int)(Math.random()*45+1);
			lotto.add(ran);
			if(lotto.size() ==6) {
				break;
			}
		}
		System.out.println(lotto);
	}
	public void example2() {
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new LinkedHashSet<String>();
		
		for(int i =0; i<20; i++) {	
			set2.add("a" +i);
			set1.add("a"+i);
		}
		System.out.println(set1);
		System.out.println(set2);
		Iterator<String> it = set1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("=============");
		for(String s : set2) {
			System.out.println(s);
		}
	}
	public void lotto2() {
		Set<Integer>lotto = new TreeSet<Integer>();
		while(true) {
			int ran=(int)(Math.random()*45+1);
			lotto.add(ran);
			if(lotto.size()==6) {
				break;
			}
		}
		System.out.println(lotto);
	}
	public void example3() {
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			try{
				
				System.out.print("�ݾ��Է� : ");
				int in = sc.nextInt();
			if(in<1000) {
				System.out.println("1000�� �̻� �Է����ּ���");
			}else if(in >100000) {
				System.out.println("10���� ���� ������ ���� �����մϴ�");
			}else {
				
				List<Set<Integer>> sum =new ArrayList<Set<Integer>>();
				
				for(int i = 0; i<(in/1000); i++) {
					Set<Integer>lotto = new TreeSet<Integer>();
					while(true) {
						lotto.add((int)(Math.random()*45+1));
						if(lotto.size()==6) {
							break;
						}
					}
					sum.add(lotto);
				}
				for(Set<Integer> s : sum) {
					System.out.println(s);
				}
				break;
			}
			
			}catch(InputMismatchException e) {
				System.out.println("Ÿ���� �߸� �ԷµǾ����ϴ�.");
			}
		}
	}
}
