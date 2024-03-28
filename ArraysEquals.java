package GenPractice;

public class ArraysEquals {

	public static void main(String[] args) {
		
		char a1[]= {'i','n','d','i','a'};
		char a2[]= {'i','n','d','i','a'};
		int len1=a1.length;
		int len2=a2.length;
		
		boolean status=false;
		
		if(len1==len2)
		{
			for(int i=0;i<len1;i++)
			{
				if(a1[i]==a2[i])
				{
				status= true;
				}
				else
				{
					status=false;
				}
			}
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
		
		if(status==true)
		{
			System.out.println("Arrays are equals");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}

	}

}
