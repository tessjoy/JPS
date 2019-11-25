package string_pgm;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		int i,j;
		for(i=0,j=ch.length-1;i<=ch.length/2;i++,j--)
		{
			if(ch[i]!=ch[j])
			{
				break;
			}

		}
		if(i==ch.length/2+1)
		{
		    System.out.println("String "+s+" is palindrome");
		}
		else
		{
			System.out.println( "String "+s+" is not palindrome");
		}


	}

}
