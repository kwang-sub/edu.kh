package edu.kh.oop.field.ex.model.service;

import edu.kh.oop.field.ex.model.vo.Korean;

public class FieldService {

//	static(����,����)
//	JVM static �޸� ����(static����,�����޸𸮿���,��������,�޼ҵ念��,Ŭ��������)
//	
//	�ʵ弼��ȭ
//	
//	-�������(�ν��Ͻ�����) 
//	  ���� : new �����ڸ� ����  Heap ������ ��ü(�ν��Ͻ�)�� ���� �� �� �����ȴ�.
//	  �Ҹ� : ��ü�� ��� ���� �������� �������� ���� �� ���� �ð� �� GC�� ���ؼ� �Ҹ�ȴ�. 
//	
//	-Ŭ��������(static ���� ���� ����)  
//	  ���� : ���α׷� ���� �� static ������ �����ȴ�.
//	  �Ҹ�  : ���α׷� ���� �� �Ҹ�ȴ�.
	public void example1() {
		Korean k1 = new Korean();
		Korean k2 = new Korean();
		Korean k3 = new Korean();
		
		k1.setName("ȫ�浿");
		k1.setId("12313-156165");
		
		k2.setName("�ֱ���");
		k2.setId("15616-1561651");
		
		k3.setName("�輼��");
		k3.setId("151656-15616");
		System.out.println(Korean.language);
//		k1.setNationalCode(1);
//		k2.setNationalCode(1);
//		k3.setNationalCode(1);
		
		Korean.nationalCode =1;//Ŭ��������(static����)
		
		System.out.println(k1.toString());
		System.out.println(k2.toString());
		System.out.println(k3.toString());
		
	}

}
