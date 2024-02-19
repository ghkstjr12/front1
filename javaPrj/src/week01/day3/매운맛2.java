package week01.day3;

import java.util.Scanner;

public class 매운맛2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int name =sc.nextInt();
		int code = sc.nextInt();
		int time =sc.nextInt();
		int rate = 0;
		int result;
		
		switch(code) {
		case 1: rate =2000;
		break;
		case 2: rate=2500;
		break;
		case 3: rate=3000;
		break;
		case 4: rate=3500;
		break;
		default:
			System.out.println("등록되지 않은 사용자입니다.");
			return;
		}
		result = rate * time;
		System.out.println(name+"님은"+result+"를 받습니다");
	}

}
