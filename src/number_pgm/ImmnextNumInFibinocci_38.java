package number_pgm;

import java.util.Scanner;

public class ImmnextNumInFibinocci_38 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a fibinocci series number to "
				+ "get the immediate next one ");
		int num=s.nextInt();
		int a[]=new int[num+2];
		int i;
		a[0]=0;a[1]=1;
		for(i=2;i<=a.length-1;i++)
		{
			a[i]=a[i-1]+a[i-2];
		}
		System.out.println();
		for(int j=0;j<=a.length-1;j++)
		{ if(a[j]==num)
			System.out.print("Immediate next fibinocci number of "+num+" is "+a[j+1]);
		}

		

	}

}
