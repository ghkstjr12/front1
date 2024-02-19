package day5.quiz;

import java.util.Scanner;

public class 문제13 {
		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			String menu=sc.next();
			switch(menu){
			case "아메리카노":
				System.out.println("아메리카노는 2000원입니다.");
				break;
				
			case "카페라떼":
				System.out.println("카페라떼는 3000원입니다.");
				break;
				
			case "버블티":
				System.out.println("버블티는 5500원입니다.");
				break;
				
			case "딸기라떼":
				System.out.println("딸기라떼는 3500원입니다.");
				break;
				
			default:
				System.out.println("없는 메뉴 입니다.");
				break;
			}
		}
}
