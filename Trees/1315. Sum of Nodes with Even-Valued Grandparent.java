class Solution {
    int sum = 0;
    public int sumEvenGrandparent(TreeNode root) {
        helper(root, null, null);
        return sum;
    }
    public void helper(TreeNode node, TreeNode parent, TreeNode gParent) {
        if (node == null) return;
        
        if (gParent != null && gParent.val % 2 == 0) {
            sum += node.val;
        }
        if (node.left != null) {
            helper(node.left, node, parent);
        }
        if (node.right != null) {
            helper(node.right, node, parent);
        }
    }
}

// https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent/discuss/2184133/Java-solution-using-recursion
