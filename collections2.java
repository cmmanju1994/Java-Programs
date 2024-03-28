package GenPractice;

import java.util.HashMap;
import java.util.Map;

public class collections2 {

	public static void main(String[] args) {
		
		String str="India";
		str=str.toLowerCase().replace(" ", "");
		
		char a[]=str.toCharArray();
		
		//System.out.println(a);
		
		int len=a.length;
		
		// creating new map
		
		Map<Character,Integer> mp=new HashMap<Character,Integer>();
		
		for(int i=0;i<len;i++)
		{
			if(mp.containsKey(a[i]))
			{
				mp.put(a[i],(mp.get(a[i])+1));
			}
			else
			{
				mp.put(a[i],1);
			}
				
		}
		
		for(Map.Entry entry:mp.entrySet())
		{
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
	}

}
