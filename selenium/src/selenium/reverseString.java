package selenium;

public class reverseString {

	public static void main(String[] args)
	{
		//Sumitha--------->ahtimuS
		String reverse="";
		String Original="madam";
		int len=Original.length();
		for (int i = len-1; i >= 0; i--)
		{
//			char rev=Original.charAt(i);
			reverse=reverse+Original.charAt(i);
			
		}

		if (Original.equals(reverse)) 
		{
			System.out.println("Its A Polindrome String");
			
		}
		else
		{
			System.out.println("Its not a polindrome");
		}
	}

}
