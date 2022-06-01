// TC - O(N), SC - O(1)
class Solution {
    public List<Integer> targetIndices(int[] A, int target) {
        int smaller = 0, equal = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] < target) {
                smaller++;
            } else if (A[i] == target) {
                equal++;
            }
        }
        List<Integer> res = new ArrayList<>(equal);
        while (equal != 0) {
            res.add(smaller++);
            equal--;
        }
        return res;
    }
}

// For Reference:
// https://leetcode.com/problems/find-target-indices-after-sorting-array/discuss/2099471/Java-Solution
