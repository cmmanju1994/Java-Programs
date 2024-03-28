package GenPractice;

import java.util.HashMap;
import java.util.Map;

public class ChracterFrequency {

	public static void main(String[] args) {
		
		String str="Anvita doni ";
		str=str.trim().toLowerCase().replace(" ", "");
		
		Map<Character,Integer> mp=new HashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++)
		{
			if(mp.containsKey(str.charAt(i)))
			{
				mp.put(str.charAt(i), (mp.get(str.charAt(i))+1));
			}
			else
			{
				mp.put(str.charAt(i), 1);
			}
		}
		
		for(Map.Entry entry:mp.entrySet())
		{
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}

	}

}
