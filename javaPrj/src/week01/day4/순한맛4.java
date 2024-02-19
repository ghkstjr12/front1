package week01.day4;

public class 순한맛4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1+3+5+7+...
		//=>누적의 합이 1000을 초과 하는 값과 항을 출력하시오
		//변수
		int A=1;
		int d=2;
		int S=A;
		int N=1;
		
		while (S<1000) {
			A =A+d;
			S= S+A;
			N=N+1;
		}
		System.out.println("마지막 항" +A+ "누적값"+S);
	}

}
