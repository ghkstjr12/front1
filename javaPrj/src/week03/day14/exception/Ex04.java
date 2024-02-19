package week03.day14.exception;

import java.io.IOException;

public class Ex04 {

	public static void main(String[] args) {
		int result=0;
		try {
			result =System.in.read();
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println((char) result);
	
	}

}
