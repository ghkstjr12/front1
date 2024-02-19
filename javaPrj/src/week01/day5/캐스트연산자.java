package week01.day5;

public class 캐스트연산자 {

	public static void main(String[] args) {
		// 캐스트연산자, cast연산자, 형변환연산자
		
		int a=10;
		int b=20;
		double result =a/b; //정수형 /정수형 =>정수연산
		double result2 =a/(double)b; // 둘 중의 하나를 실수형으로 변환해줘야 함
							//cast연산자를 이용하여 type 을 바꿀 수 있음
							//정수형 /실수형 =>
							//실수형 /실수형 =>실수연산으로 수행함
		
		System.out.println(result);
		System.out.println(result2);
		
		//형변환
		//묵시적형변환,명시적형변환
		//cast연산자는 명시적형변환을 할 때 사용함
		
		double d = 10;
		
		// int f= 25.3; // 오류발생 작은변수 = 큰값
		int f =(int) 25.3;
		System.out.println(f);
		
	}

}
