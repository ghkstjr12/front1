package week03.day10;

public class OrderTest {

	public static void main(String[] args) {
		 
		Order order  = new Order();
		
		order.orderNo ="201803120001" ;
		order.id="abc123";
		order.orderDate ="2018년3월12일";
		order.name="홍길순";
		order.addr ="서울시 영등포구 여의도동 20번지";
		order.goodsNo="😛D0345-12";
		
		
		System.out.println( order.orderNo );
		System.out.println( order.id );
		System.out.println( order.orderDate );
		System.out.println( order.name );
		System.out.println( order.addr );
		System.out.println( order.goodsNo );
		 
		
		
		
	}

}
