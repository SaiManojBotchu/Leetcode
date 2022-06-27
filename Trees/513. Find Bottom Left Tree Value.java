class Solution {
    int leftMostValue = 0; int maxDepth = 0;
    public int findBottomLeftValue(TreeNode root) {
        helper(root, 1);
        return leftMostValue;
    }
    public void helper(TreeNode node, int depth) {
        if (node == null) return;
        
        if (depth > maxDepth) {
            leftMostValue = node.val;
            maxDepth = depth;
        }
        helper(node.left, depth + 1);
        helper(node.right, depth + 1);
    }
}

// https://leetcode.com/problems/find-bottom-left-tree-value/discuss/2206004/Java-solution-using-bfs-and-dfs
