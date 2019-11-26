package number_pgm;

import java.util.Scanner;

public class OddNumbtwRange_09 {

	public static void main(String[] args) {
		System.out.println("Enter the range");
		Scanner s=new Scanner(System.in);
		int lb=s.nextInt();
		int ub=s.nextInt();
		for(int i=lb;i<=ub;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+",");	
			}
			
		}
	}

}
