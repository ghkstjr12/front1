package week03.day8;

import java.util.Scanner;

//관리프로그램 ( 1.조회, 2.등록, 3.종료)
public class 관리프로그램1 {

	public static void main(String[] args) {
				
		
		//메뉴가 계속 동작할 수 있도록
		Scanner sc = new Scanner( System.in);
		loop: while( true) {
			System.out.println(" 메뉴를 선택하세요:  1.등록, 2.조회, 3. 종료" );
			int menu  = sc.nextInt();			
			switch( menu) {
			
			case 1:
				System.out.println("등록");
				break;
			case 2:
				System.out.println("조회");
				break;
			case 3:
				System.out.println( "종료");
				break loop;
			}			
		}
		

		System.out.println(" 프로그램 종료");
	}

}
