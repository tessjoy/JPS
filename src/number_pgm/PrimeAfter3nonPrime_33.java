package number_pgm;

public class PrimeAfter3nonPrime_33 {

	public static void main(String[] args) {
		System.out.println("Prime immediately after 3 non prime");
		for(int i=5;i<10;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
				if(i%j==0)
					count++;
				if(count!=2)
				{
					System.out.println(i);
				}

		}

	}

}
