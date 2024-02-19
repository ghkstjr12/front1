package week03.day9;

import java.util.Scanner;

public class 수증가자습 {

	public static void main(String[] args) {
		int su=0;
		for(int i=0; i<100; i++) {
			if(i%2==0) {
		su = su + i;
		System.out.println(su);
		
		}
			
		}
		
		
		//관리프로그램 작성 연습
		String[] ad= new String[5];
		int index=0;
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
		System.out.println("메뉴선택 1.등록, 2.조회 3.초기화 4.종료");
		String menu  = sc.nextLine();
		
		switch(menu) {
		case "1":
			System.out.println("메뉴등록하기");
			String name = sc.nextLine();
			ad[index]= name;
			index++;
		break;
		case "2":
			System.out.println("메뉴조회하기");
			조회하기(ad,index);
		break;
		case "3":
			System.out.println("메뉴초기화하기");
			초기화하기(ad,index);
		
		break;
		case "4":
			System.out.println("메뉴종료하기");
		
		break;
		default :
			System.exit(0);
		}
			}
		}
		private static void 초기화하기(String[] ad, int index) {
			System.out.println("초기화");
			for (int i=0; i<index; i++) {
				if (ad[i].equals("0")) {
					System.out.println(ad[i]);
				}
			}
		
	}
		//조회
		public static void 조회하기(String []ad, int index) {
			System.out.println("조회");
		      for (int i=0; i<index; i++) {
		         if (!ad[i].equals("0")) {
		        	 System.out.println(ad[i]);
		         }
		}

			}
			


	}



