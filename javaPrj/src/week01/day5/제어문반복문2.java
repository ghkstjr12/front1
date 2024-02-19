package week01.day5;

import java.util.Scanner;

public class 제어문반복문2 {

	public static void main(String[] args) {
		// while, do-while
		
		//"인사하기" 3번출력
		//반복문
		//while(조건){}//조건이 만족할 동안 반복함
		int cnt=0;
		while(cnt <=3) {
			System.out.println("하이! 즐거운 금요일!!");
			cnt++; //cnt = cnt+1;
		}
		
		//0이 입력될 때 까지 인사하기
		int input; //입력되는 수
		Scanner sc =new Scanner(System.in);
		
		while (true) {
			
			input =sc.nextInt();
			if (input ==0) break;//반복문을 종료할 때 사용함
			System.out.println("하이!!!");
		}
		System.out.println("bye~~~");
		
		
		
		int n=1;
		int sum=0;
		do {
			sum= sum+n;
			n=n+1;
		
		}while(n <=10);
		
		System.out.println(sum);
	}

}
