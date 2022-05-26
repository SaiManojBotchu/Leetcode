class Solution {
    List<List<Integer>> res = new ArrayList<>();
    
    public List<List<Integer>> combine(int n, int k) {
        backtrack(1, n, k, new ArrayList<>());
        return res;
    }
    
    public void backtrack(int start, int n, int k, List<Integer> li) {
        if (k == 0) {
            res.add(new ArrayList<>(li));
            return;
        }
        // (n - k + 1) -> skipping the combinations which don't have the 
        // possibilty of getting k size combinations called pruning
        // (helps us decrease Runtime)
        for (int i = start; i <= n - k + 1; i++) {
            li.add(i);
            backtrack(i + 1, n, k - 1, li);
            li.remove(li.size() - 1);
        }
    }
}
