package week03.day10;

public class OrderTest2 {

	public static void main(String[] args) {
		Order2 order = new Order2();
		
		/* 
		 order.orderNo = 20180132010231;
		order.id =abc123;
		order.orderDate =2018년3월12일;
		order.name= 홍길동;
		order.goodsNo =서울시 영등포구 어쩌구;
		order.addr = 2131212;
		
		
		 System.out.println(orderNo);
		System.out.println(id);
		System.out.println(orderDate);
		System.out.println(name);
		System.out.println(goodsNo);
		System.out.println(addr);
		 */
		
		order.input("20180132010231", "abc123", "2018년3월12일", "홍길동", "서울시 영등포구 어쩌구", "2131212");
		order.printInfo();
		
	
	}

}
