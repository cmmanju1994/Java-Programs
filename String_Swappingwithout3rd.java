package GenPractice;

public class String_Swappingwithout3rd {

	public static void main(String[] args) {
		
		String str1="Doni";
		String str2="Anvita";
		
		System.out.println("Strings before swapping are "+"name ::"+str1+" surname ::"+str2);
		
		// Concatininate second string with 1st
		
		str1=str1.concat(str2);
		
		// extraction using substring
		
		str2=str1.substring(0,(str1.length()-str2.length()));
		str1=str1.substring(str2.length());
		
		System.out.println("Strings before swapping are "+"name /"+str1+" surname /"+str2);
		

	}

}
