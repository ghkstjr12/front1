package week01.day5;

public class 자료형 {

	public static void main(String[] args) {
		
		//변수(메모리공간) 를 선언시 공간의 크기와 공간의 내용을 해석하는 방법
		
		/*
		 * int : 정수형 4byte
		 * char: 문자혀ㅕㅇ , 한 문자 ,'a', '한': 2byte
		 * *double :실수형,8byte
		 * boolean :논리형 (true, false)
		 */
		
		int num=10;
		char ch='한';
		double dnum=25.56585;
		boolean result=true;
		
		System.out.println(num);
		System.out.println(ch);
		System.out.println(dnum);
		System.out.println(result);
		
		//
		// 정수형변수
		// byte,short,int, long
		// float, double
		
		byte b = 127; // (128 안들어감);
		short s = 32767; //2byte
		int i = 210000000; //4byte (-2147483647)
		long  l =  9223372036854775807L ; // 922 3372 0368 5477 5807 L   (약922경)
		
		
	}

}
