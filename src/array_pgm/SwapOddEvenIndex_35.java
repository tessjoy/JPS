package array_pgm;

public class SwapOddEvenIndex_35 {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int i,j;
		System.out.println("Swapping odd indexed elements "
				+ "with immediate even indexed");
		for(i=1;i<=a.length-2;i=i+2)
		{
			if(i%2!=0)
			{
				j=i+1;
				int temp;
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		for(int k=0;k<a.length;k++)
			System.out.print(a[k]+ " ");

	}

}
