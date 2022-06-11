class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else if (st.isEmpty()) {
                return false;
            } else if (c == ')' && st.pop() != '(') {
                return false;
            } else if (c == '}' && st.pop() != '{') {
                return false;
            } else if (c == ']' && st.pop() != '[') {
                return false;
            }
        }
        return st.isEmpty();
    }
}

// https://leetcode.com/problems/valid-parentheses/discuss/2137808/2-java-solutions
