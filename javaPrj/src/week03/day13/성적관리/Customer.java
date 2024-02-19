package week03.day13.성적관리;

//고객정보를 담을 수 있는 자료형이 필요해 !! 
public class Customer {
	
	String id;
	String pw;
	String name;
	
	
	//생성자
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	
	//세터, 게터 (매개변수생성자 만들 때 처럼 원하는 것만 체크해서 만들 수 있음.)
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	
	//정보를 가져오는 메소드 
	public String toString() {
		return "고객정보"+ id + pw + name;
	}




	
	
}
