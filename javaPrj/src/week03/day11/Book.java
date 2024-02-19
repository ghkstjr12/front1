package week03.day11;

public class Book {

		String title;
		int price;
		
		public Book() {
			
		}
		public void show() {
			System.out.println(title+"의 가격은"+ price+"입니다");
		}
		
		public static void main(String[] args) {
		
		 Book[] b = new Book[4];
		 
		 for (int i=0; i<b.length; i++) {
				b[i] = new Book();	// Book 객체 생성
			}
			
			b[0].title = "국어";
			b[0].price = 7000;
			
			b[1].title = "영어";
			b[1].price = 8000;
			
			b[2].title = "수학";
			b[2].price = 8000;
			
			b[3].title ="자격증";
			b[3].price= 10000;

			for (int i=0; i<b.length; i++) {
				b[i].show();
			}
		}
	}
	