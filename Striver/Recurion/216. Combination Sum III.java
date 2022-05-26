class Solution {
    List<List<Integer>> res = new ArrayList<>();
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        backtrack(1, k, n, new ArrayList<>());
        return res;
    }
    
    public void backtrack(int start, int k, int n, List<Integer> li) {
        if (li.size() == k && n == 0) {
            res.add(new ArrayList<>(li));
            return;
        }
        for (int i = start; i <= 9; i++) {
            li.add(i);
            backtrack(i + 1, k, n - i, li);
            li.remove(li.size() - 1);
        }
    }
}
