package edu.kh.poly.ex2.model.vo;

public interface ElectronicProduct {
	
	 public static final int KOREA_VOLT = 220;
	 static final int JAPAN_VOLT = 110;
//	 public�� �ۼ����� �ʾƵ� public���� �νĵ�

	 int USA_VOLT1 = 115;
	 static int USA_VOLT2 = 230;
	 
	 
	 
	 public abstract void powerOn();
	 
	 void powerOff();
	 
//	 �θ�                �ڽ�
//	�������̽� - �������̽�
	 
	 
}
