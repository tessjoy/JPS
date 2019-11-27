package number_pgm;

import java.util.Scanner;

public class First3Amstrong_41 {

	public static void main(String[] args) {
				System.out.println("First 3 Amstrong number after 10");
				int count1=1;
				for(int num=10;count1<=3;num++)
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
					count1++;
				}
				}
				

			}

}





