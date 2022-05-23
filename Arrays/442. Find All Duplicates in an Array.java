class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int ind;
        List<Integer> res = new ArrayList<>();
        for (int n: nums) {
            ind = Math.abs(n) - 1;
            if (nums[ind] < 0) res.add(ind + 1);
            nums[ind] = -nums[ind];
        }
        return res;
    }
}
