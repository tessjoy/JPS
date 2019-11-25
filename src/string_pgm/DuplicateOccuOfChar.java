package string_pgm;

public class DuplicateOccuOfChar {

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
						if(count>1)
						System.out.println(ch1[i]+" is a duplicate charater in  '"+s+ "'");	
					}
					

				}
				
			}



	}



