class Solution {
    int diff = -1;
    public int maxAncestorDiff(TreeNode root) {
        helper(root, root.val, root.val);
        return diff;
    }
    public void helper(TreeNode node, int max, int min) {
        if (node == null) {
            diff = Math.max(diff, max - min);
            return;
        }
        
        if (node.val > max) max = node.val;
        if (node.val < min) min = node.val;
        helper(node.left, max, min);
        helper(node.right, max, min);
    }
}

// https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/discuss/2196578/Java-solution-using-recursion
