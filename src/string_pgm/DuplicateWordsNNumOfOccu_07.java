package string_pgm;

import java.util.Scanner;

public class DuplicateWordsNNumOfOccu_07 {

	public static void main(String[] args) {
		//String s="Welcome to Bangalore to";
		System.out.println("Enter the String");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String s1[]=str.split(" ");
		
		for(int i=0;i<=s1.length-1;i++)
		{
		int count=1;
		String s2=s1[i];
		if(s1[i]!=" ")
		{
			for(int j=i+1;j<=s1.length-1;j++)
			{
				if(s2.equals(s1[j]))
				{
					s1[j]=" ";
					count++;
				}
			}
			if(count>1)
			System.out.println("Word '"+s1[i]+"' is duplicate and occured "+count+" times");
		}
		}
	

	}

}
