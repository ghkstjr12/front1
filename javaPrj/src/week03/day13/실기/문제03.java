package week03.day13.실기;

import java.util.Scanner;

public class 문제03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("곱할 수를 차례로 입력하세요.");
		int input1;
		int input2;
		
		input1=sc.nextInt();
		input2=sc.nextInt();
		
		MyClass m = new MyClass();
		int multi = m.Mycalculator(input1, input2);
		
		System.out.println(input1+"*"+input2+"="+multi);
	}

}
