package day6.quiz;

public class 문제1 {

	public static void main(String[] args) {
		int[] abc  = new int[5];
		abc[0] = 52;
		abc[1] = 31;
		abc[2] = 19;
		abc[3] =  2222;
		abc[4] = -1;
		
		System.out.println(abc[0]);
		System.out.println(abc[1]);
		System.out.println(abc[2]);
		System.out.println(abc[3]);
		System.out.println(abc[4]);
		//문제 1-2번 합계와 평균구하기 
		int sum  =abc[0]+abc[1]+abc[2]+abc[3]+abc[4];
		int avg  = sum /5;
	
		System.out.println(sum);
		System.out.println(avg);
		

	}

}
