package edu.kh.poly.ex.model.vo;

public class Chicken extends Animal{
	private int wing;
	
	public Chicken() {
	
	}
	
	
	
	

	public Chicken(String type, String eatType, String habitation, int wing) {
		super(type, eatType, habitation);
		this.wing = wing;
	}





	public int getWing() {
		return wing;
	}





	public void setWing(int wing) {
		this.wing = wing;
	}





	@Override
	public void move() {
		System.out.println("�ι߷� �پ� �ٴϸ鼭 ������ �ĴڰŸ�");
		
	}

	@Override
	public void eat() {
		System.out.println("�θ��� ���̸� �ɾƸ���");
		
	}






	@Override
	public void breath() {
		System.out.println("�ڿ� ������ ������ ����.");
		
	}
	
	
	@Override
	public String toString() {
		return super.toString()+"Chicken [wing=" + wing + "]";
	}
	
	
}
