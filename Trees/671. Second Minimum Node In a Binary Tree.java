class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        // store min values in "min" array.
        // first min -> min[0] , second min -> min[1]
        // since root value is smallest between its two sub nodes, first min -> root.val
        int[] min = {root.val, -1};
        helper(root, min);
        return min[1];
    }
    public void helper(TreeNode node, int[] min) {
        if (node == null) return;
        
        // check below 2 conditions, if either of them is true, then change second min
        // 1) if the curNode val is greater than first min and less than second min (or)
        // 2) if the curNode val is greater than first min and second min is not yet
        //    changed from -1 which means that we haven't still initialized second min
        if (node.val > min[0] && (node.val < min[1] || min[1] == -1)) {
            min[1] = node.val;
        }
        helper(node.left, min);
        helper(node.right, min);
    }
}
