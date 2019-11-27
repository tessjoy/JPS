package number_pgm;

public class Fibinocciseries100_34 {

	public static void main(String[] args) {
		int i=0,a=0,b=1,c;
		System.out.println("Fibinocci Series till 100");
		System.out.print(a+",");
		System.out.print(b+",");
		c=a+b;
		while(c<=100)
		{
			c=a+b;
			System.out.print(c+",");
			a=b;
			b=c;
			c++;
		}
	}

}
