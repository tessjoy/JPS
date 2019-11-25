package string_pgm;

import java.util.Scanner;

public class NumOfTotalChar {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ch1[]=s.toCharArray();
		int count=0
				;
		
		for(int i=0;i<=ch1.length-1;i++)
		{
			if(ch1[i]!=' ')
			{
				count++;
			}
			
		}
		System.out.println(count);

	}

}
