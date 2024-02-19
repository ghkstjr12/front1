package week03.day13.arraylist;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		// 업캐스팅과 다운캐스팅의 불편함을 줄인 버전 
		ArrayList<Score> list = new ArrayList<>();
		
		list.add(new Score("하림",100,90));
		list.add(new Score("대치",90,90));
		list.add(new Score("여옥",99,90));
		
		for( int i=0; i<list.size();i++ ) {
			list.get(i).printInfo();  //알아서 형변환을 해줌 
		}
		
	}
	

}
