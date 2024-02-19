package week03.day11.패키지2;

import week03.day11.패키지.A;

public class B {
	
	void 매서드1() {
		System.out.println("매서드");
	}
	
	
	public static void main(String[] args) {
		//default 같은 패키지에서만 적용
		A a= new A();
		a.매서드1();
		//a.매서드1();
	}
}
