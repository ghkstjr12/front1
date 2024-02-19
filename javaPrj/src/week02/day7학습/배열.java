package week02.day7학습;

public class 배열 {

	public static void main(String[] args) {
		
		// 배열사용해보기 1차원,2 차원 ,3차원 배열
		
		//배열선언 , 기억장소를 여러개 확보하는것 ! 반든시 크기를 알아야함
		
		int[] arr = new int[10];
		//배열은 기억장소 (메모리를 확보하는 것이다.)
		//배열을 만들 때 new 키워드 사용해야함
		
		int[]numbers = {8,9,5,10,5} ; //배열의 초기화 문법, 내부적으로 new 사용됨
		
		
		//new =>메모리요청 new int[5] ; => int형 5개를 연속적으로 확보해 주세요
		//new연산자가 메모리를 확보해 주고 확보한 메모리의 시작위치를 반환합니다. (주소를 반환)
		//=> 주소를 저장할 변수를 필요해짐( 참조형 변수)
		// numbers라는 변수는 참조형 변수이다. 배열이 확보된 메모리의 시작 주소를 저장하고 있다.
		// 힙메모리는 요청과 반납을 프로그래머가 하는 영역이다.효율적으로 메모리를 사용할 수 있음
		//c => 
		//int* ap =(int*) malloc(sizeof(int) *4); //16byte요청
		//메모리반납 free(ap);
		// 자바 =>
		// 메모리요청 :new 연산자로 메모리요청 int[] ap =new int[4] ;
		//메모리반납 : 개발자가직접하지 않는다 (JVM => 가비지 콜렉터 대신 해줌)
		//자바에서 배열부터 모두 heap옆역을 사용하도록 강제되어있다.
		//int[] numbers =new int[4];
		// numbers => 참조형 변수 (주소를 기억하는 변수)
		
		//numbers 배열 출력
		//참초형 변수는 statk  주소는 heap
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		//동적 메모리의 반납을 프로그래머가 하지 않음 =>free()x
		//참조를 잃은 경우 =>가비지의 대상이 됨
		
	}
}
