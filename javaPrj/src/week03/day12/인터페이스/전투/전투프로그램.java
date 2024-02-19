package week03.day12.인터페이스.전투;

public class 전투프로그램 {

	public static void main(String[] args) {
	 
		
		Object[]  olist = new Object[6];
		전투가능한[]  flist  = new 전투가능한[4];
		
		olist[0] = new Cat();
		olist[1] = new Cook();
		olist[2] = new Doctor();
		olist[3] = new Policemen();
		olist[4] = new Student();
		olist[5] = new Dog();
		
		
		int index=0;
		for( int i=0 ; i< olist.length  ; i++) {
			if( olist[i] instanceof 전투가능한 ) {
				flist[index] = (전투가능한)olist[i];
				index++;
			}			
		}
		
		
		//
		System.out.println("싸움을 시작한다");
		for( int i=0; i< flist.length ; i++) {			
		  flist[i].전투한다();	
		}
	}
				
	 
	 
}
