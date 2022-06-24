class Solution {
    int nodesCount = 0;
    private record sumAndCount(int sum, int count) {};
    
    public int averageOfSubtree(TreeNode root) {
        helper(root);
        return nodesCount;
    }
    public sumAndCount helper(TreeNode node) {
        if (node == null) {
            return new sumAndCount(0, 0);
        }
        
        sumAndCount left = helper(node.left);
        sumAndCount right = helper(node.right);
        int sum = left.sum() + right.sum() + node.val;
        int count = left.count() + right.count() + 1;
        
        if (node.val == sum / count) nodesCount++;
        
        return new sumAndCount(sum, count);
    }
}

// https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree/discuss/2192177/Java-two-solutions
