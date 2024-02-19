package day10문제;

import java.util.Scanner;

public class LckTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LCK A2=new LCK(1, "젠지", 4, 0, 6);
		LCK A3=new LCK(2, "T1", 4, 1, 6);
		LCK A4=new LCK(3, "HLE",3, 1, 4);
		LCK A5=new LCK(4, "KT" ,3, 2, 3);
//		A2.LCK(;
//		A3.LCK();
//		A2.showLck();
//		A3.showLck();
//		A4.showLck();
//		A5.showLck();
			
		
	    LCK[] team = new LCK[4]; 
        
        Scanner sc= new Scanner(System.in);
        
        for(int i=0; i<team.length; i++) {
        	int 순위=sc.nextInt();
        	String 팀이름=sc.next();
        	int 승리=sc.nextInt();
        	int 패배=sc.nextInt();
        	int 승점=sc.nextInt();
        	team[i]=new LCK(순위,팀이름,승리,패배,승점);
        }
        for(int i=0; i<team.length; i++) {
        	team[i].showLck();
        }
	}

}
