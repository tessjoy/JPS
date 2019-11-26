package number_pgm;

import java.util.Scanner;

public class ReverseNum_16 {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int rev=0;
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("Reverse"+rev);
	}

}
