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


class BinaryTree
{
	Node root;
	BinaryTree()
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
		System.out.print(node.key);
		printInorder(node.right);
	}
	
	void printInorder()
	{
		printInorder(root);
	}

	public static void main(String args[])
	{
		BinaryTree tree = new BinaryTree();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
	
		tree.printInorder();
	}
}












