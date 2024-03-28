package GenPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashmp;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.mp;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.commons.math3.util.MultidimensionalCounter.Iterator;

public class COllections {
	
	public static int NumberofCharacters(String str,char c)
	{
		int count=0;
		str.toLowerCase();

		for(int i=0;i<str.length();i++)
		{
		     if(str.charAt(i)==c)
		     count++;
		}

		System.out.println("number of given character in a given string is "+count);
		return count;
	}

	
	public static void main(String[] args)
	{
		
		
		//COllections obj=new COllections();
		//obj.NumberofCharacters("india", 'i');
		
		String lang[]= {"Java","Python","C","Ruby"};
		
		List<String> li=new ArrayList<String>(Arrays.asList(lang));
		
		java.util.Iterator<String> it=li.iterator();
		
		
		
		
		
		li.add("C#");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
		ArrayList<String> fruit=new ArrayList<String>();
		fruit.add("Apple");
		fruit.add("Kiwi");
		fruit.add("Cucumber");
		
		ArrayList<String> Vegetables=new ArrayList<String>();
		Vegetables.add("Potato");
		Vegetables.add("Cucumber");
		Vegetables.add("Capsicum");
		
		
		
		String a[]=new String[fruit.size()];
		a=fruit.toArray(a);
		
		for(String x:a)
		{
			System.out.println(x.length());
		}
		
		
		
/////		myset.add(225);
////
////		myset.add(2556);
////
////		
////		System.out.println(myset);
////		System.out.println(myset);
////		System.out.println(myset);
//		
//		//ArrayList<String> li1=new ArrayList<String>();
//		
//		
//		
//		//Hashmp mp=new Hashmp();
//		
//		Map<Integer,String> mp=new HashMap<Integer,String>();
//		
//		mp.put(1,"Manju");
//		mp.put(2, "Kiran");
//		mp.put(3, "Sahil");
//		mp.put(4, "andu");
//		mp.put(5, "manju");
//		
//		
//		//System.out.println(mp.containsKey(1));
//		
//		System.out.println(mp);
//		System.out.println(mp.get(2));
//		System.out.println(mp.keySet());
//		System.out.println(mp.values());
//		
//		for(Object k:mp.keySet())
//		{
//			System.out.println(k+"         "+mp.get(k));
//		}
//		
	}

}
