package array_pgm;

public class RightShift_36 {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		System.out.println("Right shift");
		int i;
		int temp=a[0];
		for(i=0;i<a.length-1;i++)
			a[i]=a[i+1];
			a[i]=temp;
		
		for(i=0;i<=a.length-1;i++)
			System.out.print(a[i]+" ");
		

	}

}
