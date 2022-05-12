class Solution {
    public int maxSubArray(int[] A) {
        int max = A[0], sum = 0;

        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            if (sum > max) {
                max = sum;  
            }
            if (sum < 0) sum = 0;
        }
        return max;
    }
}

/* TLE - O(N2)
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        
        if (n == 1) return nums[0];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum > max) max = sum;
            }  
        }
        return max;
    }
}
*/
