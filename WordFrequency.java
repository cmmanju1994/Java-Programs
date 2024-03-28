package GenPractice;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {

	public static void main(String[] args) {
		
		String str="India is a great country and india is a vast country and india has many cultures";
		str=str.trim().toLowerCase();
		
		String a[]=str.split(" ");
		int len=a.length;
		
		Map<String,Integer> mp=new HashMap<String,Integer>();
		
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
			System.out.println(entry.getKey()+"       "+entry.getValue());
		}
		
		

	}

}
