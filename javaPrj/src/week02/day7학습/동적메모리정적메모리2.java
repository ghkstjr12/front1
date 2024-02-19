package week02.day7학습;

import java.util.Scanner;

public class 동적메모리정적메모리2 {

	public static void main(String[] args) {
		
		
		//정적메모리 : 프로그램을 실행시키기 전에 사용할 메모리의 크기가 정해지는 것!
		//동적메모리 : 프로그램 실행시 사용할 메모리가 결정되는 것 !!
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("배열의 크기를 원하는 만큼 입력하세요");
		int size;
		
		size=sc.nextInt();
		
		//원하는 만큼 배열 확보
		int[] arr= new int[size];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] =sc.nextInt();
		}
		
		
		System.out.println("당신이 입력한 값들의 합은?");
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum= sum+arr[i];
		}
		System.out.println("입력한 수의 종합="+ sum);
		
		

	}

}
