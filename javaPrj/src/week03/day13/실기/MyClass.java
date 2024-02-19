package week03.day13.실기;

import java.util.Scanner;

public class MyClass {
	static Scanner sc=new Scanner(System.in);

	public int getTotal(int su) {
		
		int sum = 0;
		for( int i=1; i<=su; i++) {
			sum+=i;
		}
		return sum;
	}

	static int Mycalculator(int su1, int su2) {
		
		int multi =0;
		multi = su1*su2;
		
		return multi;
	}
	
	
	
}
