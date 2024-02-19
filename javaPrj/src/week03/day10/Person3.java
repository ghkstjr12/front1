package week03.day10;

public class Person3 {

		private int age;
		private String name;
		private int child;	
		private boolean isMarried;
		
		
		/* public void input (int age, String name,boolean isMarried,int child) {
			this.age = age;
			this.name =name;
			this.child= child;
			this.isMarried =isMarried;
			
		}
	*/	
		public Person3 (int age,String name,int child,boolean isMarried) {
		this.age=age;
		this.name=name;
		this.child=child;
		this.isMarried=isMarried;
	}
		public Person3 () {
			
		}
		
		
		public void printInfo() {
			System.out.println(age);
			System.out.println(name);
			System.out.println(child);
			System.out.println(isMarried);
	
		}

}
