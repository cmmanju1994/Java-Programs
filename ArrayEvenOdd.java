package GenPractice;

public class ArrayEvenOdd {

	public static void main(String[] args) {
		
		int a[]= {99,80,66,15,32};
		
		int even_sum=0,odd_sum=0;
		
		for(int b:a)
		{
			if(b%2==0)
			{
				even_sum=even_sum+b;
			}
			else
			{
				odd_sum=odd_sum+b;
				
			}
		}
		
		System.out.println("sum of even elements "+even_sum);
		System.out.println("sum of odd elements "+odd_sum);

	}

}
