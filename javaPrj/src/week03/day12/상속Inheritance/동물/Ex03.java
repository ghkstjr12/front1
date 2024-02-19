package week03.day12.상속Inheritance.동물;

import week03.day12.추상클래스.동물.Animal;
import week03.day12.추상클래스.동물.Cat;
import week03.day12.추상클래스.동물.Dog;

public class Ex03 {

	public static void main(String[] args) {
		
		//업캐스팅
//		Animal a = new Cat();
		Animal a=null;
		a= new Cat();
		
		//다운캐스팅(올바른 다운캐스팅),업캐스팅한것을 자식형으로 바꾸는 거시 다운캐스팅
		//무조건 부모자식이면 다운캐스팅이 되는건 아니다 
		((Cat)a).쥐를잡는다();
		
//		Animal b = new Dog();
		Animal b=null;
		b= new Dog();
		
		
		a.짖는다();
		b.짖는다();
		
		
		Animal[] arr = new Animal[2]; //객체배열선언하면 Animal객체가 안만들어진게아니라
									  //Animal객체를 담을 수 있는 참조형변수를 배열로 만든것
		
		arr[0]= new Cat(); //NullPointerException발생 
		arr[1]=new Dog();
		
		
		
		
		
		
		arr[0].짖는다();
		arr[1].짖는다();
		
		for (int i=0; i< arr.length; i++) {
			arr[i].짖는다();
			//필요에 따라 다운캐스팅을 할 수 있다.
			if (arr[i] instanceof Cat) {
				((Cat)arr[i]).쥐를잡는다();
			}
		}
	}

}
