package GenPractice;

public class ArraysMissingNumber1 {

	public static void main(String[] args) {
	
		int a[]= {2,4,6,10};// missing value is 8
		
		int sum2=0,sum1=0;
		
		for(int x:a)
		{
			sum1=sum1+x;
		}
		
		for(int i=2;i<=10;i+=2)
		{
			sum2=sum2+i;
		}
		
		System.out.println("Missing number is "+(sum2-sum1));

	}

}
