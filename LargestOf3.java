package GenPractice;

public class LargestOf3 {
	
	public static int largestOf3(int a,int b,int c)
	{
		
		int largest=0;
		if(a>b && a>c)
		{
			System.out.println("a is largest ");
			largest=a;
		}
		else if(b>a && b>c)
		{
			System.out.println("b is largest ");
			largest=b;
		}
		else
		{
			System.out.println("c is largest " );
			largest=c;
		}
		return largest;
	}

	public static void main(String[] args) {
		
		System.out.println(largestOf3(100,200,300));
	
		
		

	}

}
