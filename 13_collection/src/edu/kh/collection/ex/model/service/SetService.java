package edu.kh.collection.ex.model.service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetService {
	
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
}
