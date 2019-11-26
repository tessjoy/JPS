package number_pgm;

import java.util.Scanner;

public class Palinrome_17 {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int n=num;
		int rev=0;
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		if(rev==n)
			System.out.println(n+" is a palindrome number");
		else
			System.out.println(n+" is not a palindrome number");

	}

}
