package number_pgm;

import java.util.Scanner;

public class SumOfSquaOf2Is3rdOrNot_06 {

	public static void main(String[] args) {
		System.out.println("Enter three numbers");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if((a*a+b*b)==c||(b*b+c*c)==a||(a*a+c*c)==b)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}

	}

}
