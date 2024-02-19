package week03.day13.arraylist;



public class OList {
	
	private Object[] nums;  // Object 배열 => 무엇이든 담을 수 있음 
	private int current;
	
	
	public OList() {		 
		nums = new Object[3]; //기본값 
		current=0;
	}
	
	
	public int size() {  
		return current;
	}
	
	public void add(Object obj) {
		
		 
		nums[current] = obj;
		current++;
		
	}
	
	public void clear(){
		//current 초기화
		current=0;
		// nums= new int[3];		
	}
	
	
	public Object get(int index)    { 
		
		return  nums[index];
	
	}

	
	
}
