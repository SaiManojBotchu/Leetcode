class Solution {
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        recursion(root, false);
        return sum;
    }
    
    public void recursion(TreeNode node, boolean isLeft) {
        if (node == null) return;
        // if left and right nodes of a node is null, then it is a leaf node and
        // if the node is left node, then add the node value to sum
        if (node.left == null && node.right == null && isLeft) {
            sum += node.val;
        }
        // if it is a left node, then set isLeft -> "true" else "false"
        recursion(node.left, true);
        recursion(node.right, false);
    }
}

// https://leetcode.com/problems/sum-of-left-leaves/discuss/2163038/Java-solution-using-recursion
