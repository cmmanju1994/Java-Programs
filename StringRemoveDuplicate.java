package GenPractice;

public class StringRemoveDuplicate {

	public static void main(String[] args) {
		
		String str="indian";
		char[] ch=str.toCharArray();
		
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]!=ch[j])
				{
				   sb.append(ch[i]);
				}
			}
			
		}
		
		System.out.println(sb);
		
		
		
		
	   
		

	}

}
