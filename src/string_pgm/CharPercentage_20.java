package string_pgm;

public class CharPercentage_20 {

	public static void main(String[] args) {
		String s="My place is Bangalore 111";
		int totalChar=s.length();
		int upperCase=0;
		int lowerCase=0;
		int digits=0;
		int others=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isUpperCase(c))
			{
				upperCase++;
			}
			else if(Character.isLowerCase(c))
			{
				lowerCase++;
			}
			else if(Character.isDigit(c))
			{
				digits++;
			}
			else
			{
				others++;
			}
		}
		System.out.println("uppercase letters are "+((upperCase*100)/totalChar)+"%");
		System.out.println("lowercase letters are "+((lowerCase*100)/totalChar)+"%");
		System.out.println("digits are "+((digits*100)/totalChar)+"%");
		System.out.println("others are "+((others*100)/totalChar)+"%");
	}

}
