package week03.day12.인터페이스.전투;

public class Cat implements 전투가능한 {
	public void 쥐를잡는다() {
		System.out.println("쥐를 잡는다");
	}
	
	@Override
	public void 전투한다() {
		System.out.println("발톱을 드러내고 싸운다");
	}
}
