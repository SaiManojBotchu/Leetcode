class Solution {
    public int findDuplicate(int[] nums) {
        int ind;
        for (int n: nums) {
            ind = Math.abs(n);
            if (nums[ind] < 0) return ind;
            nums[ind] = -nums[ind];
        }
        return 1;
    }
}
