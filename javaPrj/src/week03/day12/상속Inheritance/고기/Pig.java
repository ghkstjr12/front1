package week03.day12.상속Inheritance.고기;

public class Pig extends Meat{

	public void 돼지고기() {
		System.out.println("돼지고기");
	}
	
	@Override
	public void 굽기() {
		System.out.println("미디움 레어");
	}

}
