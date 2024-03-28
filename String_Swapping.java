package GenPractice;

public class String_Swapping {

	public static void main(String[] args) {
		
		String str1="Anvita";
		String str2="Doni";
		
		/*String temp="";
		
		temp=str1;
		str1=surstr1;
		surstr1=temp;
		
		System.out.println("str1 is "+str1);
		System.out.println("Surstr1 is "+surstr1);
	*/
		
		str1=str1.concat(str2);//AnvitaDoni
		System.out.println(str1);
		System.out.println(str1.length());//10
		System.out.println(str2.length());//4
		
		// extracting the surstr1
		str2=str1.substring(0,(str1.length()-str2.length()));
		
		//extract str1 from updated str1
		
		//str1=str1.substring(str2.length());
		
		//System.out.println("str1 "+str1);
		//System.out.println("surstr1 "+str2);
		
		
		
		

	}

}
