package number_pgm;

public class ImmnextNumInFibinocci_38 {

	public static void main(String[] args) {
		int a=0,b=1,c=0;
		System.out.println("Immediate next number in Fibinocci Series ");
		while(c<5000)
		{
			c=a+b;
			System.out.print(c+1+",");
			a=b;
			b=c;
			c++;

		}

	}

}
