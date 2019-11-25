package string_pgm;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
//		String s1="mary";
//		String s2="army";
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
				System.out.println("Strings are anagram");
			}
			else
			{
				System.out.println("Strings are not anagram");
			}
		}
		else
		{
			System.out.println("Strings are not anagram because length for strings are ot matching");
		}

	}

}
