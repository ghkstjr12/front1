package week04.day19.threadTest;

public class mydThread {

	public static void main(String[] args) {

		
		Thread th1=  new  Thread(new Runnable() {

			@Override
			public void run() {
				 
				for( int i=1 ; i<=500 ; i++) {
					if(i<250) {
						System.out.println("발라드 듣기");
					} else {
						System.out.println("랩 듣기");
					}
				}
				
			}} );
		
		Thread th2 = new Thread(new Runnable() {

			@Override
			public void run() {

				for( int i=1 ; i<=500 ; i++) {
					if(i<250) {
						System.out.println("자바 강의영상 시청");
					} else {
						System.out.println("리액트 강의영상 시청");
					}
				}
				
			}});
		
		Thread th3 = new Thread(new Runnable() {

			@Override
			public void run() {

				for( int i=1 ; i<=500 ; i++) {
					if(i<250) {
						System.out.println("도깨비 시청");
					} else {
						System.out.println("미스터 션샤인 시청");
					}
				}
				
			}});
		
		
		
		//스레드 시작요청 
		th1.start();
		th2.start();
		th3.start();

	}

}

 