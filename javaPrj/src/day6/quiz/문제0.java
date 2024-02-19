package day6.quiz;

public class 문제0 {

	public static void main(String[] args) {
		String[] 월요일 = new String[4];
		String[] 화요일 = new String[4];
		String[] 수요일 = new String[4];
		String[] 목요일 = new String[4];
		String[] 금요일 = new String[4];
		
		월요일[0]="한식";
		월요일[1]="양식";
		월요일[2]="중식";
		월요일[3]="일식";

		화요일[0]="한식";
		화요일[1]="양식";
		화요일[2]="중식";
		화요일[3]="일식";

		수요일[0]="한식";
		수요일[1]="양식";
		수요일[2]="중식";
		수요일[3]="일식";

		목요일[0]="한식";
		목요일[1]="양식";
		목요일[2]="중식";
		목요일[3]="일식";

		금요일[0]="한식";
		금요일[1]="양식";
		금요일[2]="중식";
		금요일[3]="일식";
		
		
		// for(int i=0;i<4; i++) {

		 int i;
		 i = (int)Math.random()*4; //0~3
				System.out.println("월요일:"+월요일[i]+"화요일:"+화요일[i]+"수요일:"+수요일[i]+"목요일:"+목요일[i]+"금요일:"+금요일[i]);
		// }
	}

}
