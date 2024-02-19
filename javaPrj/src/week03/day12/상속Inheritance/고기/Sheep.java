package week03.day12.상속Inheritance.고기;

public class Sheep extends Meat{

	public void 양고기() {
		System.out.println("양고기");
	}
	
	
	@Override
	public void 굽기() {
		System.out.println("웰던");
	}
}