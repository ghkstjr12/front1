package week03.day11;

import java.util.Random;

public class Static매서드nonStatic매서드 {

	public static void main(String[] args) {
		
		int su1=10;
		int su2=20;
		
		int result = Math.max(su1, su2);
		System.out.println(result);
		
		double result2= Math.random();
		System.out.println(result2);
		
		//non-static 매서드
		Random r = new Random();
		int result3 =r.nextInt();
		
		System.out.println(result3);
	}

}
