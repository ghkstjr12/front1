package week03.day10;

public class Person2 {

		private int age;
		private String name;
		private int child;	
		private boolean isMarried;
		
		
		public void input (int age, String name,boolean isMarried,int child) {
			this.age = age;
			this.name =name;
			this.child= child;
			this.isMarried =isMarried;
			
		}
	
		public void printInfo() {
			System.out.println(age);
			System.out.println(name);
			System.out.println(child);
			System.out.println(isMarried);
	
		}

}
