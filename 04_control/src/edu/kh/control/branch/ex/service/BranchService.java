package edu.kh.control.branch.ex.service;

import java.util.Scanner;

public class BranchService {
	Scanner sc = new Scanner(System.in);
	
//	�б⹮           : ���� ����� �ݺ������� ������ ��ħ
//	break    : �ݺ����� �����Ű�� ����
//	contiune : �ݺ��� �������� ��� �����ϸ� ���� �� for�������� ���������� while�������� ���� �ݺ����� �ǳ� �� 
	public void example1() {
		int sum = 0;
		
		
		while(true) {
			System.out.print("�����Է� : ");
			int num = sc.nextInt();
			sum += num;
			if(num == 0) {
				break;
			}
		}
		System.out.println("�հ� : "+sum);
	}
	
	public void example2() {
		String result = "";
		
		while(true) {
			System.out.print("�ܾ��Է� : ");
			String str = sc.nextLine();
			if(str.equals("end")) {
				break;
			}
		
			result += str+" ";
			
		}
		System.out.println("��� : "+result);
	}
	public void example3() {
		int sum = 0;
		
		for(int i = 1; i<101; i++) {
			if(i%3==0) {
				continue;
			}
				sum += i;
		}
		System.out.println("�հ� : "+sum);
	}
	public void example4() {
		for(int i= 1; i<10; i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println("===="+i+"��====");
			for(int j=1; j<10; j++) {
				if(j%2==1) {
					continue;
				}System.out.println(i+" * "+j+" = " +i*j);
				
			}
		}		
	}
}
