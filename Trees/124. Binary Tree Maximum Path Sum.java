class Solution {
    int maxPathSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        recursion(root);
        return maxPathSum;
    }
    
    public int recursion(TreeNode node) {
        if (node == null) return 0;
        
        // since the nodes has chance of negative values we are only taking 
        // the node if its value is greater than 0 else dont consider the node
        int maxL = Math.max(0, recursion(node.left));
        int maxR = Math.max(0, recursion(node.right));
        maxPathSum = Math.max(maxPathSum, node.val + maxL + maxR);
        return Math.max(maxL, maxR) + node.val;
    }
}
