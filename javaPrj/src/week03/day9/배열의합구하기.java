package week03.day9;

public class 배열의합구하기 {

   public static void main(String[] args) {
      
      int sum =0;
      int[] kors= {80,90,87,99,100};
      
      for(int i=0; i<kors.length; i++) {
         sum+=kors[i];
      }
      
      System.out.println("합계 : " +sum); 
      
      int result = 배열의합구하기(kors);
      System.out.println("함수:"+result);

   }
   
   public static int 배열의합구하기(int [] score) {
      
      int sum=0;
      for(int i=0; i<score.length; i++) {
         sum+=score[i];
      }
      
      return sum;
      
   }

}