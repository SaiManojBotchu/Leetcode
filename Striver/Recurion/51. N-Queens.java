class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        List<List<String>> res = new ArrayList<>();
        int[] leftRow = new int[n];
        int[] lowerDiag = new int[2 * n - 1];
        int[] upperDiag = new int[2 * n - 1];
        solve(0, leftRow, lowerDiag, upperDiag, board, res, n);
        
        return res;
    }
    
    public void solve(int col, int[] leftRow, int[] lowerDiag, int[] upperDiag, char[][] board, List<List<String>> res, int n) {
        if (col == n) {
            res.add(construct(board));
        }
        for (int row = 0; row < n; row++) {
            if (leftRow[row] == 0 && lowerDiag[row + col] == 0 && upperDiag[n - 1 + col - row] == 0) {
                board[row][col] = 'Q';
                leftRow[row] = 1;
                lowerDiag[row + col] = 1;
                upperDiag[n - 1 + col - row] = 1;
                
                solve(col + 1, leftRow, lowerDiag, upperDiag, board, res, n);
                
                board[row][col] = '.';
                leftRow[row] = 0;
                lowerDiag[row + col] = 0;
                upperDiag[n - 1 + col - row] = 0;
            }
        }
    }
    
    public List<String> construct(char[][] board) {
        List<String> li = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            li.add(new String(board[i]));
        }
        return li;
    }
}
