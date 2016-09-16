package selenium;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class seteg {

	public static void main(String[] args)
	{
		Set<String> s=new HashSet<String>();
		
		s.add("Selenium");
		s.add("Sumitha");
		s.add("Sharath");
		s.add("Sumitha");
		s.add("Selenium");
		s.add("Apple");

		Iterator<String> it=s.iterator();
		
		while (it.hasNext())
		{
			String data = it.next();
			System.out.println(data);
		}
		
	}

}
