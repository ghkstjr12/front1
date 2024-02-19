package week01.day3;

public class 매운맛5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1 2 3 4 ...7
		// 2 6 18 54...
		//변수 선언
		int ASum=2;
		int Sum=2;
		int N=3; //공비
		int i=1;
		
		//입력
		
		//처리
		while(i<=7) {
			Sum= Sum *N;
			ASum = ASum +Sum;
			i=i+1;
			
			System.out.println(Sum);
		}
		
		//출력
		System.out.println(ASum);
	}

}
