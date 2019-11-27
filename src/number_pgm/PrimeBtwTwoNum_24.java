package number_pgm;

import java.util.Scanner;
public class PrimeBtwTwoNum_24 {

	public static void main(String[] args) {
		System.out.println("Enter the two numbers");
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		System.out.println("Prime number between"+num1+" and "+num2);
		for(int num=num1;num<num2;num++)
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
