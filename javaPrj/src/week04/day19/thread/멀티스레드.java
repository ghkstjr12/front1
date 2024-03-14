package week04.day19.thread;


// 1. 스레드 상속받아서 스레드 만들기

public class 멀티스레드 {

	public static void main(String[] args) {

		//하나의 프로그램에 하나의 호출만 가지는 것
		//지금까지 만든 프로그램은 싱글스레드 프로그램
		
		//스레드 객체 생성, start() 호출
		
		Thread th1 = new Thread1();
		Thread th2 = new Thread2();
		
		//start() 메서드 호출
		th1.start();
		th2.start();
	}
}


class Thread1 extends Thread{
	
	@Override
	public void run() {
		
		for(int i=0; i<=1000; i++) {
			System.out.println("하이 !!!");
		}
	}
}

class Thread2 extends Thread{
	
	@Override
	public void run() {
		
		for(int i=0; i<=1000; i++) {
			System.out.println("바이 ~~~");
		}
	}
}
