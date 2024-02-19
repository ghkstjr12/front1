package week02.day7;

import java.util.*;

public class 배열0_기초문제 {

	public static void main(String[] args) {
		// 원하는 수 5개를 배열에 담고 배월의 내용 출력
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int number;
		
		for (int i=0; i<5; i++) {
			System.out.print("수 : ");
			number = sc.nextInt();
			
			arr[i] = number;			
		}
		

		// 위 배열의 총 합계와 평균 구하기
		int sum = 0;
		int avg = 0;
		
		int wkr = 0;
		
		for (int j=0; j<5; j++) {
			System.out.print(arr[j]+" ");
			sum = sum + arr[j];
			if (arr[j]%2==0) {
				wkr = wkr + arr[j];
			}
		}
		System.out.println(" ");
		System.out.println(" ---------------------- ");
		
		avg = sum / 5;
		
		
		System.out.println("배열 총 합 : " + sum);
		System.out.println("배열 평균 : " + avg);
		System.out.println(" ---------------------- ");
		
		System.out.println("짝수들의 합 : " + wkr);
		sc.close();
		
	}

}
