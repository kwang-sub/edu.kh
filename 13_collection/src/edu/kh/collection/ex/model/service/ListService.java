package edu.kh.collection.ex.model.service;

import java.util.ArrayList;
import java.util.List;

import edu.kh.collection.ex.model.vo.Student;

//	Collection : �ڹٿ��� �����ϴ� �ڷᱸ���� ����ϴ� �����ӿ�ũ
// 	�ݷ��� ����
//	1.ũ�� ������ ����.
//  2.�߰�, ����, �˻�, ���ĵ��� ����� ����Ǿ� �ִ�.
//	3.���� ������ Ÿ���� ������ �� �ִ�. (�� �⺻ �ڷ����� Wrapper Class�� �����ؼ� �����Ѵ�.)
//
//
//	List : ������ �����Ǹ� �ߺ� ������ ������ �����ϴ�.(�����Ͱ� ���������� ������ �迭�� ����� ���)
//	1.add(E e) : ����Ʈ�� ���� �ν��Ͻ� �����͸� �߰��ϴ� �޼ҵ�
//	2.set(int index,E e ) : List ���� index��° ��Ҹ� e�� ����
//	3.Object remove(int index) : List ���� index��° ��Ҹ� �����ϰ� �߰��� ��ĭ�� ������ index��° �ڿ� ��ҵ��� ��ĭ�� ����.
//
//	4.Generics(���׸�) <E> : Ŭ����, �޼ҵ�, �÷��� ���ο� ���� Ŭ���� Ÿ���� �� ������ �����ϴ� ���. �÷��ǿ� ���� Ÿ���� ����Ǹ� �ʿ�� ���� Ÿ�԰˻�, ����ȯ�� ���÷� �Ͼ�� ������ �Ѱ��� Ÿ������ �����ϴ°��̴�.
//	���׸� ����
//	-�ϳ��� Ÿ������ ���ѵǱ� ������ Ÿ�԰˻�, ����ȯ�� �ʿ����.
//	-�ϳ��� �ڵ�� ���� Ÿ�� ó���� �����ϴ�.
//	5.int indexOf(object o) : o�� �����ϴ� ��ü�� ���� ��ü�� List�� ������ Ȯ���Ͽ� ������ ���� ��ü�� index ������-1�� ��ȯ�Ѵ�.

public class ListService {
	public void example1() {
//		ArrayList : List�� �ļ�, �迭ó�� ��� ���������� �迭�� ������ ���ϵǾ��ִ�.
		ArrayList list = new ArrayList();  //�ʱ�뷮 10
		
		ArrayList list2 = new ArrayList(3);
		
		list2.add("Hello World");
		list2.add("����Ŀ�");
		list2.add(10);
		list2.add(3.14);
		System.out.println(list2.toString());
		for(Object l2 : list2) {
			System.out.println(l2);
		}
		System.out.println("-----------------");
		System.out.println("[�Ϲ� for�� ���]");
		System.out.println("size : " + list2.size());
		for(int i=0; i<list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		Object obj = list2.set(1, new Student("ȫ�浿", 12, 1));
		System.out.println("��ȯ�� : " + obj);
		System.out.println(list2);
		Object obj2 = list2.remove(2);
		System.out.println("���ŵ� 2�� �ε��� ���� : " + obj2);
		System.out.println(list2);
		
		for(Object o : list2) {
			if(o instanceof String) {
				System.out.println("String : " + o);
			}else if(o instanceof Double) {
				System.out.println("Double : " + o);
			}else if(o instanceof Student) {
				System.out.println("Student : " + ((Student)o).getName());
			}
		}
		
	}
	public void example2() {
		List<Student> list = new ArrayList<Student>();
//		ArrayList�� �������̽� List�� ��ӹ޾� ������ Ŭ���� (��ĳ����)
		list.add(new Student("�輼��", 17, 1));
		list.add(new Student("�ֱ���", 14, 2));
		list.add(new Student("ȫ�浿", 19, 3));
		for(Student s : list) {
			System.out.println(s.getName());
		}
		Student removeStudent = list.remove(1);
		System.out.println("�����л� : " + removeStudent);
		for(Student s : list) {
			System.out.println(s);
		}
		int index = list.indexOf(new Student("ȫ�浿", 19, 3));
		System.out.println("�Ż��Ӵ��� index : " + index);
		
		System.out.println("list�� ����ִ°� ? " + list.isEmpty());//����Ʈ ����ִ��� Ȯ��
		list.clear();
		System.out.println("clear()�� list�� ����ִ°� ? " + list.isEmpty());//����Ʈ ����ִ��� Ȯ��
		
	}
}
