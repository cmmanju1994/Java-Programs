package GenPractice;

import java.util.Arrays;

public class ArrayClone extends Array1 {

	public static void main(String[] args) {
	
		String a1[]= {"Karnataka","Gujarat","Maharastra","Mumbai"};
		
		/*for(String x:a1)
		{
			System.out.println(x);
		}*/

		String a2[]=a1.clone();
		
		System.out.println(Arrays.equals(a1,a2));
	}

}
