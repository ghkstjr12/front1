package week03.day12.상속Inheritance.고기;

public class Chicken extends Meat{

	public void 닭고기() {
		System.out.println("닭고기");
	}
	
	
	@Override
	public void 굽기() {
		System.out.println("미디움 웰던");
	}
}