package GenPractice;

public class SumOfEvenDigits {

	public static void main(String[] args) {
		
		int num=15220;
		int evenCount=0;
		int OddCount=0;
		
		while(num>0)
		{
			int rem=num%10;
			
			if(rem%2==0)
			{
				evenCount=evenCount+rem;
			}
			else
			{
				OddCount=OddCount+rem;
			}
			
			num=num/10;
		}
		System.out.println("Even count "+evenCount);
		System.out.println("OddCount "+OddCount);

	}

}
