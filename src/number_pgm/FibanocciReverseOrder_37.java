package number_pgm;

public class FibanocciReverseOrder_37 {

	public static void main(String[] args) {
		int a=0,b=1,c=a+b,count=2;
		
		System.out.println("Reverse Fibinocci Series from 500 to 5000");
		for(int i=2;c<5000;i++)
		{
			count++;
			a=b;
			b=c;
			c=a+b;
		}
		int arr[]=new int[count];
		arr[0]=0;
		arr[1]=1;

		
		for(int j=2;j<5000;j++)
		{
			arr[j]=c;
			a=b;
			b=c;
			c=a+b;
		}
		for(int i=arr.length-1;i>500;i--)
		{
			System.out.println(arr[i]);
		}

	}

}
