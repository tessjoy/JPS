package array_pgm;

public class AvgOfSecondHalf_20 {

	public static void main(String[] args) {
		int a[]= {10,20,30,40};
		int sum=0,count=0;
		for(int i=a.length/2;i<a.length;i++)
		{
			sum=sum+a[i];
			count++;
		}
		System.out.println("Avg of 2nd half = "+sum/count);

	}

}
