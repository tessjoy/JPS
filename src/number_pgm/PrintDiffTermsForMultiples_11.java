package number_pgm;

public class PrintDiffTermsForMultiples_11 {

	public static void main(String[] args) {
		for(int i=0;i<=100;i++)
		{
			if(i%4==0&&i%5==0)
			{
				System.out.println(i+" LARA");
			}
			else if(i%5==0)
			{
				System.out.println(i+" J2EE");
			}
			else if(i%4==0)
			{
				System.out.println(i+" JAVA");
			}
		}

	}

}
