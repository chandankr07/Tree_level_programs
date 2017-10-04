// Java program to demonstrate delete operation in binary search tree
class BinarySearchTree
{
	/* Class containing left and right child of current node and value value*/
	class Node
	{
		int value;
		Node left, right;

		public Node(int item)
		{
			value = item;
			left = right = null;
		}
	}

	// Root of BST
	Node root;

	// Constructor
	BinarySearchTree()
	{
		root = null;
	}
	
	public boolean find(int id){
		Node current = root;
	
		while(current!=null){
			if(current.value==id){
				return true;
			}else if(current.value>id){
				current = current.left;
			}else{
				current = current.right;
			}
		}
		return false;
	}
	
	

	// This method mainly calls deleteRec()
	void deleteKey(int value)
	{
		root = deleteRec(root, value);
	}

	/* A recursive function to insert a new value in BST */
	Node deleteRec(Node root, int value)
	{
		/* Base Case: If the tree is empty */
		if (root == null) return root;

		/* Otherwise, recur down the tree */
		if (value < root.value)
			root.left = deleteRec(root.left, value);
		else if (value > root.value)
			root.right = deleteRec(root.right, value);

		// if value is same as root's value, then This is the node
		// to be deleted
		else
		{
			// node with only one child or no child
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;

			// node with two children: Get the inorder successor (smallest
			// in the right subtree)
			root.value = minValue(root.right);

			// Delete the inorder successor
			root.right = deleteRec(root.right, root.value);
		}

		return root;
	}

	int minValue(Node root)
	{
		int min = root.value;
		while (root.left != null)
		{
			min = root.left.value;
			root = root.left;
		}
		return min;
	}

	// This method mainly calls insertRec()
	void insert(int value)
	{
		root = insertRec(root, value);
	}

	/* A recursive function to insert a new value in BST */
	Node insertRec(Node root, int value)
	{

		/* If the tree is empty, return a new node */
		if (root == null)
		{
			root = new Node(value);
			return root;
		}

		/* Otherwise, recur down the tree */
		if (value < root.value)
			root.left = insertRec(root.left, value);
		else if (value > root.value)
			root.right = insertRec(root.right, value);

		/* return the (unchanged) node pointer */
		return root;
	}

	// This method mainly calls InorderRec()
	void inorder()
	{
		inorderRec(root);
	}

	// A utility function to do inorder traversal of BST
	void inorderRec(Node root)
	{
		if (root != null)
		{
			inorderRec(root.left);
			System.out.print(root.value + " ");
			inorderRec(root.right);
		}
	}

	/** * Java function to return number of nodes in this binary search tree. 
	 * * Time complexity of this method is O(n) * @return size of this binary search tree 
	 * */ 
	public int size() { 
		 Node current = root; 
		 int size = 0; 
		 java.util.Stack<Node> stack = new java.util.Stack<Node>(); 
		 
		 while (!stack.isEmpty() || current != null) { 
			 if (current != null) { 
				 stack.push(current); 
				 current = current.left;
				 } 
			 else { 
				 size++; 
				 current = stack.pop(); 
				 current = current.right; 
				 } 
			 } 
		 return size; 
		 }
	 
	 
	// Driver Program to test above functions
	public static void main(String[] args)
	{
		BinarySearchTree tree = new BinarySearchTree();

		/* Let us create following BST
			50
		/	 \
		30	 70
		/ \ / \
		20 40 60 80 */
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		System.out.println("Inorder traversal of the given tree");
		tree.inorder();

		System.out.println("\nDelete 20");
		tree.deleteKey(20);
		System.out.println("Inorder traversal of the modified tree");
		tree.inorder();

		System.out.println("\nDelete 30");
		tree.deleteKey(30);
		System.out.println("Inorder traversal of the modified tree");
		tree.inorder();

		System.out.println("\nDelete 50");
		tree.deleteKey(50);
		System.out.println("Inorder traversal of the modified tree");
		tree.inorder();
		
		System.out.println("\nCheck whether Node with value 90 exists : " + tree.find(90));
		
		System.out.println("\nSize of the tree is  " + tree.size());
		
		
		
	}
}
