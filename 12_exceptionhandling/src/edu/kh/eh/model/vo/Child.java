package edu.kh.eh.model.vo;

import java.io.IOException;

public class Child extends Parent {
	@Override
	public void ex1() throws ArithmeticException{
//		ArithmeticException�� RuntimeException�� �ڽ�
	}
	
	@Override
	public void ex2() throws RuntimeException, IOException {
//		�ڽ��� �������̵� ��  ������ ó���� �� �ְų� �������� �ڵ尡 ���ܸ� �߻���Ű�� ������ throws�� �ۼ��� ���ܸ� ������ ���� �Ǵ� �ۼ����� ���� �� �ִ�.
		
	}
}
