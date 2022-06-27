class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        
        int max = Integer.MIN_VALUE;
        int level = 0, minlevel = 0;
        q.add(root);
        while (!q.isEmpty()) {
            level++;
            int size = q.size();
            int sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode cur = q.poll();
                sum += cur.val;
                if (cur.left != null) q.add(cur.left);
                if (cur.right != null) q.add(cur.right);
            }
            if (sum > max) {
                max = sum;
                minlevel = level;
            }
        }
        return minlevel;
    }
}
