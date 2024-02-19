package day10문제;

public class LCK {

	int 순위;
	String 팀이름;
	int 승리;
	int 패배;
	int 승점;

	public  LCK(int 순위,String 팀이름,int 승리,int 패배,int 승점) {
		this.순위=순위;
		this.팀이름=팀이름;
		this.승리=승리;
		this.패배=패배;
		this.승점=승점;
	
	}
	public LCK() {
		
	}
	

	public void showLck() {
		System.out.println(this.순위+"위");
		System.out.println(this.팀이름);
		System.out.println(this.승리+"W");
		System.out.println(this.패배+"L");
		System.out.println(this.승점+"P");
	}
}
