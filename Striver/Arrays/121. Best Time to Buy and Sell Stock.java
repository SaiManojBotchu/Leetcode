class Solution {
    public int maxProfit(int[] A) {
        int min = Integer.MAX_VALUE, profit = 0;
        for (int i = 0; i < A.length; i++) {
            min = Math.min(min, A[i]);
            profit = Math.max(profit, A[i] - min);
        }
        return profit;
    }
}
