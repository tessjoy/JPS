package number_pgm;

import java.util.Scanner;

public class TotalDigitsOfNum_14 {

	public static void main(String[] args) {
		System.out.println("Enter the digit");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("total number of digits = "+count);
	}

}
