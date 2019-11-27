package array_pgm;

public class SecondHalfSum_14 {

	public static void main(String[] args) {
		int a[]= {10,20,30,40};
		int sum=0;
		for(int i=a.length/2;i<=a.length-1;i++)
		{
				sum=sum+a[i];
				
		}
		System.out.println("2nd half sum = "+sum);

	}

}
