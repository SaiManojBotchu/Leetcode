class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        
        helper(root, 0, res);
        return res;
    }
    public void helper(TreeNode node, int r, List<Integer> res) {
        if (node == null) return;
        
        // if the row is greater than res.size,
        // that means we have to expand the list
        if (r >= res.size()) {
            res.add(node.val);
        }
        else if (node.val > res.get(r)){
            res.set(r, node.val);
        }
        helper(node.left, r + 1, res);
        helper(node.right, r + 1, res);
    }
}
