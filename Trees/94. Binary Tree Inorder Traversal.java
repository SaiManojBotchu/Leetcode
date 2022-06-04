class Solution {
    List<Integer> res = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        Inorder(root);
        return res;
    }
    private void Inorder(TreeNode node) {
        if (node == null) {
            return;
        }
        Inorder(node.left);
        res.add(node.val);
        Inorder(node.right);
    }
}
