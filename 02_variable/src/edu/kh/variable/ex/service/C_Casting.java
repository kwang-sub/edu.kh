package edu.kh.variable.ex.service;

public class C_Casting {
//	����ȯ
//	��ǻ�Ϳ����� �� ó�� ��Ģ
//	1.���� ������ �ڷ����� ���� ����
//	2.���� ���� �ڷ����� ��갡��
//	3.����� ����� ���� ������ �ڷ����� ���;� ��
//	->��Ģ�� �������� ���� �� ����ȯ�� �ʿ�(�ڵ�����ȯ,��������ȯ)
	public void example1() {
//		�ڵ�����ȯ:���� ������ ���� �ڷ����� ū �ڷ��� ���� ����� �����Ϸ��� �ڵ�����
//		������ ���� �ڷ����� ū �ڷ����� ���� ���·� ��ȯ��Ű�°�.
		
		int iNum = 12;
		double dNum = 3.3;
		System.out.println(iNum+dNum);
		double result = iNum + dNum;
		System.out.println("result: " + result);
		
		int iNum2 = 2147483647;
		long lNum2 = 1000000000L;
	    long result2 = iNum2 + lNum2;
		System.out.println(result2);
		
		float fNum3 = 1.2f;
		double dNum3 = fNum3;
//		long -> float
//		float�� ���� ������ long���� ũ�⶧���� �ڵ�����ȯ����
		long lNum4 = Long.MAX_VALUE;
		float fNum4 = lNum4;
		
		System.out.println("lNum4: " + lNum4);
		System.out.println("fNum4: " + fNum4);
		
		char ch5 = 'A';
		int iNum5 = ch5;
		System.out.println(iNum5);
		
		char ch6 =65;
//		������ ���� �ʴ� ����:
//		char �ڷ����� ���� 0~65535 ������ ������ �����ϴ� ����
//		�׷��� char �ڷ����� ���ڸ� �����ϴ°� ������ ���� �ʴ´�.
//		�׷��� ������ ��Ÿ�� �� �ִ� ǥ����� int,long �� ���� ������.
//		���� ������ char ���� ǥ����� ������ �ʰ� ���Խ�
//		�ۼ��Ǵ� int ǥ����� char �ڷ��� ������ �ν��ϰ� java���� ���ص�
		
		System.out.println("ch6: " + ch6);
		
	}
			 
	public void example2() {
//		��������ȯ:���� ������ ū �ڷ����� ���� ������ ���� �ڷ������� ��ȯ
//		->ū �����͸� �߶� �־�� �ϸ� ������ �ڵ����� ������� ���ϰ� ������ ���� ���Ѿ���.
		int iNum = 290;
		byte bNum = (byte)iNum;
		System.out.println(iNum);
		System.out.println(bNum);
	
//		�Ǽ���->������ ��������ȯ
		int iNum2 = 10;
		double dNum2 = 1.25;
		System.out.println(iNum2*dNum2);
		int result2 = (int)(iNum2*dNum2);	
		System.out.println(result2);
		System.out.println(iNum2*(int)dNum2);
		int iNum3 = 65;
		
		char ch3 = 65;//char�� �� ���Խ� int ���ͷ� ǥ����� ����� �� �ִ�.
		char ch4 = (char)iNum3;
		System.out.println("ch3:"+ch3);
		System.out.println("ch4:"+ch4);
	}
	
	public void example3() {
		
		int views = 2147483647;
		System.out.println("views: " + views);
		
		int views2 = views + 1;
		System.out.println("views2: " + views2);
//		������ �����÷ο�� �ڵ�� �������� ->������ ������ �߻����� �ʵ��� ��ȹ,����ܰ迡�� ������ ���ؾ���.
	}
	public void example4() {
		String name = "ȫ�浿";
		int age = 20;
		double height = 180.45;
//		ȫ�浿���� 20���̸�, Ű�� 180.45cm �Դϴ�
		
		System.out.println(name+"���� "+age+"���̸�, Ű�� "+height+"cm �Դϴ�.");
		System.out.printf("%s���� %d���̸�, Ű�� %.2fcm �Դϴ�.", name, age, height);
	}
	
	
}
