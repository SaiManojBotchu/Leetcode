class Solution {
    boolean flag = true;
    public boolean isUnivalTree(TreeNode root) {
        helper(root, root.val);
        return flag;
    }
    public void helper(TreeNode node, int rootVal) {
        if (flag == false) return;
        if (node == null) return;
        if (node.val != rootVal) {
            flag = false;
            return;
        }
        helper(node.left, rootVal);
        helper(node.right, rootVal);
    }
}

// https://leetcode.com/problems/univalued-binary-tree/discuss/2179532/Java-solution-using-recursion
