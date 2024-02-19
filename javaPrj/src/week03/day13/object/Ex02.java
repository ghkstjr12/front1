package week03.day13.object;

import java.io.ObjectOutput;
import java.util.ArrayList;

public class Ex02 {

	public static void main(String[] args) {
		

		// 가변길이배열의 기능을 제공 
		// 순서보장, 중복허용 
		
		ArrayList list = new ArrayList();
		
		//3명의 학생정보 //업캐스팅 
		list.add(new Score("홍길동",100,90)); //add가 알아서 순서대로 인덱스역할을 함 
		list.add(new Score("김길동",99,90));
		list.add(new Score("나길동",100,80));
		
		//3명의 학생정보 출력 
		for( int i=0; i<list.size(); i++) {
			Object o = list.get(i); //.get(i)번째 것 꺼내오는 코드 / get=> List 인터페이스의 기본 메소드
			System.out.println(o);
			//System.out.println(((Score)o).getName());
			Score score=null; // 위 코드를 세줄로 풀어서 씀 
			score = (Score)o;
			System.out.println(score.getName());
			
		}

		
		
		
		
	}

}
