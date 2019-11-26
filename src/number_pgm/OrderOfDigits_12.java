package number_pgm;

import java.util.Scanner;

public class OrderOfDigits_12 {

	public static void main(String[] args) {
		System.out.println("Enter the num");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		boolean flag=false;
		int lastdigit=num%10;
		num=num/10;
		while(num>0)
		{
			if(lastdigit<=num%10)
			{
				flag=true;
				break;
				
			}
			lastdigit=num%10;
			num=num/10;
		}
		if(flag)
			System.out.println("Digits are not in increasing order");
		else
			System.out.println("Digits are  in increasing order");
		

	}

}
