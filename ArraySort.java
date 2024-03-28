package GenPractice;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

	public static void main(String[] args) {
		
		Integer a[]= {9,9,8,0,6,6,1,5,3,2};
		
		/*Arrays.parallelSort(a);
		
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a,Collections.reverseOrder());*/
		
		Arrays.sort(a,Collections.reverseOrder());
		
		System.out.println(Arrays.toString(a));

	}

}
