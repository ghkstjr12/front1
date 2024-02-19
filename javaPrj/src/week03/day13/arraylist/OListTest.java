package week03.day13.arraylist;

public class OListTest {

	public static void main(String[] args) {
		
		OList list =new OList();
		list.add(new Score("홍길동",100,90));
		list.add(new Score("김길동",100,90));
		//list.add(new Score("나길동",100,90));

		for( int i=0; i<list.size(); i++) {
			Object o= list.get(i);
			//System.out.println(o.toString());
			//System.out.println(o); // 다운캐스팅 하지 않아도 사용할 수 있다. 부모 메소드 재정의해서 사용했기 때문. 
			((Score)o).printInfo(); //다운캐스팅 하지 않으면 사용할 수 X
			
		}
	}

}
