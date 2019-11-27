package array_pgm;

public class Reverse2ndHalf_32 {

	public static void main(String[] args) {
		int a[]= {10,20,30,40};
		System.out.println("Reverse 2nd half ");
		for(int i=a.length-1;i>=a.length/2;i--)
		{
			System.out.println(a[i]);
		}

	}

}
