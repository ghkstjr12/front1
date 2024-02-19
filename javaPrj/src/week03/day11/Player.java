package week03.day11;

public class Player {
	
	private String 선수이름;
	private String 포지션;
	private int 점수;
	

	public Player(String 이름,String 포지션,int 점수) {
		선수이름=이름;
		this.포지션=포지션;
		this.점수=점수;
	
	}
	public Player() {
		
	}
	
	public void show() {
		System.out.println(this.선수이름);
		System.out.println(포지션);
		System.out.println(점수);
	}
	
	public static void player(String 선수이름,String 포지션,int 점수) {
		System.out.println(선수이름);
		System.out.println(포지션);
		System.out.println(점수);
	}
}