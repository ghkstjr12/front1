package week03.day9;

import java.util.Random;
import java.util.Scanner;

public class 내맘대로문제_최환석 {
	//가위바위보
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String[] options = {"가위", "바위", "보"};
        
        System.out.println("가위바위보 게임을 시작합니다!");
        System.out.print("가위, 바위, 보 중 하나를 선택하세요: ");
        String userChoice = scanner.next();
        
        // 사용자 선택과 컴퓨터 선택 무작위 설정
        int computerChoiceIndex = random.nextInt(3);
        String computerChoice = options[computerChoiceIndex];
        
        System.out.println("사용자의 선택: " + userChoice);
        System.out.println("컴퓨터의 선택: " + computerChoice);
        
        // 승패 결정
        String result = Winner(userChoice, computerChoice);
        System.out.println(result);
        
        scanner.close();
    }
    
    public static String Winner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "비겼습니다!";
        } else if ((userChoice.equals("가위") && computerChoice.equals("보")) ||
                   (userChoice.equals("바위") && computerChoice.equals("가위")) ||
                   (userChoice.equals("보") && computerChoice.equals("바위"))) {
            return "사용자가 이겼습니다!";
        } else {
            return "컴퓨터가 이겼습니다!";
        }
    } 
    
    //묵찌빠 도전~
	//  public static void main(String[] args) {
		//MainView 참조?
		//	MainView mv = new MainView();
			// mv.mainMenu(); 
	// } 
}
