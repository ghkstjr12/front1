package week03.day13.string;

public class Ex04 {

	public static void main(String[] args) {
		String text ="Love is a variety of different feelings, states, and" + "attitudes that ranges from interpersonal affection to pleasure";
		
		int count = text.length();
		
		//String 안에는 배열이 있음 
		
		String result = text.toLowerCase();  
		System.out.println(result);
		
		String result2 = text.toUpperCase();
		System.out.println(result2);
		
		
		int cnt=0;
		for( int i=0; i<text.length(); i++) {
			if(text.charAt(i)=='a') {
				cnt++;
			}
		}
		
		System.out.println("a====>" + cnt);
		
		
		String str="AWESOME-amazing";
		String[] result3 = str.split("-");
		
		System.out.println(result3[0]);
		System.out.println(result3[1]);
		
		for( int i=0; i<result3.length; i++) {
			System.out.println(result3[i]);
		}
		
		
		//
		String date1 = "2024-02-07";
		
		String[] result4 = date1.split("-");
		/*
		for( int i=0; i<result4.length; i++) {
			if( Integer.parseInt(result4[i]) <10 && result4[i].contains("0")) {
				result4[i] = result4[i].replace("0", "");
			}
		}
		*/
		
		System.out.println(result4[0] + "." + result4[1] + "." + result4[2]);
		
		//
		if( Integer.parseInt (result4[1])<10 && result4[1].contains("0")) {
			result4[1] = result4[1].replace("0", "");
		}
		
		System.out.println(result4[0] + "." + result4[1] + "." + result4[2]);
		
		
		//문자열 추출 하기 
		String re = date1.substring(5);
		String re2 = date1.substring(5, 7);
		
		System.out.println( re);
		System.out.println( re2);
		
	}

}
