package number_pgm;

import java.util.Scanner;

public class SumofDigits1 {

	public static void main(String[] args) {
		System.out.println("Enter the digit");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		while(num/10!=0)
		{
			int sum=0;
			int x=num%10;
			int y=num/10;
			sum=sum+x+y;
			num=sum;
		}
		System.out.println(num);
	}

}
