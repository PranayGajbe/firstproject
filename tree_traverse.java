# firstproject
class Node
{
	int key;
	Node left;
	Node right;
	
	public Node(int item)
	{
		key = item;
		left = null;
		right = null;
	}
}


class searching
{
	int x = 2;
	Node root;
	searching()
	{
		root = null;
	}
	void printInorder(Node node)
	{
		if (node == null)
		{
			return;
		}

		printInorder(node.left);

		System.out.print(node.key + " ");

		if(node.key == x)
		{
			System.out.println("Element found");

			while(true)
			{
				break;	
			}
		}

		printInorder(node.right);

		
	}
	
	void printInorder()
	{
		printInorder(root);
	}

	public static void main(String args[])
	{
		searching tree = new searching();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
	
		tree.printInorder();

		// tree.root = null;

		
	}
}












