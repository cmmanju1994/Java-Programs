package GenPractice;

public class LargestOf3Ternary {

	public static void main(String[] args) {
		
		int a=10,b=20,c=100;
		
		int largest=a>b?a:b;
		//System.out.println(largest);
		
		largest=c>largest?c:largest;
		System.out.println(largest);

	}

}
