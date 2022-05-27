class Solution {
    Set<List<Integer>> res = new HashSet<>();
    
    public List<List<Integer>> findSubsequences(int[] A) {
        backtrack(0, A, new LinkedList<>());
        return new LinkedList(res);
    }
    
    public void backtrack(int start, int[] A, LinkedList<Integer> li) {
        if (li.size() >= 2) {
            res.add(new ArrayList<>(li));
        }
        
        for (int i = start; i < A.length; i++) {
            if (li.size() == 0 || li.peekLast() <= A[i]) {
                li.add(A[i]);
                backtrack(i + 1, A, li);
                li.remove(li.size() - 1);
            } 
        }
    }
}
