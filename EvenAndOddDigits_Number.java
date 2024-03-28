package GenPractice;

public class EvenAndOddDigits_Number {
	
	

	public static void main(String[] args) {
		
		int num=1122000;
		int evenCount=0;
		int oddCount=0;
		int zeroCount=0;
		
		while(num>0)
		{
			int rem=num%10;
			
			if(rem>=1)
			{
				if(rem%2==0)
				{
					evenCount++;
				}
				else
				{
					oddCount++;
				}
			}
			else
			{
				zeroCount++;
			}
			
			
			
			num=num/10;
		}
		
		System.out.println("evenCount "+evenCount);
		System.out.println("oddCount "+oddCount);
		System.out.println("zeroCount "+zeroCount);
		
		/*String num="101";
		int evenCount=0;
		int oddCount=0;
		int zeroCount=0;
		
		for(int i=0;i<=num.length()-1;i++)
		{
			if(num.charAt(i)>='1')
			{
				if(num.charAt(i)%2==0)
				{
					evenCount++;
				}
				else
				{
					oddCount++;
				}
			}
			else
			{
				zeroCount++;
			}
		}
		
		System.out.println("Even number in a given number is "+evenCount);
		System.out.println("Odd number in a given number is "+oddCount);
		System.out.println("Zero number in a given number is "+zeroCount);*/

	}

}
