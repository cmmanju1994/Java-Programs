package GenPractice;

public class String_reverseWords {
	
	public String reverseWords(String str)
	{
	       // splitting the string with spaces
		//str=str.trim();
		String words[]=str.split(" +");
		StringBuilder sb=new StringBuilder();
		
		// traverse in a reverse order
		
		for(int i=words.length-1;i>=0;i--)
		{
			sb.append(words[i]);
			sb.append(" ");
		}
		return sb.toString().trim();
		
			
	}

	public static void main(String[] args) {
	
		String_reverseWords obj=new String_reverseWords();
		System.out.println(obj.reverseWords(" banglore is a green  city "));
		System.out.println(obj.reverseWords("banglore is a green  city        "));
		
		
	}

}
