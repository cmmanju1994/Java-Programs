package GenPractice;

public class StringCountWords {

	public static void main(String[] args) {
	
		String str="India   is a great   country";
		
		str=str.replaceAll(" +"," ");
		
		String str1[]=str.split(" ");
		
		System.out.println(str1.length);

	}

}
