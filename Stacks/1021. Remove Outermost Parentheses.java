class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (counter != 0) {
                    sb.append(c);
                }
                counter++;
            } else {
                counter--;
                if (counter != 0) {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}

// https://leetcode.com/problems/remove-outermost-parentheses/discuss/2137559/2-Java-solutions
