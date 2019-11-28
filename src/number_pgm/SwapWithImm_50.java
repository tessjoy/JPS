package number_pgm;

import java.util.Scanner;

public class SwapWithImm_50 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the digit");
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
			int j;
		System.out.println("Swap with immediate digit");
		for(int k=a.length-1;k>=0;k--)
		{
			if(k%2==0)
			{
				j=k+1;
				int temp=a[k];
				a[k]=a[j];
				a[j]=temp;
				
			}
		}
		for(int k=a.length-1;k>=0;k--)
			System.out.print(a[k]);
	}

}
