package number_pgm;

import java.util.Scanner;

public class PrefectNumBtwRange_45 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the starting limit");
		int start=s.nextInt();
		System.out.println("Enter the ending limit");
		int end=s.nextInt();
		System.out.println("Perfect number between "+start+" and "+end+" are");
		for(int i=start;i<=end;i++)
		{
			int sum=0;
			{
				for(int j=1;j<i;j++)
				{
					if(i%j==0)
						sum=sum+j;
				}
				if(sum==i)
					System.out.print(i+" ");
			}
		}
		

	}

}
