package week03.day13.성적관리;

public class ScoreTest {

	public static void main(String[] args) {
		//Score s= new Score(); // 이렇게 생긴 생성자가 있기 때문에 사용 가능 
		//s.printInfo();
		
		Score s = new Score("홍길동",100,90);
		s.calcGrade();
		//s.printInfo();
		
		Score[] arr = new Score[5];
		// 0    1    2 	  3    4
		//null null null null null 
		
		//함현지
		//정기원
		//이건희
		
		arr[0] = new Score("함현지",100,100);
		arr[1] = new Score("정기원",100,99);
		arr[2] = new Score("이건희",99,100);
		arr[3] = new Score("홍길동",80,79);
		arr[4] = new Score("김길동",50,40);
		
		//학점구하기 
		for(int i=0; i<arr.length; i++) {
			arr[i].calcGrade();
		}
		
		//성적출력하기 
		for(int i=0; i<arr.length; i++) {
			arr[i].printInfo();
		}
		
		//학생이름 출력하기
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].getName());
		}
		
		//김길동 학생이름 변경
		arr[4].setName("나길동");
		
		//성적출력하기 
		for(int i=0; i<arr.length; i++) {
			arr[i].printInfo();
		}
		arr[4].printInfo();
		
		
	}

}
