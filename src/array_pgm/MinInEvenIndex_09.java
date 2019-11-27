package array_pgm;

public class MinInEvenIndex_09 {

	public static void main(String[] args) {
		int a[]= {10,2,7,5,6,3};
		int min=a[0];
		for(int i=0;i<a.length-1;i++)
		{
			if(i%2==0)
			{
				if(a[i]<min)
				{
					min=a[i];
				}
			}
		}
		System.out.println("Minimum value amoung even index is "+min);

	}

}
