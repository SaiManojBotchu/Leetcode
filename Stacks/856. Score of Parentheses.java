class Solution {
    public int scoreOfParentheses(String s) {
        int res = 0;
        int score = 1;
        boolean closed = false;
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                score = 2 * score;
                closed = false;
            } else {
                score = score / 2;
                if (closed == false) {
                    res += score;
                    closed = true;
                }
            }
        }
        return res;
    }
}

// https://leetcode.com/problems/score-of-parentheses/discuss/1856519/JavaC%2B%2B-Visually-Explained!!
// https://leetcode.com/problems/score-of-parentheses/discuss/2138548/Java-2-solutions
