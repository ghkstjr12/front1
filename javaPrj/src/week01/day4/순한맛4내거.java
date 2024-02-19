package week01.day4;

public class 순한맛4내거 {

	public static void main(String[] args) {
		// 항 => 1 3 5 7 9
		//항의 누적값=> 1 4 9 16.. 1000초과!
		int N=-1, sum=0;
		
		while(sum<1000);{
			N=N+2;
			sum=sum+N;
		}
		System.out.println("마지막항"+ N + "누적 값" + sum);
	}

}
