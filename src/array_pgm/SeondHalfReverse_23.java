package array_pgm;

public class SeondHalfReverse_23 {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60};
		System.out.println("2nd half reverse order ");
		for(int i=a.length-1;i>=a.length/2;i--)
		{
			System.out.println(a[i]);
		}

	}

}
