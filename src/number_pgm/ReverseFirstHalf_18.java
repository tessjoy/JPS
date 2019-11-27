package number_pgm;

import java.util.Scanner;

public class ReverseFirstHalf_18 {

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
		System.out.println(count);
		int a[]=new int[count];
		int i=0;

			while(n>0) {
			a[i++]=n%10;
			n=n/10;
			}

		for(int j=a.length/2;j<=a.length-1;j++)
		{
			System.out.print(a[j]);
		}


	}

}
