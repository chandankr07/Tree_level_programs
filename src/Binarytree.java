import java.util.Stack;

public class Binarytree{
	
	public static class Node
	 {
	  int data;
	  Node left;
	  Node right;
	  Node(int data)
	  {
		  this.data=data;
	  }
	 
	 }
	
	public static void main(String [] args){
		
		Node node = Binarytree.createBinaryTree();
		
		System.out.println("\ninorder traver of the tree is : ");
		inorder(node);
		
		System.out.println("\nPreorder traver of the tree is : ");
		preorder(node);
		
		System.out.println("\nPostorder traver of the tree is : ");
		postorder(node);
		
	}
	
	public static void preorder(Node root){
		
		if(root==null)
			return;
		
		else
		{
			System.out.println(root.data);
			preorder(root.left);
			preorder(root.right);	
		}
	}
	
	public void preorderIter(Node root) {
		   
        if(root == null)
            return;
 
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
 
        while(!stack.empty()){
         
            Node n = stack.pop();
            System.out.printf("%d ",n.data);
 
          
            if(n.right != null){
                stack.push(n.right);
            }
            if(n.left != null){
                stack.push(n.left);
            }
 
        }
        
    }
	
	public static void postorder(Node root){
		
		if(root==null)
			return;

		else
		{
			postorder(root.left);
			postorder(root.right);	
			System.out.println(root.data);
		}
	}

	public void postorderIter( Node root) {
	      if( root == null ) return;
	   
	       Stack<Node> s = new Stack<Node>();
	       Node current = root;
	   
	      while( true ) {
	   
	          if( current != null ) {
	              if( current.right != null ) 
	               s.push( current.right );
	              s.push( current );
	              current = current.left;
	              continue;
	        }
	   
	          if( s.isEmpty( ) ) 
	           return;
	          current = s.pop( );
	   
	          if( current.right != null && ! s.isEmpty( ) && current.right == s.peek( ) ) {
	              s.pop( );
	              s.push( current );
	              current = current.right;
	          } else {
	              System.out.print( current.data + " " );
	              current = null;
	          }
	      }
	  }
	
	public static void inorder(Node root){

		if(root==null)
			return;
		
		else
		{
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);	
		}
	}
	
	public void inOrderIter(Node root) {
		 
		  if(root == null)
		   return;
		 
		   Stack<Node> s = new Stack<Node>();
		   Node currentNode=root;
		 
		  while(!s.empty() || currentNode!=null){
		 
		   if(currentNode!=null)
		   {
		    s.push(currentNode);
		    currentNode=currentNode.left;
		   }
		   else
		   {
			   Node n=s.pop();
		    System.out.printf("%d ",n.data);
		    currentNode=n.right;
		   }
		  }
		 }
	
	public static Node createBinaryTree(){
		
	Node rootNode = new Node(40);
	
	rootNode.left = new Node(20);
	
	rootNode.left.left = new Node(10);
	rootNode.left.right = new Node(30);
	
	rootNode.right = new Node(60);
	rootNode.right.left = new Node(50);
	
	rootNode.right.right = new Node(80);
	rootNode.right.right.left = new Node(70);
	
	return rootNode;
}

	
}