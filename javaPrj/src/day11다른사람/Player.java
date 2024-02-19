package day11다른사람;

public class Player {
	//맴버변수 생성
	String name; //선수명
	int kick; //킥력
	int stamina; //지구력
	int intellect; // 판단력
	int quickness; // 순발력
	int popularity; //인지도
	
	//매개변수 있는 생성자 생성
public Player(String n, int kick, int stamina, int intellect, int quickness, int popularity) {
	name=n;
	kick=kick;
	this.stamina=stamina;
	this.intellect=intellect;
	this.quickness=quickness;
	this.popularity=popularity;
	
}
//출력 메소드 생성
public void printInfo() {
	
	System.out.println(name+"의 능력치는?");
	System.out.println("킥력: "+this.kick);
	System.out.println("지구력: "+stamina);
	System.out.println("판단력: "+intellect);
	System.out.println("순발력: "+quickness);
	System.out.println("인지도: "+popularity);
	
}

public static void printInfo2(String n, int kick, int stamina, int intellect, int quickness, int popularity) {
	
	System.out.println(n+"의 능력치는?");
	System.out.println("킥력: "+kick);
	System.out.println("지구력: "+stamina);
	System.out.println("판단력: "+intellect);
	System.out.println("순발력: "+quickness);
	System.out.println("인지도: "+popularity);
	
}

public static void StaticTest() {
//	System.out.println(this.name);
	System.out.println("이건 스테틱 함수입니다.");
	}
}
