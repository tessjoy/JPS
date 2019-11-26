package number_pgm;

import java.util.Scanner;

public class Factorial_20 {

	public static void main(String[] args) {
		System.out.println("Enter te num");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int prod=1;
		while(num>0)
		{
			prod=prod*num--;
		}
		System.out.println("Factorial ="+prod);
	}

}
