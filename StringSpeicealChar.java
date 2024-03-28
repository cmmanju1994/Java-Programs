package GenPractice;

public class StringSpeicealChar {

	public static void main(String[] args) {
		
		String s="^$&#*@(Manju13625";
		
		s=s.replaceAll("[^a-zA-Z]", "");
		System.out.println(s);
		
		String str="ManJuNAth";
		
		str=str.replaceAll("[^a-z]", "");
		System.out.println(str);

		
	}

}
