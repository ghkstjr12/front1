package week01.day4;

public class 순한맛2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1+ (1+2) +(1+2+3) + ...(1+..+100)
		
		int sum= 0;
		int totalSum =0;
		
		for (int i=1;i<=100;i++) {
			sum = sum + i;
			totalSum = totalSum + sum;
		}
		System.out.println(totalSum);
	}

}
