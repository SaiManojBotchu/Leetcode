class Solution {
    int maxDepth = 0, sum = 0;
    public int deepestLeavesSum(TreeNode root) {
        helper(root, 0);
        return sum;
    }
    public void helper(TreeNode node, int curDepth) {
        if (node == null) return;
        
        if (curDepth > maxDepth) {
            sum = 0;
            maxDepth = curDepth;
        }
        if (curDepth == maxDepth) {
            sum += node.val;
        }
        helper(node.left, curDepth + 1);
        helper(node.right, curDepth + 1);
    }
}

// https://leetcode.com/problems/deepest-leaves-sum/discuss/2191783/Java-two-soluitons-dfs-and-bfs
