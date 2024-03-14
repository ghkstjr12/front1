package week04.day20.join;

 

public  class Join예제_정해진시간만큼 {
	public static void main(String[] args)  	{
		 
 
		//스레드 실행 요청 ,스레드시작됨
		Counter3  counter = new Counter3 ();
		counter.start();		
		
		//시간지연을 시키기 위해 추가된 코드 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		 
			e.printStackTrace();
		}
			 	
		
		// main이 가다려주기 , Counter스레드가 종료되기를
		try {
			counter.join( 3000);  // 시간을 정할 수 있다.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}       		
		
		System.out.println("프로그램 종료");
	}
}



 