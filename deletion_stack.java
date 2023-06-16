# firstproject
import java.util.*;

class delete
{
	public static void main(String args[])
	{
		Stack<String> s1 = new Stack<>();

		//Insertion

		s1.push("10");
		s1.push("20");
		s1.push("30");
		s1.push("40");

		System.out.println();
		System.out.println(s1);



		//Traverseing

		String x;
		x = s1.peek();
		System.out.println("Top Element " + x);



		//Deletion

		s1.pop();
		s1.pop();

		System.out.println();
		System.out.println(s1);		

		x = s1.peek();
		System.out.println("Top Element "+ x);
	}
}
