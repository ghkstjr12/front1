package day5.quiz;

import java.util.Scanner;

public class 문제7 {
   public static void main(String[] args) {
      Scanner sc  = new Scanner(System.in);
      int sum=0; int i=1;
//      for(;i<=10;i++) {
//         int number= sc.nextInt();
//         if(number%2==0) {
//            sum+=number;
//         }
//      }
//      System.out.println("for문 짝수의 합"+sum);
      
      while(i<=10) {
         int number= sc.nextInt();
         i++;
         if(number%2==0) {
            sum+=number;
         }
      }
      System.out.println("while문 짝수의 합"+sum);
   }
}

