class Solution {
    List<List<Integer>> res = new ArrayList<>();
    
    public List<List<Integer>> permuteUnique(int[] A) {
        Arrays.sort(A);
        backtrack(A, new int[A.length], new ArrayList<>());
        return res;
    }
    
    public void backtrack(int[] A, int[] used, List<Integer> li) {
        if (li.size() == A.length) {
            res.add(new ArrayList<>(li));
            return;
        }
        
        for (int i = 0; i < A.length; i++) {
            // !used[i - 1] is making sure that duplicate results are not added. Since
            // A[i-1] and A[i] are same, A[i] can only be used if A[i-1] is currently in use.
            if (used[i] == 1 || i > 0 && A[i] == A[i - 1] && used[i - 1] == 0) continue;
            
            li.add(A[i]);
            used[i] = 1;
            backtrack(A, used, li);
            li.remove(li.size() - 1);
            used[i] = 0;
        }
    }
}
