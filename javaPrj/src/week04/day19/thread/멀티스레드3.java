package week04.day19.thread;


// Runnable 인터페이스 구현하는 방법

public class 멀티스레드3 {

	public static void main(String[] args) {
		// 하나의 프로그램에 하나의 흐름만 가지는 것 
		// 지금까지 만든 프로그램은 싱글스레드 프로그램이었다.
		
	
		//스레드생성및 start()
	//	Thread th1=  new  Thread(   new Runnable() {} );
		Thread th1=  new  Thread(   new Runnable() {

			@Override
			public void run() {
				 
				for( int i=1 ; i<=1000 ; i++) {
					System.out.println(" 하이 ~~~");
				}
				
				
				
			}} );  //익명클래스  익명객체 
		//		Thread th2 = new Thread( new Runnable() {}    );
		
		Thread th2 = new Thread( new Runnable() {

			@Override
			public void run() {

				for( int i=1 ; i<=1000 ; i++) {
					System.out.println(" 바이 ~~~");
				}
				
			}}    );
		
		
		
		//스레드 시작요청 
		th1.start();
		th2.start();
	

	}

}

 