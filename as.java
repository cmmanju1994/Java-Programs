package GenPractice;

public class as {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="India";
		str=str.replace(" ","");
		int count=0;
		int len=str.length();
		
		System.out.println(len);

		//char []b=new char[len];

		for(int i=0;i<len;i++)
		{
		   str.charAt(i);
		   count++;
		}

		System.out.println("Total characyers present in a string are :"+count);


	}

}
