
public class DepthorHeigthOfTree {


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
		System.out.println(findDepth(root));
		
	}	
	
	private static int findDepth(Node root) {
		// TODO Auto-generated method stub
		
		if(root==null)
			return 0;
		else{
			
			int ldepth = findDepth(root.left);
			
			int rdepth = findDepth(root.right);
			
			if(ldepth>rdepth)
				return ldepth+1;
			else 
				return rdepth+1;
			
			
		}
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
		
		node30.right = new Node(56);
		node30.right.right = new Node(51);
		

		return rootNode;
	}
	
}