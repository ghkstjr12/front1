package week01.day5;

public class 제어문반복3 {

	public static void main(String[] args) {
		for (int i=1; i<=5; i++) {
			System.out.println("*");
		}
		for(int j=1; j<=3;j++) {
			//반복해야 할 일
			for(int i=1; i<=5; i++) {
				System.out.println("*");
			}
		}
	}

}
