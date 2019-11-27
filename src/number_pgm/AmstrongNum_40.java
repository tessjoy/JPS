package number_pgm;

import java.util.Scanner;

public class AmstrongNum_40 {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int num1=num;
		int count=0,sum=0;
		while(num1>0)
		{
			count++;
			num1/=10;
		}
		num1=num;
		while(num1>0)
		{
			int digit=num1%10;
			int i=1,prod=1;
			while(i<=count)
			{
				prod=prod*digit;
				i++;
			}
			sum=sum+prod;
			num1=num1/10;
		}
		if(sum==num)
		{
			System.out.println(num+" is an amstrong number");
		}
		else
		{
			System.out.println(num+" is not an amstrong number");
		}
		

	}

}
