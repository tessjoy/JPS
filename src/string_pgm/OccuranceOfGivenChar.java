package string_pgm;

import java.util.Scanner;

public class OccuranceOfGivenChar {

	public static void main(String[] args) {

		String s="Welcome to Bangalore ";
		char ch1[]=s.toCharArray();
		char c='a';
		int count=0;
		for(int i=0;i<=ch1.length-1;i++)
		{
			if(ch1[i]!=' ')
			{
				if(ch1[i]==c)
				{
					count++;
				}
			}
		}
		System.out.println("Number of occurance of character "+c+" is "+count);
	}

}
