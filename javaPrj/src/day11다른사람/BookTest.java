package day11다른사람;

public class BookTest {
	public static void main(String[] args) {
		
		//객체배열
		Book[] books = new Book[4];
		books[0] = new Book("2024 시나공 정보처리산업기사 필기 기본서", "김정준", "길벗", 4.8);
		books[1] = new Book("이것이 자바다", "신용권", "한빛미디어", 4.3);
		books[2] = new Book(" Do it! 반응형 웹 페이지 만들기", "김운아", "이지스퍼", 4.1);
		books[3] = new Book("부트스트랩으로 디자인하라", "양용석", "로드북", 4.9);

		for (int i=0; i<books.length; i++) {
			books[i].print();
			System.out.println("--------------");
		}
	}

}
