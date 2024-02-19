package week02.day7학습;

public class 함수맛보기2 {

	public static void main(String[] args) { 
		
		System.out.println("하이");		
		// 함수 : 기능  ( 인사하는 기능)
		// 함수:이름(기능명) 인사하기
		// 입력:  유무
		// 반환값 :  유무		
		
		//함수 호출
		인사하기();	
		
		int sum=0;
		for(int i=1;i<=10; i++ ) {
			sum += i;
		}
		System.out.println( sum);		
		합구하기10();		
		합구하기10();			
        int result  =getSu();
        System.out.println( result);
        
	}
	
	// 함수작성
	//            반환   기능명(  매개변수  )
	public static void 인사하기(  ) {
		System.out.println( " 안녕 !!");
	}				
	
	// 합 구하기
	public static void 합구하기10() {
		int sum=0;
		for(int i=1;i<=10; i++ ) {
			sum += i;
		}
		System.out.println( sum);
		
	}	
	// 수를 반환하는 함수 
	public static int getSu() {		
		return 8;
	}
	

}
