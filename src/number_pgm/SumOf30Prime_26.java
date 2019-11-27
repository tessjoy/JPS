package number_pgm;

public class SumOf30Prime_26 {

	public static void main(String[] args) {
		int count=1,num=1,sum=0;
		while(count<=30)
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
				sum=sum+num;
				count++;
				}
			num++;
		}
		System.out.println("Sum of 1st 30 prime numbers is "+sum);
		

	}

}
