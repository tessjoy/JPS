package number_pgm;

import java.util.Scanner;

public class ReverseFirstHalf {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int count =0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);
		int i=0;
		while(i<=count/2)
		{
			num=num/10;
			i++;
		}
		System.out.println(num);
		int rev=0;
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}

	}

}
