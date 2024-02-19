package week02.day7;

import java.util.*;

public class 배열2_화폐매수01 {

	public static void main(String[] args) {
		
		System.out.println("---------------------------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		// 출장비 입력
		System.out.print("출장비 : ");
		int don = sc.nextInt();
		
		
		int[] arr = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int[] a = {0, 0, 0, 0, 0, 0, 0, 0};
		
		
		for (int i=0; i<8; i++) {
			a[i] = don / arr[i];
			don = don - (arr[i] * a[i]);
		}
		
		
		System.out.print("오만원 : " + a[0] + "개, ");
		System.out.print("만원 : " + a[1] + "개, ");
		System.out.print("오천원 : " + a[2] + "개, ");
		System.out.print("천원 : " + a[3] + "개, ");
		System.out.print("오백원 : " + a[4] + "개, ");
		System.out.print("백원 : " + a[5] + "개, ");
		System.out.print("오십원 : " + a[6] + "개, ");
		System.out.print("십원 : " + a[7] + "개 ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}
