package string_pgm;

import java.util.Scanner;

public class RotateOneChar {

	public static void main(String[] args) {
		System.out.println("Enter the string ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ch1[]=s.toCharArray();
		for(int i=0;i<ch1.length;i++)
		{
			for(int j=0;j<ch1.length;j++)
			{
				int a=(i+j)%ch1.length;
				System.out.print(ch1[a]);
			}
			System.out.println();
		}
		
	}

}
