package week04.day19.thread;


// 1.Runnable 인터페이스 구현하는 방법

public class 멀티스레드2 {

	public static void main(String[] args) {

		//하나의 프로그램에 하나의 호출만 가지는 것
		//지금까지 만든 프로그램은 싱글스레드 프로그램
		
		//스레드생성일 start()
		Thread th1 = new Thread(new RunnableImp1());
		Thread th2 = new Thread(new RunnableImp2());		
		
		//스레드 시작요청
		th1.start();
		th2.start();
		
	}
}



class RunnableImp1 implements Runnable{

	@Override
	public void run() {
		
		for(int i=0; i<=1000; i++) {
			System.out.println("하이 !!!");
		}
	}

}

class RunnableImp2 implements Runnable{
	
	@Override
	public void run() {
		
		for(int i=0; i<=1000; i++) {
			System.out.println("바이 ~~~");
		}
	}
	
}