package week03.day8문제;

import java.util.Random;

public class 예제2_최환석 {

	public static void main(String[] args) {
		//랜덤
		String ran=음식추천();
		System.out.println("음식추천:"+ran);
	}

	private static String 음식추천() {
		String[] food = new String[4];
		food[0]="한식";
		food[1]="양식";		
		food[2]="중식";
		food[3]="일식";
		
		Random random = new Random();
        int len = random.nextInt(food.length);
        
        return food[len];
	}

}
