package week03.day13.arraylist;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		
		 // 노란선이 뜨는 이유는 구버전 기능이기 때문
		ArrayList list = new ArrayList();
		
		list.add(new Score("하림",100,90));
		list.add(new Score("대치",90,90));
		list.add(new Score("여옥",99,90));
				
		
		for( int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());	//toString 생략가능 
			((Score)list.get(i)).printInfo(); //다운캐스팅 
		}
		
		
	}

	
}
