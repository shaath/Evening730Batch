package selenium;

public class twodimArray {

	public static void main(String[] args)
	{
		Object[][] s=new Object[2][3];
		
		//finding the rows length
		System.out.println(s.length);
		
		//finding the length of the columns
		
		System.out.println(s[0].length);
		
		
		//writing the data into array
		
		s[0][2]="Selenium";
		s[1][1]="Sumitha";
		
		//reading the values from an array
		
		for (int i = 0; i < s.length; i++) 
		{
			for (int j = 0; j < s[i].length; j++) 
			{
				System.out.println(s[i][j]);
				
			}
		}

	}

}
