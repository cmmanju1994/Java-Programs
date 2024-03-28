package GenPractice;

public class Array1 {

	public static void main(String[] args) {
		 int array1[]= {10,20,30,40,50};
		 
				
	
		 
		 // iteration an array
		 
		 // using normal loop
		 for(int i=0;i<=array1.length-1;i++)
		 {
			 System.out.println(array1[i]);
		 }
		 
		 
		 // enhanced for loop
		 
		 for(int x:array1)
		 {
			 System.out.println(x);
		 }

	}

}
