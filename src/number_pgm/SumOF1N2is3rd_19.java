package number_pgm;

import java.util.Scanner;

public class SumOF1N2is3rd_19 {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int sum=0;
		int n=num/10;
		int n3=num%10;
		while(n>0)
		{
			sum=sum+n%10;
			n=n/10;
		}
		if(sum==n3)
			System.out.println("3rd of given number is equal to the sum "
				+ "of 1st two digits");
		else
			System.out.println("3rd of given number is not equal "
					+ "to the sum of 1st two digits");
	}

}
