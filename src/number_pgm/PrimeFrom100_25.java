package number_pgm;

public class PrimeFrom100_25 {

	public static void main(String[] args) {
		int count=1,num=100;
		System.out.println("20 prime numbers from 100");
		while(count<=20)
		{
			int i=2;
			while(num>=i)
			{
				if(num%i==0)
					break;	
				i++;
				
			}
		
			if(i==num)
				{
				System.out.println(count+") "+num);
					count++;
				}
			num++;
		
		}
		

	}

}
