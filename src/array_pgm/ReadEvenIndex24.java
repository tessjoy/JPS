package array_pgm;

public class ReadEvenIndex24 {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		System.out.println("Even index values");
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				System.out.println(a[i]);
			}
		}
		

	}

}
