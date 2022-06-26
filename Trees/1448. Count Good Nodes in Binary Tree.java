class Solution {
    int goodNodes = 0;
    public int goodNodes(TreeNode root) {
        helper(root, root.val);
        return goodNodes;
    }
    public void helper(TreeNode node, int max) {
        if (node == null) return;
        
        if (node.val >= max) {
            goodNodes++;
            max = node.val;
        }
        helper(node.left, max);
        helper(node.right, max);
    }
}

// https://leetcode.com/problems/count-good-nodes-in-binary-tree/discuss/2200133/Java-solution-using-recursion
