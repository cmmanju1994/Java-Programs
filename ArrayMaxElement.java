package GenPractice;

public class ArrayMaxElement {

	public static void main(String[] args) {
		
		int a[]= {10,25,1,52,85,140,25};
		int len=a.length;
		int max=a[0];
		
		// Initially assume first value as maximum 
		
		for(int i=1;i<len;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		
		System.out.println(max);
		
		}

}
