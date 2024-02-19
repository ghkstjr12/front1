package week01.day4;

import java.util.Scanner;

public class 순한맛3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int pos=0;
		int neg=0;
		int pos_even=0;
		int pos_odd= 0;
		int num;
		
		for (int i =1; i<= 5; i++) {
			num =sc.nextInt();
			if(num > 0) {
				pos++;
				if(num % 2 ==1) {
					pos_odd++;
				
				}
				else if (num %2 ==0) {
					pos_even++;
				}
				else if (num <0) {
					neg++;
				}
			}
			System.out.println("양수:"+ pos);
			System.out.println("음수:"+ neg);
			System.out.println("양수중 홀수:"+ pos_odd);
			System.out.println("양수중 짝수:"+ pos_even);
		}
		
		
	}

}
