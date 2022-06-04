class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int rows = mat.length;
        int cols = mat[0].length;
        // Keep the frequencies of 1's in an array
        int[] freq = new int[rows];
        for (int i = 0; i < rows; i++) {
            int count = 0;
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }
            freq[i] = count;
        }
        
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            int min = Integer.MAX_VALUE;
            int minIndex = 0;
            // find the "min" value and "minIndex" in the "freq" array
            for (int j = 0; j < rows; j++) {
                if (freq[j] < min) {
                    min = freq[j];
                    minIndex = j;
                }
            }
            // store the "minIndex" in "res" array
            res[i] = minIndex;
            // for not taking the same "min" and "minIndex" value for the remaining iterations, we have to 
            // change the value at "minIndex" to something high so that we will not be picking it up again
            // (simply for the next iteration we will get the second min value and so on...)
            freq[minIndex] = Integer.MAX_VALUE;
        }
        return res;
    }
}
