package tree;

class Node{
	int data;
	Node left, right;

	Node(int item){
		data=item;
		left=right=null;
	}
}

public class traversal {
	 
	Node root;
	
      traversal(){
	        root= null;
      }
	
	
	void preorder(Node node){
		
		if(node==null)
			return;
		System.out.print(node.data+" ");
		preorder(node.left);
		
		preorder(node.right);
	}
    
	void inorder(Node node){
    	if(node==null)
			return;
    	inorder(node.left);
		System.out.print(node.data+" ");
		inorder(node.right);
	}
   
	void postorder(Node node){
	   if(node==null)
			return;
		postorder(node.left);
	    postorder(node.right);
		System.out.print(node.data+" ");
	 }
   
// Wrappers over above recursive functions
  
  
   void preorder(){    
	   preorder(root); 
	   }
   void inorder(){
	   inorder(root);
	   }
   void postorder(){   
	   postorder(root);  
	   }
	
   public static void main(String[] args) {
		
	traversal tree= new traversal();
	tree.root= new Node(5);
	tree.root.left= new Node(2);
	tree.root.right= new Node(7);
	tree.root.left.left= new Node(1);
	tree.root.left.right= new Node(3);
	tree.root.right.left= new Node(6);
	tree.root.right.right= new Node(8);
	
	System.out.println("Print preorder :");
	tree.preorder();
	System.out.println();
	System.out.println("Print inorder :");	
	tree.inorder();
	System.out.println();
	System.out.println("Print postorder :");
	tree.postorder();
	
	   
   }

}
