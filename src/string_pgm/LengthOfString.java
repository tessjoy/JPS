package string_pgm;

import java.util.Scanner;

public class LengthOfString {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ch1[]=s.toCharArray();
		int i=0;
		for(char c:s.toCharArray())
		{
			i++;
		}
		System.out.println("length of string "+i);

	}

}
