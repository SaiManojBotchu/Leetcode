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
        // finding max diameter for every node
        max = Math.max(max, lh + rh);
        return 1 + Math.max(lh, rh);
    }
}
