package GenPractice;

import java.util.HashMap;
import java.util.Map;

public class mob {

	public static void main(String[] args) {
		
		String str="8197763011";
		
		str=str.replace(" ", "").trim();
		
		char []b=str.toCharArray();
		int len=b.length;
		
		Map<Character,Integer> mp=new HashMap<Character,Integer>();
		
		for(int i=0;i<len;i++)
		{
			if(mp.containsKey(b[i]))
			{
				mp.put(b[i],(mp.get(b[i])+1));
			}
			else
			{
				mp.put(b[i],1);
			}
		}
		
		for(Map.Entry<Character,Integer> entry:mp.entrySet())
		{
			if(entry.getValue()<=1)
			{
			System.out.println(entry.getKey()+"   count=  "+entry.getValue());
			}
		}

	}

}
