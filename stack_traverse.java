# firstproject
import java.util.*;

class traverse
{
	public static void main(String args[])
	{
		Stack<String> s1 = new Stack<>();

		s1.push("10");
		s1.push("20");
		s1.push("30");
		s1.push("40");

		System.out.println();
		System.out.println(s1);

		
                s1.pop(40);

		String x;
		x = s1.peek();


		System.out.println(x);
	}
}
