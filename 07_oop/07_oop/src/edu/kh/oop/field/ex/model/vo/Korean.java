package edu.kh.oop.field.ex.model.vo;

public class Korean {
	
	public static final String language = "�ѱ�";
	private String id;
	private String name;
//	private int nationalCode = 82;
	public static int nationalCode = 82;
	
	public void quickly() {
		System.out.println("����!����!");
	}
	
	
	public void setNationalCode(int nationalCode) {
		this.nationalCode = nationalCode;
	}
//	public void setLanguage(String language) {
//		this.language = language;
//	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getNationalCode() {
		return nationalCode;
	}
//	public String getLanguage(){
//		return language;
//	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
//	�ʵ尪�� �ϳ��� ���ڿ��� ��ȯ�ϴ� �޼ҵ�
	public String toString() {
		String result = name + "/" + id + "/" + language + "/" + nationalCode;
		return result;
	}
	
}
