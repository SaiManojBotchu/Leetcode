class Solution {
    List<List<Integer>> res = new ArrayList<>();
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        backtrack(1, k, n, new ArrayList<>());
        return res;
    }
    
    public void backtrack(int start, int k, int sum, List<Integer> li) {
        if (k == 0 && sum == 0) {
            res.add(new ArrayList<>(li));
            return;
        }
        for (int i = start; i <= 9; i++) {
            // do not examine later elements since they are larger
            if (i > sum) break;

            li.add(i);
            backtrack(i + 1, k - 1, sum - i, li);
            li.remove(li.size() - 1);
        }
    }
}
