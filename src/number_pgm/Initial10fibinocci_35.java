package number_pgm;

public class Initial10fibinocci_35 {

	public static void main(String[] args) {
		int a=0,b=1,c;
		System.out.println("Initial 10 Fibinocci Series ");
		System.out.print(a+",");
		System.out.print(b+",");
		c=a+b;
		for(int i=3;i<10;i++)
		{
			c=a+b;
			System.out.print(c+",");
			a=b;
			b=c;

		}

	}

}
