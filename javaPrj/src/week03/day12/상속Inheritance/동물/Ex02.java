package week03.day12.상속Inheritance.동물;

import week03.day12.추상클래스.동물.Animal;
import week03.day12.추상클래스.동물.Cat;
import week03.day12.추상클래스.동물.Dog;

public class Ex02 {

	public static void main(String[] args) {
		
		
		Cat c = new Cat();
		Dog d = new Dog();
		
		
		Animal a = new Cat();
		Animal b = new Dog();
		
		
		Animal[] arr = new Animal[2];
		arr[0] = new Cat();
		arr[1] = new Dog();
		
		
		arr[0].먹는다();
		arr[1].먹는다();
		
		//업캐스팅 : 자식객체를 부묘형으로 다루는 것
		//해석의 도구가 바뀜. 실체가 바뀌는 것 x
		
		
		//instanceof 인스턴스 판별 연산자
		
		
		for(int i=0; i<arr.length; i++) {
			arr[i].먹는다();
			
			if(arr[i] instanceof Cat) {
				
				//다운캐스팅
				((Cat)arr[i]).쥐를잡는다();
				
			}
		}
		
		//업캐스팅과 다운캐스팅에서 실체가 바뀌지 않음. 해석의 도구만 바뀜
		
		
		//잘못된 다운캐스팅 예시
	//	Animal animal = new Animal();
		
		
		//실행시 런타임오류 ClassCastException
	//	Cat cat = (Cat)animal;  //문법적 허용
	//	cat.쥐를잡는다();

	}

}
