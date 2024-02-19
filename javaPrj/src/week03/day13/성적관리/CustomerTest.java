package week03.day13.성적관리;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer c = new Customer("v100","1234","홍길동");
		Customer c1 = new Customer("abc","4586","김길동");
		Customer c2 = new Customer("test","0000","관리자");
		
//		System.out.println(c.toString());
//		System.out.println(c1.toString());
//		System.out.println(c2.toString());
		
		//toString()은 메소드 생략된 형태로 사용할 수 있다. (주로 생략하여 사용) 
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		
		
		//
		//각 고객의 비밀번호 변경하기 
		c.setPw("abc1234");
		c1.setPw("new0000");
		c2.setPw("kkk0000");
		
		
		System.out.println(" 변경후 ===> ");
		System.out.println(c.toString());
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
	
		
	}

}
