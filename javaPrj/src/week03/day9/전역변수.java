package week03.day9;

public class 전역변수 {
	//전역변수: 모든 메서드에서 접근이 가능한 변수
	static int su=0; //함수밖에서 만들어짐
	public static void main(String[] args) {
		
		수증가하기();
		System.out.println(  su  );
		수증가하기();
		
		System.out.println(su);
	}
	
	public static void 수증가하기() {
		su++;
	}

}
