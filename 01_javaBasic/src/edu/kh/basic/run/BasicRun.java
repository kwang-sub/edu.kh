package edu.kh.basic.run;

import edu.kh.basic.service.BasicService;

public class BasicRun {
//	��Ű��:���õ� Ŭ������ ��Ƶδ� ����
//	run ��Ű��:���� ���õ� Ŭ���� ��Ƶδ� ����
//	run Ŭ����:���� ���� �ҽ��ڵ带 ��Ƶδ� ����
//	main �޼ҵ�:�ڹ� ���α׷��� �����ϱ� ���� �޼ҵ�
//	method:���
	public static void main(String[] args) {
		
//		System.out.println("BacicRun ����");
//		�ٸ� Ŭ������ �ִ� �޼ҵ带 ���� �ϴ� ���
		BasicService service = new BasicService();
//		[ȣ���� �޼ҵ尡 �ִ� Ŭ������] [������] = new [ȣ���� �޼ҵ尡 �ִ� Ŭ������]
		service.printMessage();
		service.printTotal();
		
	}
}
