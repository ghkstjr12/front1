package week04.day19.thread;

public class 스레드sleep {

	public static void main(String[] args) {
		
		
		MyThread th = new MyThread();
		th.start();
		
	}
}


class MyThread extends Thread{

	@Override
	public void run() {
		
		try {
			Thread.sleep(1000); //1000 -> 1초
			System.out.println("수행할 코드");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}