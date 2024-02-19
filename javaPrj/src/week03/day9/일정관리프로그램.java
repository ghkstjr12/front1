package week03.day9;

import java.util.Scanner;

public class 일정관리프로그램 {

	public static void main(String[] args) {
		//일정표준비		
				String[] schedule = new String[5];
				int index=0;
				
				//
				Scanner sc = new Scanner (System.in);
				
				
			loop:while( true) {
					
				System.out.println( "일정을 선택하세요 1. 등록, 2.조회 ,3.변경, 4.삭제 ,5. 종료");
				String menu  = sc.nextLine();
					
							switch( menu) {
							case "1":
								index = 일정등록(schedule, index, sc);				
								break;
							case "2":
								일정조회(schedule, index);				
							break;
								case  "3":
									일정수정(schedule, index, sc);			
									break;				
								case "4":
									일정삭제(schedule, index, sc);
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

	public static void 일정삭제(String[] schedule, int index, Scanner sc) {
		System.out.println("삭제"); // 요소 0으로 저장함 
		System.out.println( "상품을 조회합니다");
		for( int i=0; i< index;  i++) {
			if( !schedule[i].equals("0")) {
			 System.out.println( (i+1)  + schedule[i]);
			}
		}
		System.out.println(" 삭제할 상품을 선택하시오");
		String choice_ =sc.nextLine();   // "1 "
		int choice  =  Integer.parseInt( choice_);   // 1
		schedule[choice-1]="0";
	}

	public static void 일정수정(String[] schedule, int index, Scanner sc) {
		System.out.println( "일정 수정");				
		System.out.println( "일정조회");
		for( int i=0; i< index;  i++) {					
			if( !schedule[i].equals("0")) {
				System.out.println( (i+1)  + schedule[i]);
			}
		}					
		System.out.println("변경할 일정을 선택하세요"); 
		String choice_  =  sc.nextLine();    // "1" =>1
		int choice  = Integer.parseInt(choice_);
		System.out.println("변경할 일정의 이름을 입력하세요");
		String newName  = sc.nextLine();
		schedule[choice-1] = newName;
	}

	public static void 일정조회(String[] schedule, int index) {
		System.out.println( "일정조회");
		for( int i=0; i< index;  i++) {
			if( !schedule[i].equals("0")) {											 
				System.out.println((i+1) + schedule[i]);
			}					 
		}
	}

	public static int 일정등록(String[] schedule, int index, Scanner sc) {
		System.out.println("등록할 일정을 입력하세요");
		String name = sc.nextLine();
		schedule[index]= name;
		index++;
		return index;
	}

					}
