class Solution {
    List<Integer> res = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        Inorder(root);
        return res;
    }
    private void Inorder(TreeNode node) {
        if (node == null) {
            return;
        }
        Inorder(node.left);
        Inorder(node.right);
        res.add(node.val);
    }
}
