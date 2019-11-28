package number_pgm;

import java.util.Scanner;

public class Reverse2ndHalfOfNum_47 {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int n=num;
		int count =0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		int a[]=new int[count];
		int i=0;

			while(n>0) {
			a[i++]=n%10;
			n=n/10;
			}
		System.out.println("reverse of 2d half");
		for(int j=0;j<a.length/2;j++)
		{
			System.out.print(a[j]);
		}

	}

}
