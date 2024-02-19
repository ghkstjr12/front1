package day11다른사람;

public class Movie1 {

	String title;  //영화제목
    String director;  //감독
    String genre;  //장르
    String actor;  //출연자

    //매개변수 있는 생성자
    public  Movie1(String title, String director, String genre, String actor) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.actor = actor;
    }
    
    //기본생성자
    public Movie1() {

    }

   

    public void printInfo() {
        System.out.print("영화제목 : "+title+", ");
        System.out.print("영화감독 : "+this.director+", ");
        System.out.print("영화장르 : "+this.genre+", ");
        System.out.print("영화배우 : "+this.actor+" ");
        System.out.println();
    }
    
     public static void print(String title, String director, String genre, String actor) {
    	 System.out.print("영화제목 : "+title+", ");
         System.out.print("영화감독 : "+director+", ");
         System.out.print("영화장르 : "+genre+", ");
         System.out.print("영화배우 : "+actor+" ");
         System.out.println();
     
    }
}

