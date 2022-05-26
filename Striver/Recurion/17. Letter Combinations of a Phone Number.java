class Solution {
    List<String> res = new ArrayList<>();
    String[] map = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    char[] c;
    
    public List<String> letterCombinations(String s) {
        if (s.isEmpty()) return res;
        
        c = s.toCharArray();
        backtrack(0, "");
        return res;
    }
    
    public void backtrack(int start, String s) {
        if (start == c.length) {
            res.add(s);
            return;
        }
        int digit = c[start] - '0';
        String val = map[digit];
        
        for (int i = 0; i < val.length(); i++) {
            backtrack(start + 1, s + val.charAt(i));
        }
    }
}
