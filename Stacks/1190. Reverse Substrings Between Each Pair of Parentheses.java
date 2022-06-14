class Solution {
    public String reverseParentheses(String s) {
        Stack<String> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                // push the pre string to the stack. works if we have nested brackets
                st.push(sb.toString());
                sb.setLength(0);
            } else if (c == ')') {
                // reverse the String if we get close ) bracket
                sb = sb.reverse();
                // insert the before(pre) string to sb from the stack
                sb.insert(0, st.pop());
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
/* for eg: "(u(love)i)"
1) st - 
   sb - u
2) st - u
   sb - love.reverse() -> evol
   st - 
   sb - u + evol
3) st - 
   sb - uevol + i
   st - 
   sb - uevoli.reverse() -> iloveu
*/
