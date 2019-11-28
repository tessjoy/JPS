package number_pgm;

import java.util.Scanner;

public class PerfectOrNot_43 {

	public static void main(String[] args) {
		int i,number,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr number to check whether it "
				+ "is perfect number  or not");
		int num=s.nextInt();
		for(i=1;i<num;i++)
		{
			if(num%i==0)
				sum=sum+i;
		}
		if(sum==num)
			System.out.println(num+" is a perfect number");
		else
			System.out.println(num+" is not a perfect number");

	}

}
