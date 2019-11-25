package string_pgm;

import java.util.Scanner;

public class WordsInString {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s.trim();
		String s1[]=s.split(" ");
		System.out.println("Word count in string is "+s1.length);

	}

}
