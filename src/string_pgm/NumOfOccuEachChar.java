package string_pgm;

public class NumOfOccuEachChar {

	public static void main(String[] args) {
		String s="hello world";
		char ch1[]=s.toCharArray();
		
		for(int i=0;i<=ch1.length-1;i++)
		{
			int count=1;
			if(ch1[i]!=' ')
			{
				for(int j=i+1;j<=ch1.length-1;j++)
				{
					if(ch1[i]==ch1[j])
					{
						ch1[j]=' ';
						count++;
					}
				}
				System.out.println("Ocuurance of "+ch1[i]+" = "+count);	
			}
			

		}
		
	}

}
