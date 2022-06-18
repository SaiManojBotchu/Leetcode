class Solution {
    public int sumRootToLeaf(TreeNode root) {
        return helper(root, 0);
    }
    public int helper(TreeNode node, int sum) {
        if (node == null) return 0;
        
        sum = (2 * sum) + node.val;
        if (node.left == null && node.right == null) return sum;
        return helper(node.left, sum) + helper(node.right, sum);
    }
}

// https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/discuss/2165140/Java-solution-using-recursion
