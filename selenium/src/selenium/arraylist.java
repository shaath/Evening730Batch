package selenium;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) 
	{
		ArrayList<Object> q=new ArrayList<Object>();
		
		//writing the data into array
		
		q.add("Selenium");
		q.add("Sumitha");
		q.add("Sharath");
		q.add(3, "Sumitha");
		//finding he length of the arraylist
		
		System.out.println(q.size());
		
		for (int i = 0; i < q.size(); i++)
		{
			System.out.println(q.get(i));
			
			
		}

	}

}
