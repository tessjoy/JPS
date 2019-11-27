package array_pgm;

public class FindMax_03 {

	public static void main(String[] args) {
		int a[]= {10,2,7,5,6,3};
		int max=a[0];
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Maximum of array is "+max);
	}

}
