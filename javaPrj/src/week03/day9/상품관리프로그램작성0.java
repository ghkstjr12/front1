package week03.day9;

import java.util.Scanner;

public class 상품관리프로그램작성0 {

	public static void main(String[] args) {
		
		//상품배열준비		
		String[] goods = new String[5];
		int index=0;
		
		//
		Scanner sc = new Scanner (System.in);
		
		
	loop:while( true) {
			
			System.out.println( "메뉴를 선택하세요 1. 등록, 2.조회 , 3.변경, 4.삭제 ,5. 종료");
			String menu  = sc.nextLine();
			
			switch( menu) {
			case "1":
				System.out.println("등록할 상품을 입력하세요");
				String name = sc.nextLine();
				goods[index]= name;
				index++;				
				break;
			case "2":				
				System.out.println( "상품을 조회합니다");
				for( int i=0; i< index;  i++) {
					if( !goods[i].equals("0")) {											 
						System.out.println((i+1) + goods[i]);
					}					 
				}				
				break;
			case  "3":
						
				break;				
			case "4":
				
				break;
			case "5":
				System.out.println("종료");				
				break loop;
			default :
				System.out.println(" 잘못된 메뉴");
				//프로그램 종료
				System.exit(0);			
			}			
		}
		
		
		
		
		
		 

	}

}
