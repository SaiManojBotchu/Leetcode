class Solution {
    int max = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        recursion(root);
        return max;
    }
    public int recursion(TreeNode root) {
        if (root == null) return 0;
        
        int lh = recursion(root.left);
        int rh = recursion(root.right);
        // finding diameter for every node and store the max diameter in "max"
        // we are only adding lh + rh because the length of a path is no. of edges between them not no. of nodes. 
        // so the cur node will act as a curving point.
        max = Math.max(max, lh + rh);
        return 1 + Math.max(lh, rh);
    }
}
