package GenPractice;

public class ArrayissingNumber {

	public static void main(String[] args) {
		
		// Arrays should not contain any duplicate values
		// No need to be in sorted order
		int a[]= {10,20,30,40,60};
	
		int sum1=0,sum2=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum2=sum2+a[i];
		}
		
		for(int i=10;i<=60;i=i+10)
		{
			sum1=sum1+i;
		}
		
		System.out.println(sum1-sum2);

	}

}
