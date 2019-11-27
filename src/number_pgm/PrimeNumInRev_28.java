package number_pgm;

import java.util.Scanner;

public class PrimeNumInRev_28 {

	public static void main(String[] args) {
		System.out.println("Prime in reverse order from 70 to 20");
		for(int num=70;num>20;num--)
		{
			int i=2;
			while(num>i)
			{
				
				if(num%i==0)
					break;
				i++;
			}
			if(i==num)
			{
				System.out.println(num);
			}
		}

	}

}
