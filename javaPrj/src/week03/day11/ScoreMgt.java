package week03.day11;

import java.util.Scanner;

public class ScoreMgt {
	Scanner sc =new Scanner(System.in);
	Score[] list = new Score[10];
	int index=0;
	
	//학생정보 등록하기
	public void register() {
		System.out.println("학생정보를 입력하세요");
		String name = sc.next();
		int kor =sc.nextInt();
		int eng =sc.nextInt();
		
		Score s= new Score(name,kor,eng);
		list[index]=s;
		index++;
		
	}
	//학생정보 출력하기 
	public void print() {
		for(int i=0; i<index; i++) {
			list[i].printInfo();
		}
	}
	public void run() {
		while(true) {
			
			System.out.println("메뉴를 선택하세요");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("등록");
				register();
				break;
			case 2:
				System.out.println("조회");
				print();
				break;
			case 3:
				System.out.println("종료");
				break;
			default :
				System.out.println("잘못된 메뉴");
				System.exit(0);
			}
		}
	}
	public static void main(String[] args) {
		
		ScoreMgt mgt = new ScoreMgt();
		mgt.run();
		
	  /* Score[] score =new Score[4];
      Score s = new Score("양홍섭", 100, 80);

      Score s2 = new Score("김예원", 100, 90);

      Score s3 = new Score("김종범", 80, 90);
      
      Score s4 = new Score("박범준", 90, 100);
     
      System.out.println("=== 객체배열 이용 ===");
      for (int i=0; i<scores.length; i++) {
         System.out.println(scores[i]);
      } */
   }
   
}