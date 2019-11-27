package number_pgm;

public class FibinocciFrom100_36 {

	public static void main(String[] args) {
		int a=0,b=1,c=0;
		System.out.println("Fibinocci Series from 100 to 10000");
		while(c<10000)
		{
			c=a+b;
			if(c>100)
			System.out.print(c+",");
			a=b;
			b=c;
			c++;

		}

	}

}
