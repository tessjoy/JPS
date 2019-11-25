package string_pgm;

import java.util.Scanner;

public class NumOfWords {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ch1[]=s.toCharArray();
		int count=0;
		for(int i=0;i<=ch1.length-1;i++)
		{
			if(i==ch1.length-1&&ch1[i]!=' '||ch1[i]!=' '&&ch1[i+1]==' ')
			{
				count++;
			}
		}
		System.out.println("Number of words in string is "+ count);

	}

}
