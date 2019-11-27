package number_pgm;

public class PrimeAfter3nonPrime_33 {

	public static void main(String[] args) {
		System.out.println("Prime immediately after 3 non prime");
		for(int i=1;i<10;i++)
		{
			int count=0;
			int j=2;
			while(i>j)
			{
				
				if(i%j==0)
				{
					count++;
					
				}
				j++;
			}
				if(count!=2&&i==j)
				{
					System.out.println(i);
				}

		}

	}

}
