package array_pgm;

import java.util.Scanner;

public class SwapTwoIndexElements_29 {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		System.out.println("Present array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("choose the indexes amoung 0,1,2,3,4 which you want to swap");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st index");
		int i1=s.nextInt();
		System.out.println("Enter 2nd index");
		int i2=s.nextInt();
		char temp=(char) a[i1];
		a[i1]=a[i2];
		a[i2]=temp;
		System.out.println("Array after swap");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
