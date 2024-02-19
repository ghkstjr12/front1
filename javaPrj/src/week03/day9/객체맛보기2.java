package week03.day9;

import java.util.Scanner;

public class 객체맛보기2 {
	


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		cellphone cs = new cellphone();
		
		cs.기종="삼성,아이폰";
		cs.종류= sc.nextLine();
		cs.전화번호="010-xxxx-rewq";
		
		
		System.out.println(cs.기종);
		System.out.println(cs.종류);
		System.out.println(cs.전화번호);
	}

}
