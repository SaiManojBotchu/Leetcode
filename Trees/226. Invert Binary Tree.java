class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        
        // swap the left and right nodes
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        // swapping the left and right nodes for the left and right subtree
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
