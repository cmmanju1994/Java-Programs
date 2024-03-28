package GenPractice;

public class Prime {

	public static void main(String[] args) {
		
		int num=12;
		int count=0;
		
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					count++;
				}
			}
			
			if(count==2)
			{
				System.out.println("Prime number");
			}
			else
				
				{
				System.out.println("Not prime");
				}
		}
		else
		{
			System.out.println("Given number is not prime");
		}

	}

}
