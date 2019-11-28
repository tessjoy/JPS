package number_pgm;

public class PrimeFromFibinocci_39 {

	public static void main(String[] args) {
		System.out.println("Prime numbers from fibinocci series");
		int a=0,b=1,c=a+b;
		for(int i=2;c<=5000;i++)
		{
			int count=0;
			a=b;
			b=c;
			c=a+b;
			for(int j=1;j<=c;j++)
			{
				if(c%j==0)
					count++;
			}
			if(count==2)
				System.out.println(c+" ");
		}

	}

}
