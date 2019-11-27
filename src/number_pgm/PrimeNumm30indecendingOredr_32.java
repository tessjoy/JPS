package number_pgm;

public class PrimeNumm30indecendingOredr_32 {

	public static void main(String[] args) {
		int n=0;
		System.out.println("30 prime numbers which are having "
				+ "digits in raising order after 10");
		for(int i=10;n<30;i++)
		{
			int count1=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count1++;
				}
			}
			if(count1==2)
			{
				int a=i%10;
				int b=(i/10)%10;
				int c=i/100;
			
				if(b>a&&c>b)
				{
					System.out.println(i);
					n++;
				}
			}

	}

}
}
