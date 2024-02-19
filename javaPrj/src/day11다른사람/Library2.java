package day11다른사람;

import java.util.Scanner;

public class Library2 {
	String name;
	String title;
	
	public Library2(String name, String title) {
		this.name = name;
		this.title = title;
	}
	
	public void printInfo() {
		System.out.printf("%s님의 대출상황\n",name);
		System.out.println(title+" 대출중");
	}
	
	

}
