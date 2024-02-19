package week03.day12.상속Inheritance.동물;

import week03.day12.추상클래스.동물.Animal;
import week03.day12.추상클래스.동물.Cat;
import week03.day12.추상클래스.동물.Dog;

public class Ex06 {

	public static void main(String[] args) {
		//상속관계 Animal(부모) . Dog , Cat (자식)
		//부모의 있는 모든것을 물려받는다.
		//단 접근에 대해서는 접근제어자에 따른다.
		Cat cat =new Cat();
		Dog dog = new Dog();
		
		cat.쥐를잡는다();
		dog.짖는다();
		
		//상속엣 업캐스팅(부모형으로 변환시키는 것)
		
		Animal animal=null;
		animal = cat; //가능(업캐스팅)
		//업캐스팅의 경우는 해석의 도구가 부모형으로 바뀌기 때문에 쥐를 잡는다() 기능을 사용할 수  x
		
		//다운캐스팅
		((Cat)animal).쥐를잡는다();
		
		Animal[]arr = new Animal[2];
		
		arr[0] = new Cat();
		arr[1] = new Dog();
		
		//오버라이딩
		
		arr[0].짖는다();
		arr[1].짖는다();
		
		for (int i =0; i<arr.length;i++) {
			arr[i].짖는다();
		}
	}

}
