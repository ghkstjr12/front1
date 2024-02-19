package week02.day7;

public class 배열2_기본문제02 {

	public static void main(String[] args) {
				
		int[] tm = {27, 27, 28, 29, 30, 33, 32, 33, 32, 31, 31, 33, 33, 31} ;
		int sum = 0;
		int avg = 0;

		System.out.println("배열의 모든 기온을 출력하시오");
		for (int i=0; i<tm.length; i++) {
			System.out.print(tm[i]+" ");
			sum = sum + tm[i];
		}
		System.out.println(" ");
		System.out.println("=====================");
		
		
		System.out.println("배열의 모든 기온을 거꾸로 출력하시오");
		for (int i=tm.length-1; i>=0; i--) {
			System.out.print(tm[i]+" ");
		}
		System.out.println(" ");
		System.out.println("=====================");
		
		
		System.out.println("평균기온을 출력하시오");
		avg = sum / tm.length;
		System.out.println("평균 : "+avg);
		System.out.println("=====================");
		
		
		System.out.println("평균기온보다 높은 일수를 구하시오");
		for (int i=0; i<tm.length; i++) {
			if (avg < tm[i]) {
				System.out.print(tm[i]+" ");
			}
		}
		System.out.println(" ");
		System.out.println("=====================");
		
		
		System.out.println("가장 높은 기온 출력");
		int max = 0;
		for (int i=0; i<tm.length; i++) {
			if (max < tm[i]) {
				max = tm[i];
			}
		}
		System.out.println("최대값 : "+max);
		System.out.println("=====================");
		
		
		System.out.println("가장 낮은 기온 출력");
		int min = max;
		for (int i=0; i<tm.length; i++) {
			if (min > tm[i]) {
				min = tm[i];
			}
		}
		System.out.println("최소값 : "+min);
		System.out.println("=====================");
		
		
		
		
		
		
		
		
	
	}
}