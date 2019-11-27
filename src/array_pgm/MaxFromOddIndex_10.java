package array_pgm;

public class MaxFromOddIndex_10 {

	public static void main(String[] args) {
		int a[]= {10,2,7,5,6,3};
		int max=a[1];
		for(int i=0;i<a.length-1;i++)
		{
			if(i%2!=0)
			{
				if(a[i]>max)
				{
					max=a[i];
				}
			}
		}
		System.out.println("Maximum value amoung odd index is "+max);

	}

}
