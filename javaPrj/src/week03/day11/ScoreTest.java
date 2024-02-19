package week03.day11;

public class ScoreTest {

   public static void main(String[] args) {
      Score s = new Score("양홍섭", 100, 80);
      s.printInfo();
   
      Score s2 = new Score("김예원", 100, 90);
      s2.printInfo();
      
      Score s3 = new Score("김종범", 80, 90);
      s3.printInfo();
      
      Score s4 = new Score("박범준", 90, 100);
      s4.printInfo();
      
      
      //객체배열
      Score[] scores = new Score[4];
      scores[0] = new Score("양홍섭", 100, 80);
      scores[1] = new Score("김예원", 100, 90);
      scores[2] = new Score("김종범", 80, 90);
      scores[3] = new Score("박범준", 90, 100);

      System.out.println("=== 객체배열 이용 ===");
      for (int i=0; i<scores.length; i++) {
         System.out.println(scores[i]);
      }
   }
   
}