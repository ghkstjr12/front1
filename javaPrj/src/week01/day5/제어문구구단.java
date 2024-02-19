package week01.day5;

public class 제어문구구단 {

	public static void main(String[] args) {
		for (int i=2; i<=9; i++) {
			System.out.println(i+"단");
			
			for (int j=1; j<=9; j++) {
				System.out.println(i*j);
			}
		}
		
		//2단 출력
		System.out.println(2*1);
		System.out.println(2*2);
		System.out.println(2*3);
		System.out.println(2*4);
		System.out.println(2*5);
		System.out.println(2*6);
		System.out.println(2*7);
		System.out.println(2*8);
		System.out.println(2*9);
		
		for (int k=2 ; k<=4; k++){
			System.out.println(k*1);
			System.out.println(k*2);
			System.out.println(k*3);
			System.out.println(k*4);
			System.out.println(k*5);
			System.out.println(k*6);
			System.out.println(k*7);
			System.out.println(k*8);
			System.out.println(k*9);
			
		}
	}

}

