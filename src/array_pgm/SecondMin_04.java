package array_pgm;

public class SecondMin_04 {

	public static void main(String[] args) {
		int a[]= {10,2,7,5,6,3};
		int min=a[0],secMin=a[0];
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>min)
			{	
				secMin=min;
				min=a[i];
				
			}
			else if (secMin==a[0])
			{
				secMin=a[i];
			}
		}
		System.out.println("Second Minimum of array is "+secMin);

	}

}
