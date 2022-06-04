// TC - O(N)
class Solution {
    public int countNegatives(int[][] grid) {
        int len = grid.length, count = 0;
        int row = 0, col = grid[0].length - 1;
        
        while (row < len && col >= 0) {
            if (grid[row][col] < 0) {
                count += len - row;
                col--;
            }
            else if (grid[row][col] >= 0) {
                row++;
            }
        }
        return count;
    }
}
