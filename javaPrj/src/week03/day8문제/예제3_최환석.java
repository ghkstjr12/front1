package week03.day8문제;

public class 예제3_최환석 {

	public static void main(String[] args) {
		//숫자비교
		int  a= abc(90);
		int  b= efg(99);
		int result4 = qwe( a,b);
		System.out.println( result4);

	}
	
	
	public static int abc(int cba) {
		System.out.println("abc의 값은:" + cba );
		return 90;
	}
	
	public static int efg(int gfe) {
		System.out.println("efg의 값은:" + gfe);
		return 99;
	}
	private static int qwe(int cba, int gfe) {
		// return Math.max(cba, gfe);
		int max =0;
		if (cba > gfe) {
			max=cba;
		}else{
			max=gfe;
		}
		return max;
	}

}
