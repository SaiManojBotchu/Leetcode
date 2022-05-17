// subsequences(can have same number) whose sum is k
class Solution {
    public void subSequence(int[] A, List<List<Integer>> res, List<Integer> li, int i, int tar) {
        if (i == A.length) {
            if (tar == 0) res.add(new ArrayList<>(li));
            return;
        }
        if (A[i] <= tar) { // picked
            li.add(A[i]);
            subSequence(A, res, li, i, tar - A[i]);
            li.remove(li.size() - 1);
        }
        subSequence(A, res, li, i + 1, tar); // not picked
    }
    public List<List<Integer>> combinationSum(int[] A, int tar) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        subSequence(A, res, li, 0, tar);
        return res;
    }
}
