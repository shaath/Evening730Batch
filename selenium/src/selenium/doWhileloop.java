package selenium;

public class doWhileloop {

	public static void main(String[] args)
	{
		int i=1;
		do 
		{
			System.out.println(i);
			if (i==30)
			{
				break;
			}
			i++;
		}
		while (i<=100);

	}

}
