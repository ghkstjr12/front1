package week03.day13.object;

public class Ex01 {

	public static void main(String[] args) {
		
		// Object 클래스
		// 최상위 클래스
		// 모든클래스는 상속을 받지 않으면 자동으로 (extends Object)  Object를 상속받게 되어 있다. 
		
		Score s = new Score("홍길동",100,90);
	//	System.out.println(s.toString());
	//	System.out.println(s);
		
		// 업캐스팅  부모형참조변수에 저장할 수 있다 
		Object o=null; // 참조형변수 선언, 초기화 (null -> 안 써도 됨)
		o=s; // 상속관계에서 업캐스팅 (s는 Score형에서 실체는 그대로, 형(해석의 도구)만 바뀜)
			 // 부모형으로 축소됨 (사용가능한 메소드가 줄어든다.)
		
		//System.out.println(o.toString());
		//System.out.println(o);
		
		//객체의 정보를 출력하기 
		Cat cat = new Cat("나비");
		Dog dog = new Dog("멍멍이");
		Score score = new Score("가길동",100,90);
		
		System.out.println(cat.toString());
		System.out.println(dog.toString());
		System.out.println(score.toString());
		
		// 업캐스팅 => 부모형으로 (해석의 도구)축소됨.  (주의! 객체가 줄어든 것 아니다.)
		Object o1=cat;
		Object o2=dog; 
		Object o3=score;
		
		System.out.println(o1);
		System.out.println(o2); // 오버라이드 하지 않은 경우, 부모로 부터 상속 
		System.out.println(o3);
		
		
		// Cat객체는 Cat형으로 사용할 수 있다. 
		// Cat객체는 Object형으로 사용할 수 있다. (상속관계이기 때문에)
		
		Object[] arr = new Object[3];
		arr[0] = cat; // Object o1=cat; 처럼 만든 것. 
		arr[1] = dog;
		arr[2] = score;
		
		System.out.println();
		System.out.println("객체의 정보를 출력하기 !!!");
		for( int i=0; i<arr.length; i++) {
			//System.out.println(arr[i].toString());
			System.out.println(arr[i]);
		}
		
	}

}
