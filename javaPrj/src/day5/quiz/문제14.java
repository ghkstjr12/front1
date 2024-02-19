package day5.quiz;

import java.util.Scanner;

public class 문제14 {
		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			while(true) {
				String menu=sc.next();
				
				System.out.println(menu);
				if(menu.equals("딸기스무디")) System.exit(0);;
				switch(menu){
				case "아메리카노":
					System.out.println("아메리카노는 2000원입니다.");
					break;
					
				case "카페라떼":
					System.out.println("카페라떼는 3000원입니다.");
					break;
					
				case "버블티": 
					System.out.println("캐모마일은 5500원입니다.");
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
}
