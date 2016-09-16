package selenium;

public class switchcase 
{

	public static void main(String[] args) 
	{
		String course="manual";
		
		switch (course) 
		{
		case "Selenium":
			System.out.println("You are selected Selenium");
			break;
		case "Manual":	
			System.out.println("You are Selected Manual");
			break;
		case "Uft":
			System.out.println("You are selected Uft");
			break;
		default:
			System.out.println("Select a proper course");
			break;
		}

	}

}
