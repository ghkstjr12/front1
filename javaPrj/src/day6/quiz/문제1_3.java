package day6.quiz;

public class 문제1_3 {

	public static void main(String[] args) {
		int sum=0;
		int[] ab  = new int[5];
		ab[0] = 52;
		ab[1] = 31;
		ab[2] = 19;
		ab[3] =  2222;
		ab[4] = -1;
		
		for( int i=0; i<5; i++) {
			if(ab[i]%2==0){
				sum+=ab[i];
	      }
			
		}
		System.out.println("짝수의 합:" + sum );
	}
	
}

