class Solution {
    public List<List<Integer>> subsetsWithDup(int[] A) {
        Arrays.sort(A);
        List<List<Integer>> res = new ArrayList<>();
        subsets(0, A, res, new ArrayList<>());
        return res;
    }
    
    public void subsets(int ind, int[] A, List<List<Integer>> res, List<Integer> li) {
        res.add(new ArrayList<>(li));
        
        for(int i = ind; i < A.length; i++)  {
            if(i > ind && A[i] == A[i - 1]) continue;
            
            li.add(A[i]);
            subsets(i + 1, A, res, li);
            li.remove(li.size() - 1);
        }
    }
}
