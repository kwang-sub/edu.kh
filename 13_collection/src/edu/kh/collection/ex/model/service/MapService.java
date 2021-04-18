package edu.kh.collection.ex.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Set;

import edu.kh.collection.ex.model.vo.Student;

public class MapService {
	
//	Map : Key�� Value �� ���� �ϳ��� �����Ͱ� �Ǿ� �̸� ��Ƶ� ��ü
//	Key�� �ߺ��� ������� �ʰ�  Map ���ο� �������� ���ĵȴ�.(Set�� Ư¡)
//	Value�� Key�� ���ؼ� �ߺ��Ǵ� ���� ����Ǿ ������ �ȴ�.(List�� Ư¡)
//	Map�� �ߺ��Ǵ� Ű�� ���� �����Ͱ� ������ �ߺ����� �Ǵ��� �����ϴ� ���� �ƴ� Ű�� �����ϵ� Value�� ���ο� �����ͷ� ����
//	HashMap : Key�� �ش�Ǵ� ��ü�� hashCode(), equals() �������̵� �Ǿ���Ѵ�.
//	Set<E> = keySet() : Map �������� Key�� �ϳ��� �������� ����� ��ȯ\
//	E = get(Object key) : Map���� key ���� ��ġ�ϴ� �������� value�� ��ȯ
//	Set<Map.Entry<K, V>> �������� = ��ü.entrySet() : Map�� Ű�� �� ������ ������ Map.Entry Set ��ü�� ��� ��ȯ (Map.Entry == K,V ���� �ѹ��� ��Ÿ���� ��ü)
	public void exameple1(){
		Map<String, Student> map = new LinkedHashMap<String, Student>();
		
		Student std1 = new Student("ȫ�浿",17,1);
		map.put("H001", std1);
		map.put("M001", new Student("�Ż��Ӵ�", 15, 2));
		map.put("H002", new Student("�ֱ���", 28, 1));
		map.put("H003", new Student("�輼��", 26, 1));
		
		System.out.println(map);
		Set<String> set = map.keySet();
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Student value = map.get(key);
			
			System.out.println(key+ " = " + value);
		}
	}
	public void example2() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		int number = 1;
		map.put(number++, "���");
		map.put(number++, "���");
		map.put(number++, "��ġ�");
		map.put(number++, "����");
		System.out.println(map);
		map.put(1, "ġŲ");
		System.out.println(map);
		
		
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		Iterator<Map.Entry<Integer, String>> it = entrySet.iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey() + " = " + entry.getValue());

		}
		System.out.println("===========");
		for(Entry<Integer, String> s : entrySet) {
			
			System.out.println(s.getKey() + " = " + s.getValue());
		}
		
		
	}
//	public void d() {
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		do{
//			System.out.println("�α���  ");
//			System.out.println("ȸ������  ");
//			try {
//				System.out.println("��ȣ�Է� : ");
//				num = sc.nextInt();				
//			}catch(InputMismatchException e) {
//				System.out.println("���� �Է����ּ���");
//			}
//			switch(num) {
//				case 1 : break;
//				case 2 : break;
//				default : System.out.println("���� �Է����ּ���");
//			}
//			
//		}while(num ==0);
//	}
//	public void ȸ������() {
//		ArrayList<String> kwang = new ArrayList<String>();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���̵� �Է����ּ��� : ");
//		String id = sc.next();
//		System.out.println("��й�ȣ �Է� : ");
//		String pw = sc.next();
//		
//		
//	}
}
