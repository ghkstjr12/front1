package week03.day9;

public class 배열의값넣기 {

	public static void main(String[] args) {
		int [] kors =new int [5];
		
		//배열에 (국어점수 여러개) 입력
		//등록
		배열입력하기(kors);
	
		//조회
		배열조회하기(kors);
	}

	public static void 배열입력하기(int[] a) {
		a[0]=90;
		a[1]=99;
		a[2]=100;
		a[3]=89;
		a[4]=100;
	}

	public static void 배열조회하기(int[] kors) {
		
		//조회
		for (int i=0; i<kors.length; i++) {
			System.out.println(kors[i]);
		}
	}

}
