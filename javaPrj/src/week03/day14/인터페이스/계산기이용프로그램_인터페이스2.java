package week03.day14.인터페이스;

import java.util.Scanner;

public class 계산기이용프로그램_인터페이스2 {
	
	CalculatorI calculator;
	
	public void setCalculator(CalculatorI calculator) {
		this.calculator = calculator;
	}

	public void run() {		
		System.out.println(" 두 수 를 입력하세요");
		Scanner sc = new Scanner( System.in);
		
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();
		
		System.out.println("메뉴 선택  1. 덧셈, 2 뺄셈");
		int menu = sc.nextInt();
		int result=0;
		switch(menu ) {
		case 1:
			result  =calculator.add(su1, su2);
			break;
		case 2:
			result  = calculator.sub(su1, su2);
			break;			
		}	
		
		System.out.println( result);
	}
		
	public static void main(String[] args) {
		계산기이용프로그램_인터페이스2 p = new 계산기이용프로그램_인터페이스2();
		//p.setCalculator( new 현지Calculator());
		p.setCalculator( new MyCalculatorImp());
		p.run();

	}

}
