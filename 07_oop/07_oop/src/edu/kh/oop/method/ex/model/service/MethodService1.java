package edu.kh.oop.method.ex.model.service;

import edu.kh.oop.method.ex.model.vo.Product;

public class MethodService1 {
//	�Ű�����x ��ȯ��x �޼ҵ�
	public void example1() {
		System.out.println("�Ű�����,��ȯ�� ��� ���� �޼ҵ�");
 }
//	�Ű�����o ��ȯ��x �޼ҵ�
	public void sum(int num1, int num2, int num3) {
	 	System.out.printf("%d + %d + %d = %d\n",num1,num2,num3,num1+num2+num3);
	}
	
	public void doublePlusMinus(double num1, double num2, double num3)  {
		System.out.printf("%f + %f - %f = %f\n",num1, num2, num3, num1+num2-num3);	
	}
	
//	�Ű�����o(�迭) ��ȯ��x �޼ҵ�
	public void arrSum(int[] arr) {
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("�հ� : " + sum);
	}
	
//	�Ű�����o(Ŭ����) ��ȯ��o(Stirng) �޼ҵ�
	public String productString(Product prd) {
		String result = prd.getpName() + "/" + prd.getPrice() + "/" + prd.getSerialNumber();
		return result;
//		return ����޼ҵ带 �����ϰ� ���Ե� ���� ��ȯ�Ѵ�.
		
	}
	
}
