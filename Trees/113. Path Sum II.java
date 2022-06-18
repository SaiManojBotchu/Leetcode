class Solution {
    List<List<Integer>> res = new ArrayList<>();
    
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        helper(root, sum, new ArrayList<>());
        return res;
    }
    
    public void helper(TreeNode node, int sum, List<Integer> li) {
        if (node == null) return;
        
        li.add(node.val);
        if (node.left == null && node.right == null && sum == node.val) {
            res.add(new ArrayList<>(li));
        } else {
            helper(node.left, sum - node.val, li);
            helper(node.right, sum - node.val, li);
        }
        li.remove(li.size() - 1);
        
    }
}
