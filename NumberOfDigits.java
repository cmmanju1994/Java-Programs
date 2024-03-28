package GenPractice;

public class NumberOfDigits {

	public static void main(String[] args) {
		
		int num=12045;
		int count=0;
		
		
		while(num>0)
		{
			int rem=num%10;
			count++;
			
			num=num/10;
			
		}
		
		
		
		System.out.println(count);

	}

}
