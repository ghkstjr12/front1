package week01.day3;

import java.util.Scanner;

public class 매운맛4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//변수선언
		String name;
		int ko,math,eng;
		
		int avg;//개인의 평균
		int kAvg, mAvg ,eAvg; //과목별 평균
		
		//처리
		int kSum=0, mSum=0, eSum=0; //각 과목별 종점
		int count=0; // 
		
		Scanner sc = new Scanner(System.in);
		
		while(true) { //무한 loop =>반드시 탈출조건이 있어야함 
			name= sc.next();
			ko= sc.nextInt();
			math= sc.nextInt();
			eng= sc.nextInt();
			
			if( name.equals("0"))break;
			
			kSum = kSum +ko;
			mSum = mSum + math;
			eSum = eSum +eng;
			
			avg= (ko+math+eng)/3;
			
			if (avg>=90) {
				System.out.println("excellent");
			}else {
				if ( avg <=60) {
					System.out.println("fail");
					
					
				}
			}
			
			//개인성적 출력
			System.out.println(name +":" + ko + ":"+ math + ":" + eng +":"+ avg);
			count= count +1; //count++;
		}
		
		//각 과목별 평균구하기
		kAvg = kSum/ count;
		mAvg = mSum /count;
		eAvg = eSum / count;
		
		System.out.println("국어평균" +kAvg);
		System.out.println("수학평균 " +mAvg);
		System.out.println("영어평균"+ eAvg);
	}
	

}
