package GenPractice;

public class String_Count_Words {
	
	public static int CountWords(String str)
	{
		str=str.replace(" +", " ").trim();
		int count=1;
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
			{
				count++;
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		
		System.out.println(CountWords("  java is a     robust  programming langaugae   "));
 
	}

}
