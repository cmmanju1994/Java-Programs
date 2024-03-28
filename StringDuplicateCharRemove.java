package GenPractice;

import java.util.HashSet;
import java.util.Set;

public class StringDuplicateCharRemove {

	public static void main(String[] args) {
	
		String str="dell";
		
		Set<Character> st=new HashSet<Character>();
		
		for(int i=0;i<str.length();i++)
		{
			st.add(str.charAt(i));
		}
		
		StringBuffer sb=new StringBuffer();
		
		for(char x:st)
		{
			sb.append(x);
		}
		
		System.out.println(sb);
		
		

	}

}
