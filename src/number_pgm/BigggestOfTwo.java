package number_pgm;

import java.util.Scanner;

public class BigggestOfTwo {

	public static void main(String[] args) {
		System.out.println("Enter two numbers");
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		if(num1>num2)
		{
			System.out.println("Biggest amoung "+num1+" and "+num2+" is "+num1);
		}
		else
		{
			System.out.println("Biggest amoung "+num1+" and "+num2+" is "+num2);
		}

	}

}
