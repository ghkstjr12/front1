package week02.day7;

public class 배열2_기본문제01 {

	public static void main(String[] args) {
				
		int[] kors = {90, 80, 99, 89, 100};

		System.out.println("배열요소 풀력하기");
		for (int j=0; j<kors.length; j++) {
			System.out.print(kors[j]+" ");
		}
		System.out.println(" ");
		System.out.println("=================================");
		
		
		System.out.println("배열전체 합 구하기");
		int sum = 0;
		for (int j=0; j<kors.length; j++) {
			sum = sum + kors[j];
		}
		System.out.println("합 : " + sum);
		System.out.println("=================================");
		
		
		System.out.println("거꾸로 출력하기");
		for (int i=kors.length-1; i>=0; i--) {
			System.out.print(kors[i]+" ");
		}
		System.out.println(" ");
		System.out.println("=================================");
		
		
		System.out.println("평균보다 큰 값 출력하기");
		int avg = 0;
		avg = sum / kors.length;
		System.out.println("avg = " + avg);
		for (int i=0; i<kors.length; i++) {
			if (kors[i] > avg) {
				System.out.print(kors[i]+ " ");
			}
		}
		
		
		
		
		
		

	}
}