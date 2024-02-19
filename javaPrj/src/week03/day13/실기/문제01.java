package week03.day13.실기;

import java.util.Scanner;

public class 문제01 {

	public static void main(String[] args) {
		// 원하는 단을 입력 받아 구구단을 출력하는 프로그램을 작성하시오. 
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 단을 입력하세요.");
		int dan= sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			
			System.out.println(dan+"*"+i+"="+dan*i);
			
		}
		
	
	}

}
