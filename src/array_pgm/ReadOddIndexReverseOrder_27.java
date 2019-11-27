package array_pgm;

public class ReadOddIndexReverseOrder_27 {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		System.out.println("Odd index reverse order");
		for(int i=a.length-1;i>=0;i--)
		{
			if(i%2!=0)
			{
				System.out.println(a[i]);
			}
		}

	}

}
