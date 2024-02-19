package week03.day9;

public class 지역변수 {

	public static void main(String[] args) {
		//지역변수 :해당지역에서만 사용가능
		//함수지역(스코프)
		//블럭지역(스코프)
		int su=0;
		
		수증가하기(su);
		System.out.println(su);
		
		
		int number=0;
		
		for (int i=1; i<=3; i++) {
			int k=5;
			System.out.println("하이");
			number++;
		}
		for (int i=1; i<=3; i++) {
			System.out.println("hi");
			number++;
		}
		System.out.println(number);
		// System.out.println(k); 불가능

		
	}
	public static int 수증가하기(int a) {//매개변수 =>지역 변수
		a=a+1;
		return a;
	}

}
