package week03.day10;

public class CarTest2 {

	public static void main(String[] args) {
		//
		Car2 c1= new Car2();//자동차 정보를 담을 수 있는 변수가 만들어진 것 
		
		// c1.input("싼타페", "현대", 3500); //input() 기능제공
		c1.printInfo(); //printInfo() 제공
		
		Car2 c2 = new Car2("k7","현대",4500);
		c2.printInfo();
		//int result= Math.max(5, 3);
		//System.out.println(result);
		
		
		
	}

}
