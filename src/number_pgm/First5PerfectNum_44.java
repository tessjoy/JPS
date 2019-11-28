package number_pgm;

public class First5PerfectNum_44 {

	public static void main(String[] args) {
		int i,sum=0,count=0;
		System.out.println("First 5 perfect numbers");
		for(int j=2;count<=5;j++)
		{
			sum=1;
			for(i=2;i<j;i++)
			{
				if(j%i==0)
					sum=sum+i;
			}
		
		if(j==sum)
			System.out.println(j+" ");
		count++;
		}
	}

}
