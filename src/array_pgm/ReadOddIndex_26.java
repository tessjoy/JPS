package array_pgm;

public class ReadOddIndex_26 {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		System.out.println("Odd index values");
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)
			{
				System.out.println(a[i]);
			}
		}

	}

}
