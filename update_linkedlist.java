# firstproject
import java.util.*;

class update
{
	public static void main(String args[])
	{
		LinkedList<String> l1 = new LinkedList();

		l1.add("one");
		l1.add("two");
		l1.add("three");
		

		System.out.println("Before update");

		for(int i = 0; i < l1.size(); i++)
		{
			String x = l1.get(i);
			System.out.println( x + " ");
		}

		System.out.println();

		l1.set(1 , "Five");
		l1.set(2 , "Six");

		System.out.println("After update");

		for(int i = 0; i < l1.size(); i++)
		{
			String x = l1.get(i);
			System.out.println( x + " ");
		}

	}
}
		
