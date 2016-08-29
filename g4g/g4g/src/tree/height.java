package tree;

public class height {
	
	public int treeheight(Node root){
		
		if(root==null)
			return 0;
		else{
			return(1+Math.max(treeheight(root.left), treeheight(root.right)));
					
		}
	} 

	public static void main(String[] args) {
		Node root= new Node(5);
		root.left= new Node(10);
		root.right= new Node(15);
		root.left.left = new Node(20);
		root.left.right = new Node(25);
		root.left.left.left =new Node(30);
		root.left.right.left = new Node(35);
		root.left.right.left.left = new Node(40);
		root.left.right.left.left.right = new Node(45);
		root.left.right.left.left.right.left = new Node(50);
		
		height h = new height();
		System.out.println(h.treeheight(root));
		

	}

}
