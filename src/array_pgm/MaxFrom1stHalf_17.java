package array_pgm;

public class MaxFrom1stHalf_17 {

	public static void main(String[] args) {
		int a[]= {10,2,7,5,6,3};
		int max=a[0];
		for(int i=0;i<a.length/2;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Maximum from 1st half of array is "+max);

	}

}
