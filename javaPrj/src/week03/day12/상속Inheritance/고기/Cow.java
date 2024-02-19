package week03.day12.상속Inheritance.고기;

public class Cow extends Meat{

	public void 소고기() {
		System.out.println("소고기");
	}
	
	
	@Override
	public void 굽기() {
		System.out.println("레어");
	}
}
