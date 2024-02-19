package week02.day7;

import java.util.*;

public class 배열0_응용문제02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int a = 0;
		int sum = 0;
		int avg = 0;
		int count = 0;
		
		for (int i=0; i<10; i++) {
			System.out.print("입력 = ");
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		
		avg = sum / 10;
		System.out.println("평균 = " + avg);
		
		for (int j=0; j<10; j++) {
			if (arr[j] > avg) {
				count++;
			}
		}

		System.out.println("평균값보다 큰 요소의 갯수 = " + count);
		
		

		sc.close();
	}
}