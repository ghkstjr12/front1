package week02.day7;

import java.util.*;

public class 배열0_응용문제01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int number = 0;
		int count = 0;
		
		for (int i=0; i<10; i++) {
			System.out.print(i+"번 입력 : ");
			number = sc.nextInt();
			
			if (number%2==0 && number>0) {
				arr[count] = number;
				count++;
			}
		}
		
		for (int j=0; j<count; j++) {
			System.out.print(arr[j]+ " ");			
		}
		
		sc.close();

	}

}
