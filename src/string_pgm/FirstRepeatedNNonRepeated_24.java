package string_pgm;

import java.util.HashSet;


public class FirstRepeatedNNonRepeated_24 {
	public static char firstRepeat(char ch[])
	{
		HashSet <Character> h=new HashSet();
		for(int i=0;i<=ch.length-1;i++)
		{
			char c=ch[i];
			if(h.contains(c))
				return c;
			else
				h.add(c);
		}
		return 0;
	}
	public static char firstNonRepeat(char ch[])
	{
		HashSet <Character> h=new HashSet();
		for(int i=0;i<=ch.length-1;i++)
		{
			char c=ch[i];
			if(!h.contains(c))
				return c;
			else
				h.add(c);
			
		}
		return 0;
	}
	public static void main(String[] args) {
		String s="hello";
		char ch[]=s.toCharArray();
		System.out.println("First repeated character "+firstRepeat(ch));
		System.out.println("First non repeated character "+firstNonRepeat(ch));
		
		
	}

}
