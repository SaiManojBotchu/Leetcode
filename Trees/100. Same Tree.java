class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) return p == q;
        
        boolean left = isSameTree(p.left, q.left);
        boolean right = isSameTree(p.right, q.right);
        return p.val == q.val && left && right;
    }
}

// https://leetcode.com/problems/same-tree/discuss/2135837/java-solution-using-recursion/1431157
