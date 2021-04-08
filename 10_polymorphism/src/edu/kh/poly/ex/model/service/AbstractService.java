package edu.kh.poly.ex.model.service;

import edu.kh.poly.ex.model.vo.Chicken;

public class AbstractService  {

	public void example1() {
		
		Animal a1 = new Animal();
//		Animal는 추상클래스여서 객체를 만들 수 없다.
		
		Chicken c1 = new Chicken("조류", "잡식", "마당", 2);
		c1.move();
		c1.eat();
		c1.breath();
		
	}
}
