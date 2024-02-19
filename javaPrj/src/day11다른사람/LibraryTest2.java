package day11다른사람;

import java.util.Scanner;

public class LibraryTest2 {
	Library2[] list = new Library2[5];
	int index=0;
	Scanner sc = new Scanner(System.in);

	public void register() {
		System.out.println("이름과 대출할 도서의 제목을 입력하세요");
		String name = sc.next();
		String title = sc.next();
		Library2 library = new Library2(name, title);
		list[index] = library;
		index++;
	}
	public void show() {
		System.out.println("이름 입력");
		String name = sc.next();
		for(int i=0;i<index;i++) {
			if(name.equals(list[i].name)) {
				list[i].printInfo();
			}
		}
	}
	
	public void run() {
		//메뉴 선택 코드
		loop: while(true) { 
			System.out.println("메뉴를 선택하세요 1.도서 대출 2.대출 목록 확인 3.종료");
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				System.out.println("등록");
				register();
				break;
			case 2:
				//System.out.println("조회");
				show();
				break;
			case 3:
				System.out.println("종료");
				break loop;
			default :
				System.out.println("잘못된 메뉴");
				System.exit(0);
			}
		}
	}
	
	public static void main(String[] args) {
		LibraryTest2 l = new LibraryTest2();
		l.run();

	}

}
