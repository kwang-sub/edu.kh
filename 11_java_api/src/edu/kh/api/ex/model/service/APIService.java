package edu.kh.api.ex.model.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.sound.midi.SysexMessage;

import edu.kh.api.ex.model.vo.Student;

public class APIService {
	public void example1() {
		Student std1 = new Student("ȫ�浿", 3, 2);
		Student std2 = new Student("ȫ�浿", 3, 5);
		System.out.println(std1);
		System.out.println(std1.equals(std2));
		
		System.out.println(std1.hashCode());
	}
	
	
	
	public void example2() {
//		String ���ͷ��� ������ ���ڿ��� String Pool�̶�� Heap���� ������ ������.
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		
		System.out.print("abc �Է� : ");
		String str4 = sc.next();
		
		System.out.println(str1 == str2);
//		String ���ͷ��� "abc"�� �ʱ�ȭ�� str1, str2�� String Pool�� �ִ� ���� "abc"�� �ּҸ� �����Ѵ�.
		
		System.out.println(str1 == str3);
		System.out.println(str1 == str4);
		System.out.println("std1 : " + System.identityHashCode(str1));
		System.out.println("std2 : " + System.identityHashCode(str2));
		System.out.println("std3 : " + System.identityHashCode(str3));
		System.out.println("std4 : " + System.identityHashCode(str4));
		
//		System.identityHashCode()�� ����Ͽ� str1�� str2�� �����ϴ� �ּҰ� ������ ������ Ȯ���Ѵ� ������ �ڹٴ� ���� �޸� �ּҸ� ������ ������ �޸� �ּҸ� �̿��� ������ ���¿�  ���ڷ� ��ȯ�Ͽ� �����ش�.
//		
		
	}
	public void example3() {
//		String�� �Һ���
//		String �ڷ����� ���� �ѹ� �޸𸮿� ����Ǹ� ����� ���� �� ����.
//		
//		String �Һ������� ���� �߻��ϴ� �������� ���� ����  String ��ü�� �ݺ������� �̾��, �������� �̷������ �Ǹ� �� �� ���� ���ο� String ��ü�� �����Ǳ� ������ ���� �޸� �Һ� �߱��Ѵ�.
		
		String str1 = "abc";
		System.out.println("def �߰��� : " + System.identityHashCode(str1));
		str1 += "def";
		System.out.println(str1);
		System.out.println("def �߰��� : " + System.identityHashCode(str1));
		
//		String result = "";
//		for(int i = 0; i<10000; i++) {
//			result += i;
//			System.out.println(result);
//		}
	}
	public void example4() {
//		String �Һ��� ���� �ذ�
//		StringBuffer, StringBuilder(������) : ���ڿ� ���� ���ص� ���� ��ü ������ ��ȭ�� �̷������. �� Ŭ������ StringBuffer�� ����ȭ�� �����ϰ� StringBuilder�� �������� �ʴ´ٴ� �������� �ְ� ����� �����ϴ�.
//		Buffer : ��ǻ�Ͱ� �����͸� �����ϴ� �޸� ����
		StringBuffer sb1 = new StringBuffer();
		System.out.println("abc �߰��� �뷮 : " + sb1.capacity());
		System.out.println("abc �߰��� �ּ� : " + System.identityHashCode(sb1));
		sb1.append("abc"); //append(��) : ���ڿ� ���� �ڿ� �߰�
		System.out.println("abc �߰��� �뷮 : " + sb1.capacity());
		System.out.println("abc �߰��� �ּ� : " + System.identityHashCode(sb1));
		sb1.append("defghijklmnopqrstuvwxyz");
		System.out.println(sb1.toString());
		System.out.println("abc �߰��� �뷮 : " + sb1.capacity());
		
		
		StringBuilder sb2 = new StringBuilder(5);
		sb2.append("Hello Word!!");
		System.out.println("abc �߰��� �뷮 : " + sb2.capacity());
		System.out.println(sb2.toString());
		
		System.out.println("abc �߰��� �ּ� : " + System.identityHashCode(sb1));
		
	}
	public void example5() {
//		boolean contains(CharSequence s) : Ư�� �ܾ ���ڿ��� ���ԵǾ� �ִ��� Ȯ��
		
		String str1 = "Hello World";
		System.out.println(str1.contains("World"));
		
//		String indexOf(String str) : Ư�� ���ڿ��� �����ϴ� �ε����� ��ȯ ������ -1�� ��ȯ�ϰ� �ߺ��Ǵ� ���ڿ��� �ִٸ� �տ��� �˻��ؼ� ù��°�ε����� ��ȯ�Ѵ�
		String str2 = "abcdef abcdef";
		System.out.println(str2.indexOf("c"));
		System.out.println(str2.lastIndexOf("c"));
		System.out.println(str2.indexOf("z"));
		
//		String[] split(String ������) : �����ڸ� �������� �ϳ��� ���ڿ��� �и��Ͽ� String[] ���·� ��ȯ�Ѵ�
		String str3 = "���,�ٳ���,����,���ξ���,������,���,������";
		String[] arr = str3.split(",");
		for(String s : arr) {
			System.out.println(s);
		}
		
		
//		join(CharSequence delimiter, CharSequence... elements) : �迭�� �����ڸ� �̿��Ͽ� �ϳ��� String ���� ��ȯ
		
		String str4 = String.join("/", arr);
		
		System.out.println(str4);
		
//		StringTokenizer : ���ڿ��� ������ �����ڷ� �ɰ��� �ϳ��� ������� ��ȯ�ϴ� ��ü(������ �������� ������ ������ ������ �ȴ�.) split()���� �����ڸ� �پ��ϰ� �����Ҽ� �ְ� �ӵ��� ������
		
		String str5 = "aa bb cc";
		StringTokenizer st1 = new StringTokenizer(str5);
		
			//���� ��ū�� �ִ��� �˻��ϴ� �޼ҵ�
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
			
		}
		String str6 = "AA/BB,CC~DD";
		StringTokenizer st2 = new StringTokenizer(str6,"/,~");
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
	}
	public void example6() {
//		��¥ ���� Ŭ���� Date :���� ������, �޼ҵ尡 ���̻� ������ �ʴ� ���� Ŭ�������� DB Date�� ���谡 �ִ�.
//		Date(); : �⺻�����ڷ� ����ð��� �˷��ش�.
		Date date1 = new Date();
		System.out.println(date1);
		
//		Date(long date) : 1970�� 1�� 1�� 00:00 GMT�� �������� �� �и������� ���� �ð��� ��ü�� ��ϵ�. �и�������(ms) = 1/1000��
		Date date2 = new Date(0L);
		System.out.println(date2);
//		�츮���� �������δ� 1970/1/1 09:00��µȴ�
		Date date3 = new Date(1000L*60*60*24);
		System.out.println(date3);
//		���� �ð����� ���� 24�ð� �� ���
		Date date4 = new Date(System.currentTimeMillis() -(1000L*60*60*24) );
		System.out.println(System.currentTimeMillis());
		System.out.println(date4);
		
//		SimpleDateFormat : ��¥�� ���ϴ� �������� ������ �����ϴ� ����� ����
		
		SimpleDateFormat sdf = new SimpleDateFormat("G yyyy�� MM�� dd�� E���� HH�� mm�� ss��");
		String text = sdf.format(date4);
		System.out.println(text);
		
		
	}
	public void example7() {
//		Math Ŭ���� : ��� �ʵ�� �޼ҵ�� static�̴�.�׷��Ƿ� ������ ��ü������ ���� �ʴ´�.
		double d1 = 360.45;
		int ran = (int)(Math.random()*50+1);
		System.out.println(Math.ceil(d1*10)/10);
		System.out.println(Math.round(d1));
		System.out.println(Math.floor(d1));
		System.out.println(ran);
		
	}
	public void example8() {
//		WrapperŬ���� : �⺻�ڷ����� ��ü ���·� ��ȯ�ϴ� Ŭ������ ��Ī�Ѵ�
//		
//		�������
//		�� �ڷ������� �ʿ��� �ʵ�, ����� �����ϱ� ���ؼ��̴�.
//		ex) Integer.MAX_VALUE; : int �ִ밪
//			Integer.parseInt("123"); : String�� int�� ��ȯ
//		
//		�÷��ǿ� �������� ������ �� �ְ� �ϱ� ���ؼ� �̴�.
//		
//		
//		�⺻�ڷ���             Wrapper Ŭ����
//		byte			Byte
//		short	  		Short
//		int				Integer
//		long 			Long
//		float			Float
//		double			Double
//		char			Character
//		boolean 		Boolean
		
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.TYPE);
		
		int iNum = Integer.parseInt("10000");
		System.out.println(iNum+10000);
		
		long lNum = Long.parseLong("10000");
		
		double dNum = Double.parseDouble("3.12345678901234567890");
		double fNum = Float.parseFloat("3.1234567890123456790");
		System.out.println(dNum);
		System.out.println(fNum);
		
		
		int num =123;
		String str = Integer.valueOf(num).toString();
		
//		Boxing : �⺻�ڷ��� -> ��ü�� ����
		Integer i1 = new Integer(10);
		Integer i2 = new Integer("20");
		
		System.out.println(i1.toString());
		System.out.println(i2);
		
//		unBoxing : Wrapper ��ü -> �⺻�ڷ���
		int u1 = i1.intValue();
		int u2 = (int)i2;
		
//		autoBoxing / AutoUnBoxing
//		�ڵ����� �⺻ �ڷ��� <->Wrapper ��ü ����ȯ
//		Java9 ���� ���ĺ��ʹ� AutoBoxing/AutoUnBoxing�� ������
	}
	
}
