package tree;

public class balanced {

	public static boolean isbalanced(Node root){
		if(root == null) return true;
		
		int heightdiff= (new height().treeheight(root.left)-new height().treeheight(root.right));
		
		if(Math.abs(heightdiff)>1){
			return false;
		}else{
			
			return isbalanced(root.left) && isbalanced(root.right);
		}	
	}

}