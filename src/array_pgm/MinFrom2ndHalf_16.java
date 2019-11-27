package array_pgm;

public class MinFrom2ndHalf_16 {

	public static void main(String[] args) {
		int a[]= {10,2,7,5,6,3};
		int min=a[0];
		for(int i=a.length/2;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Minimum from 2nd half of array is "+min);

	}

}
