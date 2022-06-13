class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0, close = 0;
        for (char c: s.toCharArray()) {
            if (c == '(') {
                // increase open brackets count
                open++;
            } else {
                // if open is 0, means there are no open brackets before the close bracket.
                if (open == 0) {
                    close++;
                } else {
                    // decrease open brackets count only if open != 0
                    // because if open is 0, we can't cancel close brackets count.
                    open--;
                }
            }
        }
        return open + close;
    }
}
