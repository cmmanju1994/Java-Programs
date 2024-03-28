package GenPractice;

public class ArrayLinearSearch {

	public static void main(String[] args) {
		
		int a[]= {4,5,6,9,4,1,5,2};
		int SearchEle=50;
		
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(SearchEle==a[i])
			{
				System.out.println("Element found at "+i);
				flag=true;
				
			}
		}
		
		if(flag==false)
		{
			System.out.println("Element not found in the array");
		}

	}

}
