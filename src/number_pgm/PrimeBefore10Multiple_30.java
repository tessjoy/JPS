package number_pgm;

public class PrimeBefore10Multiple_30 {

	public static void main(String[] args) {
		System.out.println("Prime immediately before multiple of 10");
		for(int num=1;num<200;num++)
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
				if((num+1)%10==0)
				System.out.println(num);
			}
		}
	}

}
