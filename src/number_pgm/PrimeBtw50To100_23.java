package number_pgm;

public class PrimeBtw50To100_23 {

	public static void main(String[] args) {
		System.out.println("Prime between 50 and 100");
		for(int num=50;num<100;num++)
		{
			int i=2;
			while(num>i)
			{
				
				if(num%i==0)
					break;
				i++;
			}
			if(i==num)
			{
				System.out.println(num);
			}
		}
		

	}

}
