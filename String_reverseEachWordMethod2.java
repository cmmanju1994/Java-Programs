package GenPractice;

public class String_reverseEachWordMethod2 {
	
	public static String rev(String str)
	{
		
		
		String words[]=str.split("\\s");  
	    String reverseWord="";  
	    for(String w:words){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord+=sb.toString()+" ";  
	    }  
	    return reverseWord.trim();
	}

	public static void main(String[] args) {
		
		
		System.out.println(rev("   India is a country"));
		

	}

}
