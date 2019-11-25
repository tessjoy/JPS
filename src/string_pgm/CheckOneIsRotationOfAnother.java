package string_pgm;

import java.util.Scanner;

public class CheckOneIsRotationOfAnother {

	public static void main(String[] args) {
		System.out.println("Enter the 1st string");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		System.out.println("Enter the 2nd string");
		String s2=sc.nextLine();
		if(s1.length()!=s2.length())
		{
			System.out.println("No '"+s2+"' is not rotation fo '"+s1+"'");
		}
			String s3=s1+s1;
			
			if(s3.contains(s2))
			{
				System.out.println("Yes, '"+s2+"' is rotation of '"+s1+"'");
			}
			else
			{
				System.out.println("No, '"+s2+"' is not rotation of '"+s1+"'");
			}
		
			
			
		

	}

}
