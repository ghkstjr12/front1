package week01.day4;

public class 순한맛2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0; //항의 누적
		//int i=1; // 반복제어변수
		// int j; //항을 구하기 내부반복을 제어한 변수
		
		for( int i=1; i<=100 ; i++) {
			for (int j=1; j<=i; j++) {
				sum =sum +j;
			}
			System.out.println(sum);
		}
		System.out.println(sum);
		
	}
	

}
