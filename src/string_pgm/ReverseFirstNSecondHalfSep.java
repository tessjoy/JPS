package string_pgm;

import java.util.Scanner;

public class ReverseFirstNSecondHalfSep {

	public static void main(String[] args) {
		System.out.println("Enter the string which you want to reverse");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ch1[]=s.toCharArray();
		int l=0;
		if(ch1.length%2==0)
		{
		   l=ch1.length-1;	
		}
		else
		{
			l=ch1.length+1;
		}
		char ch2[]=new char[ch1.length/2];
		char ch3[]=new char[ch1.length/2];
		int j=0;
		for(int i=l/2;i>=0;i--)
		{
			ch2[j]=ch1[i];
			j++;
		}
		int k=0;
		for(int i=l;i>=ch1.length/2;i--)
		{
			ch3[k]=ch1[i];
			k++;
		}
		System.out.println("first half "+String.valueOf(ch2));
		System.out.println("second half "+String.valueOf(ch3));
	

	}

}
