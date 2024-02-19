package week03.day14.인터페이스;

public class 계산기 {
	
	int su1;
	int su2;
	public 계산기() {
		
	}
	public 계산기(int su1, int su2) {
		super();
		this.su1 = su1;
		this.su2 = su2;
	}
	
	
	@Override
	public String toString() {
		return "계산기 [su1=" + su1 + ", su2=" + su2 + "]";
	}
	public int getSub1() {
		return su1;
	}
	public void setSub1(int su1) {
		this.su1 = su1;
	}
	public int getSub2() {
		return su2;
	}
	public void setSub2(int su2) {
		this.su2 = su2;
	}
	
}

