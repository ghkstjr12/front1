package week02.day7;

import java.util.Scanner;

public class 배열0_응용문제03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int top = 0;
		
		for (int i=0; i<10; i++) {
			System.out.print("입력 = ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("최대값 = " + top);
		
		

		sc.close();
	}
}