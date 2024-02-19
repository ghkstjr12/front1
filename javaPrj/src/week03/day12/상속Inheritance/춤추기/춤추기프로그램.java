package week03.day12.상속Inheritance.춤추기;

public class 춤추기프로그램 {

	public static void main(String[] args) {
		
		Person[] persons= new Person[14];
		
		//16객체 배열 담기
		persons[0]= new 정기원();
		persons[1]= new 장유나();
		persons[2]= new 강지훈();
		persons[3]= new 김수진();
		persons[4]= new 김연수();
		persons[5]= new 김예원();
		persons[6]= new 박범준();
		persons[0]= new 양홍섭();
		persons[8]= new 여민혜();
		persons[9]= new 유원준();
		persons[10]= new 윤라영();
		persons[11]= new 윤성진();
		persons[12]= new 최환석();
		persons[13]= new 함현지();
	//	persons[14]= new ();
	//	persons[15] = new ();
		
		
		
		for(int i=0; i<persons.length; i++) {
			persons[i].춤추기();
		}
	}

}
