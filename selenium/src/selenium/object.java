package selenium;

public class object {

	public static void main(String[] args) 
	{
		Object e=3333;
		Object[] s={"Selenium",3333,33.3333,'M',false};
		
		for (int i = 0; i < s.length; i++) 
		{
			System.out.println(s[i]);
			Object w=s[i];
			if (w==e)
			{
				System.out.println("expected value avaialble in array");
				break;
			}
		}
	}

}
