package tree;

public class NodeHeight {

	public int height(Node root, Node x, int hite){
		if(root == null){
			return 0;
		}
		else if(root==x){
			return hite;
		}
		
		 
				
		int level= height(root.left, x,hite+1);
		
	        if(level!=0)
	     	return level;
		
        return height(root.right, x,hite+1);
		
	}
	public static void main(String[] args) {
		Node root = new Node(5);
		root.left = new Node(10);
		root.right = new Node(15);
		root.left.left = new Node(20);
		root.left.right = new Node(25);
		root.right.left = new Node(30);
		root.right.right = new Node(35);		
		
		
	//	root.left.left.left = x;
		
		NodeHeight nh = new NodeHeight();
	//	System.out.println(nh.height(root, x,1));
		
		System.out.println(balanced.isbalanced(root));

	}

}
