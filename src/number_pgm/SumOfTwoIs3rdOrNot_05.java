package number_pgm;

import java.util.Scanner;

public class SumOfTwoIs3rdOrNot_05 {

	public static void main(String[] args) {
		System.out.println("Enter three numbers");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if((a+b)==c||(b+c)==a||(a+c)==b)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}

	}

}
