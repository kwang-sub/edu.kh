package edu.kh.io.model.service;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
//	File Ŭ���� : ���� �Ǵ� ������ �ٷ� �� �ִ� �ڹ� ���� Ŭ�����̰� ��ü ���� �� ���� �Ǵ� ������ ���ϸ��� �Ű������� �ۼ�
//	boolean createNewFile() : ���� ���� �޼ҵ�� ���� ���� ������ true ���н� false�� ��ȯ�Ѵ�.�׸��� IOException�� �߻� ��ų ���ɼ��� �ִ�.
//	����Ʈ ��� ��Ʈ�� : 1byte ������ �����͸� ��/����ϴ� ��Ʈ��
//	FileInputStream : ������ ������ 1byte�� �Է� �޴� ��Ʈ���̰� ��ü ���� �� FileNotFoundException ����ó���� �ʿ��ϴ�.
//	Stream ���� ��ü���� �޸𸮸� �Һ��ϴ� �ڿ����� ����� ���α׷������� ��η� �ش��� ��Ȳ������ ����������, �Ǽ��ڵ� ���� ħ���� ������ �� �ִ�.
//	���Ϸ�� Stream�� finally�� �̿��Ͽ� �ʼ��� �ݾ���� �Ѵ�.
//	int read() : ������ �����͸� 1byte�� ������� �о�´�. ������ ������ -1��ȯ
//	FileOutputStream : 1����Ʈ ������ ���Ϸ� ������ ����ϴ�  ���α׷� 
//			�Ű������� �ۼ��� ���ϸ�� ���� ������ ������ �� ������ �����ϰ� ������ �����
//			FileOutputStream("���ϸ�",true) :
//			-true ���ۼ��� �����
//			-true �ۼ��� �̾��
//
//	���� ��� ��Ʈ�� : 2byte ����(�����ڵ�) ������ �����͸� ��/����ϴ� ���� ���� ��Ʈ��
//	BufferedReader : 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOService {
	public void example1() {
//	�������� �ʴ� ���� test1.txt������ ������Ʈ ������ ����
	try {
		
		File f1 = new File("text1.txt");
		if(f1.createNewFile()) {
			System.out.println("���� ���� ����");
		}else {
			System.out.println(f1.getName() + "������ �̹� �����մϴ�.");
		}
		File f2 = new File("C:/dev/test2.txt");
		if(f2.createNewFile()) {
			System.out.println(f2.getName() + "���� ���� ����");
		}else {
			System.out.println(f2.getName() + "������ �̹� �����մϴ�.");
		}
		File folder = new File("temp");
		if(!folder.exists()) {
			
			if(folder.mkdir()) {
				System.out.println(folder.getName() + " ���� ���� ����");
				
			}
			
			
		}
	
		File f3 = new File(folder.getName() + "/test3.txt");
		if(f3.createNewFile()) {
			System.out.println(f3.getName() + "���� ���� ����");
		}else {
			System.out.println(f3.getName() + "������ �̹� �����մϴ�.");
		}

		
	}catch(IOException e) {
		System.out.println("���� ���� �� ���� �߻�");
		e.printStackTrace();
	}
	}
	public void example2() {
//		����Ʈ ��� ��Ʈ�� : 1byte ������ �����͸� ��/����ϴ� ��Ʈ��
//		���Ϸκ��� �Էµ� ������ ���α׷��� ����.
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("byte/byteInput.txt");
			int value = 0; 
			while((value = fis.read()) != -1) {
				System.out.print((char)value);
//				1����Ʈ ������ �о���� ������ 2����Ʈ�� �ѱ��� ���� ���·� �о����� �ܼ�â�� ��µȴ�.
			}
		}catch (IOException e) {
//			IOException�� FileNotFoundException�� �θ�ν� �������� �̿��� �� ���ܸ� ��� ���� �� �ִ�.
			System.out.println("���ܹ߻�");
			e.printStackTrace();
			
		}finally {//���ܰ� �߻��ϵ� ���� �ݵ�� ����Ǵ� ����

			try {
				if(fis != null) {
					fis.close();
				}
			}catch(IOException e) {//��Ʈ���� �ݴ� �� ���ܰ� �߻��� �� �ִ�.
				e.printStackTrace();
			}
			
		}
	}
	public void example3() {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("byte/byteOutput.txt");
			String content = "Hello World!!!@@@\n"
					+ "12345678901234567890\n"
					+ "�ֱ���\n";
			for(int i=0; i<10; i++) {
				for(int j=0; j<=i; j++) {
					content +="*";
				}
				content +="\n";
			}
			for(int i=0; i<content.length(); i++) {
				fos.write(content.charAt(i));
			}
			System.out.println("��� �Ϸ�");
		}catch(IOException e) {
			System.out.println("���� �߻�");
			e.printStackTrace();
		}finally {
//			����� ��Ʈ�� �ݱ� (�ڿ� ��ȯ)
			try {
				if(fos != null) {
					
					fos.close();
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}
	public void example4() {
//		FileWriter : ���α׷� -> ���Ϸ� ����ϴ� ���� ��� ��Ʈ��
//		write() : byte ��� ��Ʈ���� �ٸ��� ���� ��� ��Ʈ���� ���� �ϳ� �Ǵ� ���� ������ ����� �����ϴ�.
		FileWriter fw = null;
		try {
			fw = new FileWriter("char/charOutput.txt"/*, true*/);
//			�Ű����� �ڿ� true �߰� �� �̾� ����
			fw.write("�� ���� �� �ð� ���ҽ��ϴ�.\n");
			fw.write("�������� ȭ����~~\n");
			fw.write("afsdlmdsflm\n");
			fw.write("1516516\n");
		}catch (IOException e) {
			e.printStackTrace();
			
		}finally {
			try {
				if(fw != null) {
					fw.close();
					
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public void example5() {
//		FileReader : ���� -> ���α׷����� �Է��ϴ� ���� ��� ��Ʈ��
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("char/charOutput.txt");
			int value = 0;
			while ((value =fr.read())!=-1) {
				System.out.print((char)value);
			}
			System.out.println("=====================");
			fr = new FileReader("char/charOutput.txt");
			br = new BufferedReader(fr);
			String temp = null;
			while((temp = br.readLine()) != null) {
				System.out.println(temp);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr != null) {
					fr.close();
				}
				if(br != null) {
					
					br.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	public void example6() {
//		Buffered ���� ��Ʈ���� �̿��� � ������ �����̵� �����ϱ�
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			bis =  new BufferedInputStream(new FileInputStream("img.png"));
			bos = new BufferedOutputStream(new FileOutputStream("kwnag.png"));
			int value = 0;
			while ((value =bis.read())!=-1) {
				bos.write(value);
			}
			System.out.println("����Ϸ�");
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(bis != null)bis.close();
				if(bos != null)bos.close();
				
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
