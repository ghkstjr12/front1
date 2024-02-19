package Project;

import java.util.ArrayList;
import java.util.List;

public class Product1 {
	private String name;
    private double price;
    private int stock; 
    private List<Review> reviews;  // 리뷰클래스 호출 

    // 생성자
    public Product1(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.reviews = new ArrayList<>();
    }

    // 게터 메서드들
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    // 재고 게터/세터 메서드
    public void setStock(int stock) {
        this.stock = stock;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    // 리뷰 추가 메서드
    public void addReview(Review review) {
        reviews.add(review);
    }

    // 리뷰 삭제 메서드
    public void removeReview(int index) {
        reviews.remove(index);
    }

    @Override
    public String toString() {
        return "상품 {상품명='" + name + "', 가격=" + price + ", 재고수량=" + stock + "}";
    }

    // 해당 상품의 리뷰 출력 메서드
    public void printReviews() {
        if (reviews.isEmpty()) {
            System.out.println("상품에 대한 리뷰가 없습니다.");
        } else {
            System.out.println("Reviews for " + name + ":");
            for (int i = 0; i < reviews.size(); i++) {
                System.out.println((i + 1) + ". " + reviews.get(i));
            }
        }
    }

}
