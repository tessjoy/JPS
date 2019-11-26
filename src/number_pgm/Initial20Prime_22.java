package number_pgm;

import java.util.Scanner;

public class Initial20Prime_22 {

	public static void main(String[] args) {
		
		//int n[]=new int[20];
		int count=1,num=1;
		while(count<=20)
		{
			int i=2;
			while(num>=i)
			{
				if(num%i==0)
					break;	
				i++;
				
			}
		
			if(i==num)
				{
				System.out.println(count+") "+num);
					count++;
				}
			num++;
		
		}
		

	}

}
