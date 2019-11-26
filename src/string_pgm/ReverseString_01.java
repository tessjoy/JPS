package string_pgm;

import java.util.Scanner;

public class ReverseString_01 {

	public static void main(String[] args) {
		System.out.println("Enter the string which you want to reverse");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ch1[]=s.toCharArray();
		char ch2[]=new char[ch1.length];
		int j=0;
		for(int i=ch1.length-1;i>=0;i--)
		{
			ch2[j]=ch1[i];
			j++;
		}
		String s1=String.valueOf(ch2);
		System.out.println("Reverse of "+"'"+s+"'"+" is "+s1);

	}

}
