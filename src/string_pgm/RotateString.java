package string_pgm;

import java.util.Scanner;

public class RotateString {

	public static void main(String[] args) {
		System.out.println("Enter the string ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			for(int j=0;j<s1.length;j++)
			{
				int a=(i+j)%s1.length;
				System.out.print(s1[a]+" ");
			}
			System.out.println(" ");
		}

	}

}
