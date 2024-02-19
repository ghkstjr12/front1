package week01.day4;

public class 순한맛2내거 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//변수선언
		// 1 	2		3		..100번째
		// 1 + (1+2) + (1+2+3)...(1+2+..100_
		int N=1 , i=0, sum=0;
		
		while(N <=100){
			i = i+N;
			sum= sum+i;
			N=N+1;
		}
		System.out.println(sum);
	}

}
