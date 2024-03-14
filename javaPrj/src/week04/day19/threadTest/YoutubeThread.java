package week04.day19.threadTest;

public class YoutubeThread {

	public static void main(String[] args) {
		
		Thread th1 = new Thread(new RunnableImp1());
		Thread th2 = new Thread(new RunnableImp2());
		
		th1.start();
		th2.start();

	}
}

class RunnableImp1 implements Runnable{

	@Override
	public void run() {
		
		for(int i=1; i<100; i++) {
			System.out.println("자바 강의 " +i);
		}
	}	
}

class RunnableImp2 implements Runnable{

	@Override
	public void run() {
		
		for(int i=1; i<100; i++) {
			System.out.println("리액트 강의 " +i);
		}
	}	
}

