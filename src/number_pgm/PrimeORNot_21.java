package number_pgm;

import java.util.Scanner;

public class PrimeORNot_21 {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int i=2;
		while(num>i)
		{
			if(num%i==0)
				break;
			i++;		
		}
		if(i==num)
			System.out.println(num+" is prime");
		else
			System.out.println(num+" is not a prime");

	}

}
