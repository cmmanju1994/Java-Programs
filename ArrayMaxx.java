package GenPractice;

import java.util.Arrays;

public class ArrayMaxx {

	public static void main(String[] args) {
		
		  int a[]={500,125,25,1,100};
		  int max=0;
		  int min=0;

	       Arrays.sort(a);
	       
	       for(int i =0;i<a.length;i++)
	       {
	    	   min=a[0];
	    	   max=a[a.length-1];
	    	   
	       }
	       
	       System.out.println("Minimum value is "+min);
	       System.out.println("Maximum value is "+max);
	}

}
