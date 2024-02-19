package week01.day5;

public class 제어문반복문1 {

	public static void main(String[] args) {
		
		//반복문 ,for (반복횟수 정해져있을 때), whlie , do~while (특정조건일 동안)
		
		//별 하나를 이용해서 별을 3개 출력하시오!!
		
		//System.out.println("***");
		
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		
		//별 1개를 이용해서 10개 출력
		System.out.println("==============반복문");
		//반복문
		//i 변수 :10번 이라는 반복을 제어할 변수
		for( int i=1; i<=10; i++) {
			System.out.println("*");
		}
		
		
	//구구단, 별찍기
			//반복문 사용해서 3단 출력
			for (int i=1; i<9; i++){
				System.out.println("3 *"+i+ "="+ i*3);
				
	}
			//4단?
			
			for (int i=1; i<9; i++) {
				System.out.println("4 *"+ i +"="+ i*4);
			}
 }
}