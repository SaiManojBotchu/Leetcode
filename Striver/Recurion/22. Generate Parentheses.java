class Solution {
    List<String> res = new ArrayList<>();
    
    public List<String> generateParenthesis(int n) {
        backtrack(new char[2 * n], 0, 0, 0, n);
        return res;
    }
    
    public void backtrack(char[] ch, int index, int open, int close, int n) {
        if (index == 2 * n) {
            res.add(new String(ch));
            return;
        }
        // only take open '(' bracket if open < n
        // beacuse we only need n no. of open brackets.
        if (open < n) {
            ch[index] = '(';
            backtrack(ch, index + 1, open + 1, close, n);
        }
        // only take close ')' bracket if close < n
        // beacuse we only take closed bracket if an open bracket is present before
        if (close < open) {
            ch[index] = ')';
            backtrack(ch, index + 1, open, close + 1, n);
        } 
    }
}
