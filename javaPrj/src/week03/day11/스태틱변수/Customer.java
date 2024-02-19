package week03.day11.스태틱변수;

public class Customer {
	String id;
	String pw;
	String name;
	
	static int cnt;
	
	public Customer (String id,String pw,String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	public String toString () {
		return " Customer [id=" + id + ", pw = " + pw +", name=" + name +"]";
	}
}
