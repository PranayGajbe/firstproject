# firstproject
import java.util.*;

public class que
{
	public static void main(String args[])
	{
		Queue<String> q = new LinkedList<>();

		q.add("10");						// Insertion
		q.add("20");
		q.add("30");
		q.add("40");

		System.out.println();
		System.out.println(q);

		String a = q.peek();                             // Traversing

		System.out.println("peek = " + a);

		q.remove();							// Deletion
		q.remove();

		System.out.println("After deletion = " + q);
	}
}
