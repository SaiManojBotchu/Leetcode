class Solution {
    int count = 0;
    int max = 0;
    
    public int countMaxOrSubsets(int[] A) {
        for (int i: A) {
            max |= i;
        }
        backtrack(A, 0, 0);
        return count;
    }
    
    // using pick or not pick
    public void backtrack(int[] A, int ind, int curOr) {
        if (ind == A.length) {
            if (curOr == max) count++;
            return;
        }
        backtrack(A, ind + 1, curOr | A[ind]);
        backtrack(A, ind + 1, curOr);
    }
    
    // using for loop
    // public void backtrack(int[] A, int ind, int curOr) {
    //     if (curOr == max)
    //         count++;
    //     for (int i = ind; i < A.length; i++) {
    //         backtrack(A, i + 1, curOr | A[i]);
    //     }
    // }
}
