package week03.day13.실기;

import java.util.Scanner;

public class 문제02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("합을 구할 수를 입력하세요.");
		int input;
		input=sc.nextInt();
		MyClass m = new MyClass();
		int sum = m.getTotal(input);
		
		System.out.println(input+" 까지의 합은 "+sum);
		
	}

}
