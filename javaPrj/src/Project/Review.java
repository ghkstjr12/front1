package Project;

import java.util.ArrayList;

public class Review {
	private String text;
	private ArrayList<Review> review;
    private int rating;

    // 생성자
    public Review(String text, int rating) {
        this.text = text;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "리뷰{내용='" + text + "', 별점=" + rating + "}";
    }

}
