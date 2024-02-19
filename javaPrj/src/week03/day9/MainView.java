package week03.day9;

import java.util.Scanner;


public class MainView {


		GameController ct = new GameController();//컨트롤러로 return해야하니까 객체선언함
		public void mainMenu() {

		Scanner sc=new Scanner(System.in);

		

		do {

		System.out.println("~~~~~~~~묵찌빠 게임을 시작합니다~~~~~~~~~~");
		System.out.println();
		System.out.println("1.게임시작  2.게임종료");
		System.out.print("입력 : ");
		int su = sc.nextInt();

		

			switch(su) {
			case 1 :gameStart();break;
			case 2 : System.out.println("게임을 종료합니다.");return;
			}
	

		}while(true);


	}	

		//게임시작 출력화면 가위바위보 먼저시작

		public void gameStart() {
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("~~~~~~~~~가위 바위 보~~~~~~~~~~~");
		System.out.println("1.가위 2.바위 3.보");
		System.out.print("입력 : ");
		int num=sc.nextInt();


			switch(num){
			case 1 : System.out.println("가위");ct.pare(1);return;//비교하는 controller에 pare로감 
			case 2 : System.out.println("바위");ct.pare(2);return;
			case 3 : System.out.println("보");ct.pare(3);return;
			}		

		}while(true);

	}	

		public void draw() {//비겼으니까 가위바위보 다시시작

		Scanner sc=new Scanner(System.in);


		do {
		System.out.println("~~~~~~~비겼습니다 다시 가위바위보~~~~~~~~");
		System.out.println("1.가위 2. 바위 3.보");
		System.out.print("입력 : ");
		int num=sc.nextInt();

		

			switch(num){
			case 1 : System.out.println("가위");ct.pare(1);return;
			case 2 : System.out.println("바위");ct.pare(2);return;
			case 3 : System.out.println("보");ct.pare(3);return;
			}	
				}while(true);

		}
		
		//가위바위보 이겼으니까 내가 먼저 묵찌빠 시작
		public void win() {
		Scanner sc=new Scanner(System.in);

			do {
				System.out.println("================묵 찌 빠================");
				System.out.println("=============플 레 이 어 차 례=============");
				System.out.println("1.묵 2.찌 3.빠");
				System.out.print("입력 : ");
				int num=sc.nextInt();
				switch(num) {

					case 1:System.out.println("묵");ct.winpare(1);return;
					case 2:System.out.println("찌");ct.winpare(2);return;
					case 3:System.out.println("빠");ct.winpare(3);return;
				}

			}while(true);

		}	

			//가위바위보 졌으니까 컴퓨터가 먼저 묵찌빠 시작

			public void lose() {
				Scanner sc=new Scanner(System.in);
				do {
					System.out.println("================묵 찌 빠================");
					System.out.println("==============컴 퓨 터 차 례==============");
					System.out.println("1.묵 2.찌 3.빠");
					System.out.print("입력 : ");
					int num=sc.nextInt();
					switch(num) {
						case 1:System.out.println("묵");ct.losepare(1);return;
						case 2:System.out.println("찌");ct.losepare(2);return;
						case 3:System.out.println("빠");ct.losepare(3);return;
					}

				}while(true);

				

			}

		}

