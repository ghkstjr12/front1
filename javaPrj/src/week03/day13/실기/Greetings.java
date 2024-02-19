package week03.day13.실기;

public class Greetings {

	char[] input;
	
	public void Greeting(char[] input) {
		this.input=input;
		
		for(int i=0; i<input.length; i++) {
			System.out.print(input[i]);
		}
	}
}
