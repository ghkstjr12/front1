package day5.quiz;

import java.util.Scanner;

public class 문제3 {

	public static void main(String[] args) {
		//입력받는 수
		int endNum,result=0;
		Scanner sc =new Scanner(System.in);
		
		
		
		do {
	
			System.out.print("종료값을 입력하세요 :  " );
			endNum = sc.nextInt(); // 종료값을 입력받고 변수에 대입
		} while(endNum <= 1); // 종료값이 시작값보다 작거나 같으면 다시 입력
			
		for(int i=1; i<=endNum; i++ ) {
			result += i;
		}
		System.out.print(  endNum + "까지의 합은 " + result + "입니다.");
			}
	}


