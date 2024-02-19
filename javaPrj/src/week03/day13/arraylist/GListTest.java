package week03.day13.arraylist;

public class GListTest {

	public static void main(String[] args) {
		

		GList<Score> list =new GList<>();
		
		list.add(new Score("하림",100,90));
		list.add(new Score("대치",90,90));
		list.add(new Score("여옥",99,90));

		for( int i=0; i<list.size(); i++) {
			list.get(i).printInfo();
		}
		
	}

}
