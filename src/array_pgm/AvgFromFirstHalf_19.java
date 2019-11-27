package array_pgm;

public class AvgFromFirstHalf_19 {

	public static void main(String[] args) {
		int a[]= {10,20,30,40};
		int sum=0,count=0;
		for(int i=0;i<a.length/2;i++)
		{
			sum=sum+a[i];
			count++;
		}
		System.out.println("Avg of 1st half = "+sum/count);

	}

}
