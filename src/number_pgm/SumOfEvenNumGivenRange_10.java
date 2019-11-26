package number_pgm;

import java.util.Scanner;

public class SumOfEvenNumGivenRange_10 {

	public static void main(String[] args) {
		System.out.println("Enter the range");
		Scanner s=new Scanner(System.in);
		int lb=s.nextInt();
		int ub=s.nextInt();
		int sum=0;
		for(int i=lb;i<=ub;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;	
			}	
		}
		System.out.print("Sum of even numbers between "+lb+" and "+ub+" is "+sum);

	}

}
