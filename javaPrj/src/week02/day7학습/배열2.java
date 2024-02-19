package week02.day7학습;

public class 배열2 {

	public static void main(String[] args) {
		
		int[]kors = new int[5];
		kors[0]=90;
		kors[1]=70;
		kors[2]=100;
		kors[3]=99;
		kors[4]=90;
		/*
		 * 2   4   6
		 * 8   10   12
		 * 14  16    18
		 */
		
		//2차원 배열
		
		int[][] numbers =new int[3][3]; // 2  4 6
		//1행
		numbers[0][0]=2;
		numbers[0][1]=4;
		numbers[0][2]=6;
		//2행
		numbers[1][0]=8;
		numbers[1][1]=10;
		numbers[1][2]=12;
		//3행
		numbers[2][0]=14;
		numbers[2][1]=16;
		numbers[2][2]=18;
		
		for(int i =0; i<numbers.length; i++) { //2차원 배열크기 => 행의 크기
			for(int j=0; j<numbers[i].length; j++) { // 2차원배열의 행의 크기=>열의 크기
				
				System.out.print(numbers[i][j]+ "  ");
				
			}
			System.out.println();
		}
		
		//2차원 배열 가변길이로 만들 수 있다.
		
		/*
		  1  3
		  5  7  9
		  11 13
		 */
		int[][] su= new int[3][];
		su[0]=new int[2];
		su[1]=new int[3];
		su[2]= new int[2];
		
		//1행
		su[0][0]=1;
		su[0][1]=3;
		
		//2행
		su[1][0]=5;
		su[1][1]=7;
		su[1][2]=9;
		
		
		//3행
		su[2][0] =11;
		su[2][1]= 13;
		
		for(int i=0; i<su.length; i++) {
			for(int j=0; j<su[i].length; j++) {
				System.out.print(su[i][j]+" ");
			}
			System.out.println();
		}
	
	}

}
