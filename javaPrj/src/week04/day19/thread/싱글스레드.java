package week04.day19.thread;

public class 싱글스레드 {

	public static void main(String[] args) {

		//하나의 프로그램에 하나의 호출만 가지는 것
		//지금까지 만든 프로그램은 싱글스레드 프로그램+++++++
		
		
		for(int i=0; i<=1000; i++) {
			System.out.println("하이 !!!");
		}
		
		
		for(int i=0; i<=1000; i++) {
			System.out.println("바이 ~~~");
		}
	}

}
