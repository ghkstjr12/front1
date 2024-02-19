package week01.day5;

public class 연산자1 {

	public static void main(String[] args) {
		// 연산자 : 연산을 수행하면 연산의 결과가 발생한다. !!!
		
		//단항연산자: ++n, n+=
		//이항연산자 : a+b ,a-b,
		//삼항연산자 : (조건) ?참 :
		
		//대입연산자
		int num =10; //변수에 값을 할당할 때 (기억할 때) 사용
		
		System.out.println(num);
		
		//부호연산자 +,-
		num = -num; //num * -1;
		
		System.out.println(num);
		
		//산술연산자
		int a=90,b=80;
		int sum =a+b;
		int sub = a-b;
		int multi =a*b;
		double devide =a/b; //나누기  정수연산, 실수연산 확인하기
		double devide2 =a/(double)b;
		//소수이하의 값을 저장하기 위해서는 실수 연산이 이루어질 수 있도록 해야함
		//둘 중 하나를 실수형으로 형 변환(명시적형변환) 시켜야 함
		int remain = a % b;
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(multi);
		System.out.println(devide);
		System.out.println(devide2);
		System.out.println(remain);
	}

}
