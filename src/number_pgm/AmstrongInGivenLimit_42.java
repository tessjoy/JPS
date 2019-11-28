package number_pgm;

import java.util.Scanner;

public class AmstrongInGivenLimit_42 {

	public static void main(String[] args) {
		//Give limit as 100 and 400 we will get 153,370,371
				System.out.println("Enter the lower limit");
				Scanner s=new Scanner(System.in);
				int lb=s.nextInt();
				System.out.println("Enter the upper limit");
				int ub=s.nextInt();
				for(int num=lb;num<=ub;num++)
					{
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
							System.out.println(num);
						}
				
				}

	}

}
