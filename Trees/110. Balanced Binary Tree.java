class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        // if we get -1 that means given tree is not a balanced binary tree
        return recursion(root) != -1;
    }
    
    public int recursion(TreeNode root) {
        if (root == null) return 0;
        
        int left = recursion(root.left);
        // if left or right is -1 that means given tree is not a balanced binary tree
        // so return -1 from left and right subtree, so that it will return -1 to the first recursion call
        if (left == -1) return -1;
        int right = recursion(root.right);
        if (right == -1) return -1;
        
        // if for any node the below condition is true that means the given tree is not a balanced binart tree
        // so return -1, because we will know that at some point in the tree our condition is true
        if (Math.abs(left - right) > 1) {
            return -1;
        }
        return 1 + Math.max(left, right);
    }
}
