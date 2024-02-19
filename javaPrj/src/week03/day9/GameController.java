package week03.day9;

import week03.day9.MainView;

public class GameController {

	private int num;
	public GameController() {}

	//1~3 난수 만드는 기능 메소드

	public int random() {//랜덤 int num을 리턴하는 메소드
		int s = (int)(Math.random()*3)+1;
		return s;
	}

	//가위바위보 비교하는 기능

	public void pare(int su) {
		MainView v = new MainView();
		num=random();
		if(su==1) {//나 가위

			switch(num) {//컴퓨터가 랜덤으로 고른 수
			case 1 : System.out.println("나 : 가위 / 컴퓨터 : 가위  - 비겼습니다.");v.draw();return;
			case 2 : System.out.println("나 : 가위/ 컴퓨터 : 바위 - 졌습니다.");v.lose();return;
			case 3 : System.out.println("나 : 가위/ 컴퓨터 : 보 - 내가 이겼습니다.");	v.win();return;		
			}

		}	

		if(su==2) {//나 바위
			switch(num) {
			case 1 : System.out.println("나 : 바위 / 컴퓨터 : 바위- 비겼습니다.");v.draw();return;
			case 2 : System.out.println("나 : 바위/ 컴퓨터 : 가위 - 내가 이겼습니다.");v.win();return;
			case 3 : System.out.println("나 : 바위/ 컴퓨터 : 보 - 졌습니다.");v.lose();return;			

			}

		}	

		if(su==3) {//나 보

			switch(num) {
			case 1 : System.out.println("나 : 보  / 컴퓨터 : 보- 비겼습니다.");v.draw();return;
			case 2 : System.out.println("나 : 보 / 컴퓨터 : 가위 - 졌습니다.");v.lose();return;
			case 3 : System.out.println("나 : 보 / 컴퓨터 : 바위 - 내가 이겼습니다.");v.win();return;			

			}			

		}

	}

	//이겼을때 내가 선 묵찌빠

	public void winpare(int su) { 
	MainView v = new MainView();
	num=random();
	System.out.println();

			if(su==1) {//나 묵
				switch(num) {
					case 1 : System.out.println("나 : 묵 / 컴퓨터 : 묵 - 내가 이겼습니다.");return;//다시 mainMenu로 돌아감
					case 2 : System.out.println("나 : 묵 / 컴퓨터 : 찌");v.win();return;//내가다시 선
					case 3 : System.out.println("나 : 묵 / 컴퓨터 : 빠");v.lose();return;//컴퓨터가 다시 선
				}

			}

			if(su==2) {//나 찌
				switch(num) {
					case 1 : System.out.println("나 : 찌 / 컴퓨터 : 묵");v.lose();return;
					case 2 : System.out.println("나 : 찌 / 컴퓨터 : 찌 - 내가 이겼습니다.");return;
					case 3 : System.out.println("나 : 찌 / 컴퓨터 : 빠");v.win();return;

				}

			}

			if(su==3) {//플레이어 : 빠

				switch(num) {
					case 1 : System.out.println("나 : 빠 / 컴퓨터 : 묵");v.win();return;
					case 2 : System.out.println("나 : 빠 / 컴퓨터 : 찌");v.lose();return;
					case 3 : System.out.println("나 : 빠 / 컴퓨터 : 빠 - 내가 이겼습니다.");return;

				}

			}

		}

		

		//졌을때 컴퓨터 선 묵찌빠

		public void losepare(int su) {
		MainView v = new MainView();
		num=random();
		System.out.println();
			if(su==1) {
				switch(num) {
					case 1 : System.out.println("나 : 묵 컴퓨터 : 묵 - 졌습니다.");return;
					case 2 : System.out.println("나 : 묵 컴퓨터 : 찌");v.win();return;
					case 3 : System.out.println("나 : 묵 컴퓨터 : 빠");v.lose();return;

				}

			}

			if(su==2) {

				switch(num) {
					case 1 : System.out.println("나 : 찌 / 컴퓨터 : 묵");v.lose();return;
					case 2 : System.out.println("나 : 찌 / 컴퓨터 : 찌 - 졌습니다.");return;
					case 3 : System.out.println("나 : 찌 / 컴퓨터 : 빠");v.win();return;

				}

			}

			if(su==3) {
				switch(num) {
					case 1 : System.out.println("나 : 빠 / 컴퓨터 : 묵");v.win();return;
					case 2 : System.out.println("나 : 빠 / 컴퓨터 : 찌");v.lose();return;
					case 3 : System.out.println("나 : 빠 / 컴퓨터 : 빠 - 졌습니다.");return;
				}

			}

		}

	}
