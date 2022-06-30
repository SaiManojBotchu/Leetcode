class Solution {
    public int findTilt(TreeNode root) {
        int[] sum = {0};
        helper(root, sum);
        return sum[0];
    }
    public int helper(TreeNode node, int[] sum) {
        if (node == null) return 0;
    
        int left = helper(node.left, sum);
        int right = helper(node.right, sum);
        // for every node calculate its left and right
        // sum diff and add it to "sum" variable
        sum[0] += Math.abs(left - right);
        
        return node.val + left + right;
    }
}
