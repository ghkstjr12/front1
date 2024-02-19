package day5.quiz;

import java.util.Scanner;

public class 문제12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int i=1;
		while(true) {
			if(number%i==0) {
				System.out.print(i+",");
			}
			i++;
			if(i>number) {
				break;
			}
		}
		
	}
}
