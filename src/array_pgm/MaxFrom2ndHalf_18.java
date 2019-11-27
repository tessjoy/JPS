package array_pgm;

public class MaxFrom2ndHalf_18 {

	public static void main(String[] args) {
		int a[]= {10,2,7,5,6,3};
		int max=a[a.length/2];
		for(int i=a.length/2;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Maximum from 2nd half of array is "+max);

	}

}
