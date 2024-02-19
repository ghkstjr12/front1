package week02.day6;

public class Continue문 {

	public static void main(String[] args) {
	//  continue 반복문에서 다음 반복으로 바로 진행될 수 있도록 하는 명령
		
			// 1 2 3 4 5 6 7 8 9 10
			//1~10까지 수 중에서 홀수합 구하기
			int sum=0;
			
			for (int i=1; i<=10; i++) {
				if (i%2 ==0) { //i가 짝수이면  아래코드를 수행하지말고 다음 반복으로 진행하도록 함
					continue;
				}
				sum =sum+i;

			}
			System.out.println("홀수합"+sum);
			
	}
}