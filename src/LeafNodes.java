

public class LeafNodes {

	public static class Node{
		
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
		}	
	}
	public static void main(String[] args) {
		
		Node root = createBinaryTree();
		System.out.println("total no of the leafs in the tree is "+countLeafs(root)+" \n\nnodes are :");
		printLeafs(root);
		
	}
	
	public static void printLeafs(Node root){
		
		if(root==null)
			return ;
		
		if(root.left==null&& root.right==null)
			System.out.println(root.data);
		
		if(root.left!=null)
			printLeafs(root.left);
	
		if(root.right!=null)
			printLeafs(root.right);
		
		}
	
	
	public static int countLeafs(Node root){
		
		
		if(root==null)
			return 0;
		
		if(root.left==null&& root.right==null)
			return 1;
		else 
			return countLeafs(root.left)+countLeafs(root.right);
		
		}
	
	public static Node createBinaryTree(){
		
		Node rootNode = new Node(40);
		
		Node node30   = new Node(30);
		
		Node node20 = new Node(20); 
		
		Node node10   = new Node(10);
		
		Node node50 = new Node(50); 
		
		Node node60   = new Node(60);
			
		Node node70 = new Node(70); 
		
			
		rootNode.left = node20;
		
		rootNode.right = node60;
		
		node60.left = node50;
		
		node60.right = node70;
		
		node20.left = node10;
		
		node20.right = node30;

		return rootNode;
	}
}
