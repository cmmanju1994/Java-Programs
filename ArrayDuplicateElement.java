package GenPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArrayDuplicateElement {

	public static void main(String[] args) {
		
		//String a[]= {"Java","Selenium","Java","Cucumber","Python","Selenium"};
		
		// Approach 01
		
		/*for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Found duplicate element "+a[i]+" at "+i+" and at "+j);
				}
					
			    
			}
		}*/
		
		//Approach 02
		
		/*Map<String,Integer> lang=new HashMap<String,Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(lang.containsKey(a[i]))
			{
				lang.put(a[i], (lang.get(a[i])+1));
			}
			else
			{
				lang.put(a[i], 1);
			}
		}
		
		for(Map.Entry<String,Integer> entry:lang.entrySet())
		{
			if(entry.getValue()>1)
			System.out.println(entry.getKey()+"    "+entry.getValue());
		}*/
		
		// Approach 03 : Using Hash set
		
		String a[]= {"Java","Selenium","Jlava","Cucumber","Python","Se2lenium"};
		
		// if we try to add duplicate element to the set it will return as false
		
		Set<String> st=new HashSet<String>();
		boolean Status=false; 
		for(String h:a)
		{
			if(st.add(h)==false)
			{
				System.out.println("Duplicate element found "+h);
				Status=true;
			}
		}
		
		if(Status==false)
		{
			System.out.println("Duplicate element not found");
		}

		
		
		
	
		

	}

}
