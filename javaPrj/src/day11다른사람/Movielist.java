package day11다른사람;

public class Movielist {

	public static void main(String[] args) {
		//                    	영화제목  / 감독  /  장르  /  출연자
		Movie1 m1 = new Movie1("서울의봄","김성수","액션/드라마","황정민");
        Movie1 m2 = new Movie1("괴물","봉준호","스릴러/액션","송강호");
        Movie1 m3 = new Movie1("명량", "김한민", "사극/전쟁","최민식");
        Movie1 m4 = new Movie1("7번방의 선물", "이환경", "로맨스/스릴러","류승룡");
       

        m1.printInfo();
        m2.printInfo();
        m3.printInfo();
        m4.printInfo();
        
        
        System.out.println("Static 사용");
        Movie1.print("하모니","박감독","로맨스","이배우");
   
   



	
	
		
	}
}
