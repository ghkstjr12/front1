package week02.day7;

public class 함수_맛보기 {

	public static void main(String[] args) {
		System.out.println("안녕~");
		
		인사하기();
		
		int sum = 0;
		for (int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("sum : " + sum);
		
		합구하기();
		
		int result = getsu();
		System.out.println(result);
	}
	

	
	//            반환값  기능명( 매개변수 )
	public static void 인사하기() {
		System.out.println("안녕~!");
	}
	
	public static void 합구하기() {
		int sum = 0;
		for (int i=1; i<=5; i++) {
			sum += i;
		}
		System.out.println("sum : " + sum);
	}
	
	public static int getsu() {
		return 8;
	}
}
