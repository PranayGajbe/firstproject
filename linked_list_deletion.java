# firstproject
import java.util.*;

class deletion
{
	public static void main(String args[])
	{
		LinkedList<String> l1 = new LinkedList();

		l1.add("one");
		l1.add("two");
		l1.add("three");
		l1.add("Four");
		l1.add("Five");

		for(int i = 0; i < l1.size(); i++)
		{
			String x = l1.get(i);
			System.out.println( x + " ");
		}

		System.out.println();



		l1.remove("three");
		l1.remove(1);
		
		System.out.println();



		l1.remove();

		for(int i = 0; i < l1.size(); i++)
		{
			String x = l1.get(i);
			System.out.println( x + " ");
		}

	}
}
		
