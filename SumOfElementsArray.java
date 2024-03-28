package GenPractice;

public class SumOfElementsArray {

	public static void main(String[] args) {
		
		int a[]= {2,4,5,6,8,9};
		System.out.println("Length of an array "+a.length);
		int sum=0;
		
		/*for(int i=0;i<=a.length-1;i++)
		{
		  sum=sum+a[i];
		}*/
		
		for(int x:a)
		{
			sum=sum+x;
		}
		
		System.out.println("Sum of an elements in an array is "+sum);

	}

}
