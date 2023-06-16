# firstproject
import java.util.*;

public class searching
{
	public static void main(String args[])
	{
		LinkedList<String> l1 = new LinkedList<>();

		int i;

		l1.add("10");
		l1.add("20");
		l1.add("30");
		l1.add("40");

		System.out.println(l1 + " ");

		String item = "80";

		for(i = 0; i < l1.size(); i++)
		{
			String x = l1.get(i);

			if (x == item)
			{
				System.out.println("Element found at " + i);
				break;
			}

			
		}
			if (i >= l1.size())
			{
				System.out.println("Element not found");
			}
		
	}
}
		
