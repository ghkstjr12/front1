package week03.day8문제;

public class 예제1 {

	public static void main(String[] args) {
				//큰수 구하기(숫자비교-배열)
				int[] comparison=숫자생성();
				
				System.out.println(Math.max(comparison[0],comparison[1]));
				System.out.println(Math.max(comparison[0],comparison[2]));
				System.out.println(Math.max(comparison[1],comparison[2]));
				
			}


			private static int[] 숫자생성() {
				int[] 숫자비교 = new int[3];
				숫자비교[0]=80;
				숫자비교[1]=87;
				숫자비교[2]=90;
				return 숫자비교;
			}
			
		

}
