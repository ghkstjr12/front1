package week04.day19.threadTest;

public class musicThread {

	public static void main(String[] args) {

		Thread th1 = new Thread1();
		Thread th2 = new Thread2();
		Thread th3 = new Thread3();
		
		th1.start();
		th2.start();
		th3.start();
	}
}

class Thread1 extends Thread{
	
	@Override
	public void run() {
		
		for(int i=1; i<=100; i++) {
			System.out.println("발라드"+i);
		}
	}
}

class Thread2 extends Thread{
	
	@Override
	public void run() {
		
		for(int i=1; i<=100; i++) {
			System.out.println("힙합"+i);
		}
	}
}

class Thread3 extends Thread{
	
	@Override
	public void run() {
		
		for(int i=1; i<=100; i++) {
			System.out.println("재즈"+i);
		}
	}
}
