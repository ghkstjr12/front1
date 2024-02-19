package day5.quiz;

public class 수맞추기교수님ver {

	public static void main(String[] args) throws InterruptedException {
		 /*####게임문제 만들어 보기####
		 만들어보고 싶은 사람은 직접 만들어 보세요 

		 컴퓨터가 램덤수를 정합니다. 이 수를 맞추는 게임입니다.
		 A, B, C가 랜덤수를 맞추는 게임입니다.
		 (A, B, C 또한 랜덤수를 발생해서 맞추는 게임 입니다.)
		 셋 중 하나만 맞추었을 때만 프로그램이 종료되어  
		 수를 맞춘 것을 고르는 문제입니다.

		 =>프로그램이 시작되고 정답을 맞추면 게임이 종료되어 여러분에게 맞추어 보세요라는 메시지를 출력합니다.
		 =>여러분이  A, B, C에서 맞춘 변수를 찾아보세요 ^^

		 간식선물이 있어요 ! 
		  초코바 + 말랑카우 + 스낵 =>3종세트 증정  (월요일)
		  */
		
		
		
		
	/*처리 : 각 랜덤을 맞출 수 : A,B,C
	 *        컴퓨터 난수 :computer
	 *        맞춘 수를 저장할 변수 : cnt 
	 *출력 : winner 
	 *  
	 *컴퓨터가 랜덤수를 발생한다
	 * 반복 (맞춘 개수가 1개가 아닐동안)
	 *   - A, B, C 변수가 랜덤수 발생
	 *   - A, B, C가 맞춘지 판단	    
	 *     -맞춘변수  winner에 저장 
               *     -맞춘카운트 증가 
	 */
   

		 int a, b, c;
		 int computer;
		 int cnt=0;
		 char winner='x';
		 
		 computer = (int) (Math.random()*100) +1;
		 System.out.println("컴퓨터가 수를 정했습니다 ");
		 
		 while(cnt!=1) {
			 a = (int) (Math.random()*100) +1;
			 b = (int) (Math.random()*100) +1;
			 c = (int) (Math.random()*100) +1;
			 System.out.println( "a, b,c가  수를 맞추기 시작합니다");
			 
			 if( a== computer) {
				 cnt++;
				 winner= 'a';
			 }
			 if( b== computer) {
				 cnt++;
				 winner='b';
			 }
			 if( c== computer) {
				 cnt++; 
				 winner='c';
			 }
			 
		 }
		 
		 //
		 
		 System.out.println( " 맞춘 수가 있어요 !!.. , a, b, c 중에서 골라주세요 ! 행운이 있기를");
		 
		 System.out.println( " 결과는 50초 후에 발표됩니다. 콘솔창에 집중해 주세요");
		 Thread.sleep(50000);
		 
		 
		 System.out.println("쨔잔 : 축하합니다=====>");
		 System.out.println("쨔잔 : 축하합니다=====>");
		 System.out.println("=================>"+ " *****★ " + winner +" ★**** ");

	}

}
