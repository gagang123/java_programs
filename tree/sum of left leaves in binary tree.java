public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        
    
    return helper(root, false);
    }
    
    public int helper(TreeNode root, boolean isLeft) {
        if (root == null) return 0;
		
		// check for the leaf node if it is leaf node return its value
        if (root.left == null && root.right == null && isLeft) return root.val;
        int left = helper(root.left, true);
		//we dont need the value of the right node so always keep it false
        int right = helper(root.right, false);
        return left + right;
    }
}
