package day5.quiz;

import java.util.Scanner;

public class 문제6 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		for(int i=1; i<=5; i++) {
			
			System.out.print(i+"번");
			int main=sc.nextInt();
			switch(main) {
			case 1:
			System.out.println("등록");
			break;
			
			case 2:
			System.out.println("조회");
			break;
			
			case 3:
			System.out.println("변경");
			break;
			
			case 4:
			System.out.println("삭제");
			break;
			
			default:
				System.out.println("없는 번호입니다.");

	}

}
	}
}
