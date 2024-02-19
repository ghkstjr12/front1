package week01.day5;

import java.util.Scanner;

public class 제어문스위치 {

	public static void main(String[] args) {
		//switch 문 (분기문), 조건에 따라서 분기됨
		//메뉴를 선택할 때  주로 사용함
		Scanner sc = new Scanner (System.in);
		int menu; //1:등록, 2. 조회,3.변경, 4.삭제 5. 종료
		System.out.println("메뉴를 선택하시오===>");
		System.out.println("1.등록,2.죄회,3.변경,4.삭제,5.종료");
		// menu=2;
		menu = sc.nextInt();
		switch(menu) {
		case 1:
			System.out.println("등록합니다");
			break;
		case 2:
			System.out.println("조회합니다");
			break;
		case 3:
			System.out.println("변경합니다");
			break;
		case 4:
			System.out.println("삭제합니다");
			break;
		case 5:
			System.out.println("종료합니다");
			break;
		default:
			System.out.println("메뉴가 잘못되었습니다");
		}
		
		
	}

}
