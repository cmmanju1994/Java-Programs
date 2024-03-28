package GenPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class collections1 {

	public static void main(String[] args) {
		
		// to find an array frequency

		int a[]= {10,20,20,40,50,60,20,30,60,80,40};
		int n=a.length;
		
		Map<Integer,Integer>mp=new HashMap<Integer,Integer>();
		
		for(int i=0;i<n;i++)//i=0,0<11//i=1,1<11//i=2,2<11
		{
			if(mp.containsKey(a[i]))//
			{
				mp.put(a[i],(mp.get(a[i])+1));///mp.put(20,(2+1)
			}
			
			else///
			{
				mp.put(a[i],1);///mp.put(10,1)//mp.put(20,1)
			}
		}
		
		
		for(Map.Entry entry:mp.entrySet())
		{
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		mp.put(1,101);
//		mp.put(2,102);
//		mp.put(3, 103);
//		
//		System.out.println(mp);
//		
//		System.out.println(mp.get(2));
//		
		
		
	}

}
