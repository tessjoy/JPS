package array_pgm;

public class FirstHalfSum_13 {

	public static void main(String[] args) {
		int a[]= {10,20,30,40};
		int sum=0;
		for(int i=0;i<a.length/2;i++)
		{
				sum=sum+a[i];
				
		}
		System.out.println("First half sum = "+sum);
	}

}
