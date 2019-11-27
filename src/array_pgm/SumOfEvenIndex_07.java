package array_pgm;

public class SumOfEvenIndex_07 {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				sum=sum+a[i];
			}
		}
		System.out.println("Sum of even positions = "+sum);
	}

}
