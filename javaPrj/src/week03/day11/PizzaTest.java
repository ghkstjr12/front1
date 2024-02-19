package week03.day11;

public class PizzaTest {

	public static void main(String[] args) {
		Pizza p1 = new Pizza("포테이토 L","더블치즈엣지",27900);
		p1.print();
		Pizza p2 = new Pizza("페퍼로니 L","오리지널도우",18500);
		
		Pizza p3 = new Pizza("페퍼로니 L","슈퍼시드",18500);
		Pizza p4 = new Pizza("치즈 L","씬도우",23900);
		Pizza p5 = new Pizza();
		p5.print();
		
		Pizza p6=new Pizza ("불고기 L","더블치즈엣지");
		p6.print();
	}

}
