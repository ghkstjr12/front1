package week01.day5;

public class 증감연산자사용 {

	public static void main(String[] args) {
		// 1~10까지의 합
		
		int n=1;
		int sum=0;
		
		while(n<=10) {
			sum = sum +n;
			n= n+1;
		}
		System.out.println(sum);

		
		int i=1;
		int sum2=1;
		while(i++ <10) {
			sum2 = sum2 + i;
		}
		System.out.println(sum2);
	}

}
