package edu.kh.oop.field.ex;

public class FieldTest2 {
	
	public void ex2() {
//		FieldTest1 ��ü����
		FieldTest1 test1 = new FieldTest1();
		
//		FieldTest2�� FieldTest1�� ���� ��Ű��, �ٸ� Ŭ����
		
//		FieldTest1�� �ִ� �ʵ� temp1~4���
		System.out.println(test1.temp1);
		System.out.println(test1.temp2);
		System.out.println(test1.temp3);
		System.out.println(test1.getTemp4());
//		The field FieldTest1.temp4 is not visible
//		-> temp4�� �Ⱥ��δ� -->private���� �ܺ������� �����ؼ� �ȵȴ�.
		
//		���� temp4�� ��� ���� �ʹٸ� ��� �ؾߵǴ°�?
//		FieldTest1 Ŭ������ getter �޼ҵ带 �ۼ�
		
		
	}
}
