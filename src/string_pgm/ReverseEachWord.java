package string_pgm;

import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ch1[]=s.toCharArray();
		int start=0,last=0;
		System.out.println("Reverse each word");
		for(int i=0;i<=ch1.length-1;i++)
		{
			if(ch1[i]!=' ')
			{
				start=i;
				for(int j=i+1;j<=ch1.length-1;j++)
				{
					if(j==ch1.length-1&&ch1[j]!=' '||ch1[j]!=' '&&ch1[j+1]==' ')
					{
						last=j;
						break;
					}
				}
				
				for(int k=last;k>=start;k--)
				{
					System.out.print(ch1[k]);
				}
				System.out.print(" ");
				i=last;
			}
		}

	}

}
