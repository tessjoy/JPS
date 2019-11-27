package array_pgm;

public class MinFrom1stHalf_15 {

	public static void main(String[] args) {
		int a[]= {10,2,7,5,6,3};
		int min=a[0];
		for(int i=0;i<a.length/2;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Minimum from 1st half of array is "+min);

	}

}
