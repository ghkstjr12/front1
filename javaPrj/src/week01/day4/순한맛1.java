package week01.day4;

public class 순한맛1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		int i=1;
		
		while(i<9) {
			if(i%2 !=0) {
				sum= sum+i;
				System.out.println(i);
			}
			i++;
		}
		
		System.out.println(sum);
	}

}
