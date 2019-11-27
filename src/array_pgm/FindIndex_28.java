package array_pgm;

import java.util.Scanner;

public class FindIndex_28 {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		System.out.println("Enter elment to find position. "
				+ "Elements are 10,20,30,40,50");
		Scanner s=new Scanner(System.in);
		int ele=s.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==ele)
			{
				System.out.println("Position of element "+ele+" in array is "+i);
			}
		}

	}

}
