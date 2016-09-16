package selenium;

public class stringMethods
{

	public static void main(String[] args) 
	{
		String var1="Selenium";
		String var2="selenium";
		
		if (var1.equalsIgnoreCase(var2)) 
		{
			System.out.println("Both Strings are same");
		}
		else
		{
			System.out.println("Both Strings are not same");
		}

	}

}
