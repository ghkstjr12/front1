package Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItemOrderProgram {

		public static void main(String[] args) {
	        List<Product1> products = new ArrayList<>();
	        Scanner scanner = new Scanner(System.in);
	        
	        
	        // 초기 상품 목록 생성
	        products.add(new Product1("양말", 3500, 10));
	        products.add(new Product1("장갑", 15000, 5));
	        products.add(new Product1("후드", 45000, 20));
	        
	        
	        
	        boolean shopping = true;
	        while (shopping) {
	            // 상품 조회 및 기능 선택
	            System.out.println("판매중인 상품:");
	            for (int i = 0; i < products.size(); i++) {
	                System.out.println((i + 1) +  ". " + products.get(i));
	            }

	            System.out.print("세부사항을 보고싶으면 상품번호를 입력하세요. 종료를 원하시면 0번, 리뷰작성을 원하시면 -1번, "
	            		+ "리뷰삭제를 원하시면 -2번, " + "상품구매를 원하시면 -3번을 입력하세요: ");
	            int choice = scanner.nextInt();
	            if (choice == 0) {
	                shopping = false;
	                continue;
	            } else if (choice == -1) {
	                writeReview(products, scanner);
	                continue;
	            } else if (choice == -2) {
	                deleteReview(products, scanner);
	                continue;
	            } else if (choice == -3) {
	                purchaseProduct(products, scanner);
	                continue;
	            }

	            int productIndex = choice - 1;
	            if (productIndex >= 0 && productIndex < products.size()) {
	                Product1 selectedProduct = products.get(productIndex);
	                System.out.println("선택된 상품: " + selectedProduct.getName());
	                System.out.println("가격: ₩" + selectedProduct.getPrice());
	                System.out.println("재고수량: " + selectedProduct.getStock());

	                // 해당 상품의 리뷰 출력
	                selectedProduct.printReviews();

	            } else {
	                System.out.println("잘못입력하셨습니다.");
	            }
	        }
	        
	        scanner.close();
	    }

	    // 리뷰 작성 기능
	    private static void writeReview(List<Product1> products, Scanner scanner) {
	        System.out.print("리뷰작성을 원하는 상품 번호를 입력하세요: ");
	        int productIndex = scanner.nextInt() - 1;
	        if (productIndex >= 0 && productIndex < products.size()) {
	            scanner.nextLine(); // consume newline
	            Product1 selectedProduct = products.get(productIndex);
	            System.out.print("리뷰를 입력하세요: ");
	            String reviewText = scanner.nextLine();
	            System.out.print("만족도를 선택해주세요. (1-5): ");
	            int rating = scanner.nextInt();
	            Review review = new Review(reviewText, rating);
	            selectedProduct.addReview(review);
	            System.out.println("리뷰가 성공적으로 등록되었습니다.");
	        } else {
	            System.out.println("유효하지 않은 상품번호입니다.");
	        }
	    }

	    // 리뷰 삭제 기능
	    private static void deleteReview(List<Product1> products, Scanner scanner) {
	        System.out.print("Enter the product number to delete a review: ");
	        int productIndex = scanner.nextInt() - 1;
	        if (productIndex >= 0 && productIndex < products.size()) {
	            Product1 selectedProduct = products.get(productIndex);
	            selectedProduct.printReviews();
	            if (!selectedProduct.getReviews().isEmpty()) {
	                System.out.print("Enter the review number to delete: ");
	                int reviewIndex = scanner.nextInt() - 1;
	                if (reviewIndex >= 0 && reviewIndex < selectedProduct.getReviews().size()) {
	                    selectedProduct.removeReview(reviewIndex);
	                    System.out.println("Review deleted successfully.");
	                } else {
	                    System.out.println("Invalid review number.");
	                }
	            } else {
	                System.out.println("No reviews available to delete.");
	            }
	        } else {
	            System.out.println("Invalid product number.");
	        }
	    }

	    // 상품 구매 기능
	    private static void purchaseProduct(List<Product1> products, Scanner scanner) {
	        System.out.print("Enter the product number to purchase: ");
	        int productIndex = scanner.nextInt() - 1;
	        if (productIndex >= 0 && productIndex < products.size()) {
	            Product1 selectedProduct = products.get(productIndex);
	            System.out.print("Enter the quantity to purchase: ");
	            int quantity = scanner.nextInt();
	            if (quantity > 0) {
	                if (quantity <= selectedProduct.getStock()) {
	                    // 구매 가능한 경우
	                    selectedProduct.setStock(selectedProduct.getStock() - quantity);
	                    double totalPrice = selectedProduct.getPrice() * quantity;
	                    System.out.println("Purchase successful!");
	                    System.out.println("Total Price: $" + totalPrice);
	                } else {
	                    // 재고 부족한 경우
	                    System.out.println("Not enough stock available.");
	                }
	            } else {
	                System.out.println("Invalid quantity.");
	            }
	        } else {
	            System.out.println("Invalid product number.");
	        }
	    }

	

}
