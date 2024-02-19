package week02.day7;

import java.util.Scanner;

public class 배열2_화폐매수02 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		// 출장비 입력
		System.out.print("출장비 : ");
		int don = sc.nextInt();
		
		int _50000 = 0;
		int _10000 = 0;
		int _5000 = 0;
		int _1000 = 0;
		int _500 = 0;
		int _100 = 0;
		int _50 = 0;
		int _10 = 0;
	
		
		_50000 = don / 50000;
		 don = don % 50000;
		 
		_10000 =  don / 10000;
		 don = don % 10000;
		
		_5000 =  don  / 5000;
		 don =  don % 5000;

		_1000 = don / 1000;
		 don = don % 1000;
		
		_500 = don / 500;
		 don = don % 500;
	
		_100 = don / 100;
		 don = don % 100;
		  
		_50 = don / 50;
		 don = don % 50;
		  
		_10 = don / 10;
		
		System.out.print("오만원 : " + _50000 + "개, ");
		System.out.print("만원 : " + _10000 + "개, ");
		System.out.print("오천원 : " + _5000 + "개, ");
		System.out.print("천원 : " + _1000 + "개, ");
		System.out.print("오백원 : " + _500 + "개, ");
		System.out.print("백원 : " + _100 + "개, ");
		System.out.print("오십원 : " + _50 + "개, ");
		System.out.println("십원 : " + _10 + "개 ");

	}

}
