# firstproject
import java.util.*;

class Traverse
{
	public static void main(String args[])
	{
		LinkedList<String> l1 = new LinkedList();

		l1.add("one");
		l1.add("two");
		l1.add("three");

		for(int i = 0; i < l1.size(); i++)
		{
			String x = l1.get(i);
			System.out.println( x + " ");
		}
	}
}
		
