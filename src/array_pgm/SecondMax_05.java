package array_pgm;

public class SecondMax_05 {

	public static void main(String[] args) {
		int a[]= {10,2,7,5,6,3};
		int max=a[0],secMax=a[0];
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]<max)
			{	
				secMax=max;
				max=a[i];
				
			}
			else if (secMax==a[0])
			{
				secMax=a[i];
			}
		}
		System.out.println("Second Maximum of array is "+secMax);

	}

}
