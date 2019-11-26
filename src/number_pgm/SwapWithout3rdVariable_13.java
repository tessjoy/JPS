package number_pgm;

public class SwapWithout3rdVariable_13 {

	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("values "+a+","+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swapped values "+a+","+b);
	}

}
