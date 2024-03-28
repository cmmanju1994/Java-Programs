package GenPractice;

public class String_reverseEachWordInString {
	
	public static String revEachWord(String str)
	{
         str=str.trim();
        str=str.replaceAll(" +"," ");
	     String words[]=str.split(" ");
		 String revString="";
		
		for(String w:words)
		{
		   String revWord="";
		    
		    for(int i=w.length()-1;i>=0;i--)
		    {
		    	revWord=revWord+w.charAt(i);
		    }
		    
		    revString=revString+revWord+" "; 
		}
		
		System.out.println(revString.trim());
		return revString;
		
	}

	public static void main(String[] args) {
		
		revEachWord("  Welcome to   java world  ");

	}

}
