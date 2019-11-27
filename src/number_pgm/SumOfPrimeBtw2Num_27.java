package number_pgm;

import java.util.Scanner;

public class SumOfPrimeBtw2Num_27 {

	public static void main(String[] args) {
		System.out.println("Enter the two numbers");
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		int sum=0;
		for(int num=num1;num<num2;num++)
		{
			int i=2;
			while(num>i)
			{
				
				if(num%i==0)
					break;
				i++;
			}
			if(i==num)
			{
				sum=sum+num;
			}
		}
		System.out.println(sum);

	}

}
