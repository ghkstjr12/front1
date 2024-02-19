package week03.day12.상속Inheritance.고기;

public class Ex02 {

	public static void main(String[] args) {
		
		//override (재정의)
		Meat a = new Chicken();
		Meat c =new Cow();
		Meat p =new Pig();
		Meat s =new Sheep();
		
		a.굽기();
		c.굽기();
		p.굽기();
		s.굽기();
		
		//위의 내용 배열로
		Meat[] arr = new Meat[4];
		arr[0]= new Chicken();
		arr[1]= new Cow();
		arr[2]= new Pig();
		arr[3]= new Sheep();
		
		for (int i =0; i<arr.length;i++) {
			arr[i].굽기();
		
			}
		}

	}


