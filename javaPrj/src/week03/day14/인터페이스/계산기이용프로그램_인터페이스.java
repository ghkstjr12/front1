package week03.day14.인터페이스;

import java.util.Scanner;

public class 계산기이용프로그램_인터페이스 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner( System.in);		
		System.out.println(" 두 수를 입력하시오 .. 계산해 드립니다");
		
		int su1= sc.nextInt();
		int su2= sc.nextInt();		
		
		//
		System.out.println("1. 덧셈  , 2. 뺄셈");		
		int menu = sc.nextInt();
		
		
		//결과는 ...
		//여러분이 만든 계산기클래스를 사용합니다.
		
		//인터페이스  (인터페이스 상속이라고 한다 . 키워드  implements ) 
		//인터페이스를 사용하면  각자 개발을 독립적으로 작성할 수 있다.
		//특정클래스에 의존적이지 않는 코드를 작성할수 있다
		// => 인터페이스에 의존하면
		
		CalculatorI calculator =   new MyCalculatorImp(); // new 현지Calculator();		
		
		int result=0;
		switch(menu){		
		case 1:
		    result  =calculator.add(su1, su2);
			break;
			
		case 2:
		    result =calculator.sub(su1, su2);
			break;			
		}		
		
		System.out.println("결과값은===>" + result); 
		 
	 
		
	}

}
