class Solution {
    public int maxProfit(int[] A) {
        int profit = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] < A[i + 1]) profit += A[i+1] - A[i];
        }
        return profit;
    }
}
