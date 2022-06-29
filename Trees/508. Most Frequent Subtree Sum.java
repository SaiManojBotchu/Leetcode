class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    int maxFreq = 0;
    
    public int[] findFrequentTreeSum(TreeNode root) {
        helper(root);
        List<Integer> res = new ArrayList<>();
        for (int s : map.keySet()) {
            // add all the sums whose freq is equal to maxFreq
            if (map.get(s) == maxFreq) {
                res.add(s);
            }
        }
        return res.stream().mapToInt(i->i).toArray();
    }
    
    public int helper(TreeNode node) {
        if (node == null) return 0;
        
        // getting left subtree sum
        int left = helper(node.left);
        // getting right subtree sum
        int right = helper(node.right);
        // sum of the tree including node
        int sum = left + right + node.val;
        // keeping track of all sum's frequencies in map
        // if it is first sum keep freq as 1 else (curFreq + 1)
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        // keeping the maxFreq of sums
        maxFreq = Math.max(map.get(sum), maxFreq);
        return sum;
    }
}
