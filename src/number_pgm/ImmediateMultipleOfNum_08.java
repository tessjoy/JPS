package number_pgm;

import java.util.Scanner;

public class ImmediateMultipleOfNum_08 {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		for(int i=2;i<=6;i++)
		{
			System.out.println(i*num);
		}
		
	}

}
