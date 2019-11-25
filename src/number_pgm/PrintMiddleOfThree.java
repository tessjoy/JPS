package number_pgm;

import java.util.Scanner;

public class PrintMiddleOfThree {

	public static void main(String[] args) {
		System.out.println("Enter three numbers");
		Scanner s=new Scanner(System.in);
		for(int i=1;i<=3;i++)
		{
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a<b&&b<c||c<b&&b<a)
		{
			System.out.println("Middle is "+b);
		}
		else if(b<a&&a<c||c<a&&a<b)
		{
			System.out.println("Middle is "+a);
		}
		else
		{
			System.out.println("Middle is "+c);
		}	
		}
		}

}
