package array_pgm;

public class AvgFromEvenIndex_11 {

	public static void main(String[] args) {
		int a[]= {10,20,30,40};
		int sum=0,count=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(i%2==0)
			{
				sum=sum+a[i];
				count++;
			}
		}
		System.out.println("Avg of even index values = "+sum/count);

	}

}
