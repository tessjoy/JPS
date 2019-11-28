package number_pgm;

import java.util.Scanner;

public class TwoNumberAnagramOrNot_46 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the 1st number which you want "
				+ "to check whether anagram or not");
		String s1=s.nextLine();
		System.out.println("Enter the 2nd number which you want "
				+ "to check whether anagram or not");
		String s2=s.nextLine();;
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		if(ch1.length==ch2.length)
		{
			for(int i=0;i<=ch1.length-1;i++)
			{
				for(int j=0;j<=ch2.length-1;j++)
				{
					if(ch1[i]==ch2[j])
					{
						ch2[j]=' ';
						break;
					}
				}
			}
			int j=0;
			for(;j<=ch2.length-1;j++)
			{
				if(ch2[j]!=' ')
				{
					break;
				}
			}
			if(j==ch2.length)
			{
				System.out.println("Numbers are anagram");
			}
			else
			{
				System.out.println("Numbers are not anagram");
			}
		}
		else
		{
			System.out.println("Numbers are not anagram because lengths are not matching");
		}
	}

}
