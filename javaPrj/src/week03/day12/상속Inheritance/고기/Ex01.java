package week03.day12.상속Inheritance.고기;

public class Ex01 {

	public static void main(String[] args) {
		//업캐스팅
		Meat c=null;
		c= new Cow(); 
		
		c.먹기();
		
		//다운캐스팅
		((Cow)c).소고기();
		
		//업캐스팅
		Meat s=null;
		s= new Sheep();
		
		s.먹기();
		
		System.out.println("---------------");
		
		//배열로
		Meat[] arr = new Meat[4];
		//업캐스팅
		arr[0]= new Chicken();
		arr[1]= new Cow();
		arr[2]= new Pig();
		arr[3]= new Sheep();
		
		for(int i=0; i<arr.length; i++) {
		   String[] arr2 = {"닭고기","소고기","돼지고기","양고기"};
		   
		   System.out.println(arr2[i]+"는 고기종류");
		   //중간에 다운캐스팅
			if (arr[i] instanceof Pig) {
				((Pig)arr[i]).돼지고기();
		}





	
		
		}
	}

}
