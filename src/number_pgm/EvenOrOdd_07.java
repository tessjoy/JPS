package number_pgm;

import java.util.Scanner;

public class EvenOrOdd_07 {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		
		if(num%2==0)
			System.out.println("It's an even number");
		else
			System.out.println("It's an odd number");

	}

}
