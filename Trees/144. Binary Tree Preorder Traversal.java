class Solution {
    List<Integer> res = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return res;
    }
    private void preorder(TreeNode node) {
        if (node == null) {
            return;
        }
        res.add(node.val);
        preorder(node.left);
        preorder(node.right);
    }
}
