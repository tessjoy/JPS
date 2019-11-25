package string_pgm;

import java.util.Scanner;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(s.replaceAll("\\s",""));
	}

}
