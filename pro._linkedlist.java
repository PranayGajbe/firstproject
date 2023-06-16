# firstproject
import java.util.*;

class Student
{
	int roll_no;
	String name;
	String branch;
	String address;

	Student(int roll_no , String name , String branch , String address)
	{
		this.roll_no = roll_no;
		this.name = name;
		this.branch = branch;
		this.address = address;
	}


	void printData()
	{
		System.out.println("Name:    " + name);
		System.out.println("Roll no: " + roll_no);
		System.out.println("Branch:  " + branch);
		System.out.println("Address: " + address);
	}
	
}

class pro
{
	public static void main(String args[])
	{

		LinkedList<Student> l1 = new LinkedList<Student>();

		Student s1 = new Student(2 , "ABC" , "Mech" , "ABCD");
		Student s2 = new Student(3 , "DEF" , "Civil" , "HIJH");
		Student s3 = new Student(4 , "GHI" , "EXTC" , "WXYZ");

		
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);

		s1.printData();
		System.out.println();
		s2.printData();
		System.out.println();
		s3.printData();

               
	}
}
