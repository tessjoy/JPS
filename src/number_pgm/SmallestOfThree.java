package number_pgm;

import java.util.Scanner;

public class SmallestOfThree {

	public static void main(String[] args) {
		System.out.println("Enter three numbers");
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		int num3=s.nextInt();
		
		if(num1<num2&&num1<num3)
		{
			System.out.println("Smallest amoung "+num1+" "+num2+ " and "+num3+" are "+num1);
		}
		else if(num2<num3)
		{
			System.out.println("Smallest amoung "+num1+" "+num2+ " and "+num3+" are "+num2);
		}
		else
		{
			System.out.println("Smallest amoung "+num1+" "+num2+ " and "+num3+" are "+num3);
		}

	}

}
