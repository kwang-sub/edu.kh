package edu.kh.poly.ex.model.vo;

public abstract  class Animal {
//	�߻�Ŭ����(abstract class) 
//	-�߻� �޼ҵ带 ������ Ŭ���� :�̿ϼ��� ������ ��� �ִ� Ŭ�����̹Ƿ� ��ӹ��� �ڽ��� �ݵ�� �̿ϼ��� �κ��� �������̵� �ؾߵȴ�
//	-�߻� �޼ҵ带 �������� �ʾƵ� ��ü�� �����Ǹ� �ȵǴ� Ŭ���� 
	
	private String type;
	private String eatType;
	private String habitation;
	
//	�߻�Ŭ������ ������

	public Animal() {
	}
	
	public Animal(String type, String eatType, String habitation) {
		super();
		this.type = type;
		this.eatType = eatType;
		this.habitation = habitation;
	}




	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEatType() {
		return eatType;
	}
	public void setEatType(String eatType) {
		this.eatType = eatType;
	}
	public String getHabitation() {
		return habitation;
	}
	public void setHabitation(String habitation) {
		this.habitation = habitation;
	}
	public abstract void move();
	public abstract void eat();
	public abstract void breath();

	@Override
	public String toString() {
		return "Animal [type=" + type + ", eatType=" + eatType + ", habitation=" + habitation + "]";
	}
	
	
	
	
}
