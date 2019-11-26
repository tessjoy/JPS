package number_pgm;

import java.util.Scanner;

public class SumOfDigits_15 {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);	
		int num=s.nextInt();
		int sum=0;
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("Sum of digits "+sum);

	}

}
