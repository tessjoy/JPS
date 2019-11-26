package string_pgm;

public class SwapSringWithoutUsingTempVar_22 {

	public static void main(String[] args) {
		String s1="hello";
		String s2="World";
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println("Swapped strings are '"+s1+" "+s2+"'");

	}

}
