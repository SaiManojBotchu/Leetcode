class Solution {
    int count = 0;

    public int numTilePossibilities(String tiles) {
        char[] A = tiles.toCharArray();
        Arrays.sort(A);
        backtrack(A, new int[tiles.length()]);
        // remove the empty tile
        return count - 1;
    }
    
    public void backtrack(char[] A, int[] present) {
        count++;
        for (int i = 0; i < A.length; i++) {
            // if current character was used before
            // OR
            // previous character is equals to current character
            // and previoud character was not used before
            if (present[i] == 1 || i > 0 && A[i] == A[i - 1] && present[i - 1] == 0) continue;
            
            present[i] = 1;
            backtrack(A, present);
            present[i] = 0;  
        }
    }
}
