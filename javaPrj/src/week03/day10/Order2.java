package week03.day10;




	//주문 정보를 담을 수 있는 type 정의+
		//데이터를 다루는 함수(메서드를)함께 정의 함
public class Order2 {

	
	//멤버변수
	String orderNo;
	String id;
	String orderDate;
	String name;
	String goodsNo;
	String addr;
	

	
	public void input (String orderNo, String id,String orderDate,String name, String goodsNo, String addr) {
		this.orderNo = orderNo;
		this.id =id;
		this.orderDate =orderDate;
		this.name= name;
		this.goodsNo =goodsNo;
		this.addr = addr;
		
	}
	
	
	//값을 출력하는 기능함수(매서드)
	
	public void printInfo() {
		System.out.println(orderNo);
		System.out.println(id);
		System.out.println(orderDate);
		System.out.println(name);
		System.out.println(goodsNo);
		System.out.println(addr);
	}
}
