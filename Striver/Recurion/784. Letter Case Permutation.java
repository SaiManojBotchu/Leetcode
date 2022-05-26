class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        backtrack(0, s.toCharArray(), res);
        return res;
    }
    
    public void backtrack(int i, char[] C, List<String> res) {
        if (i == C.length) {
            res.add(new String(C));
            return;
        }
        if (Character.isLetter(C[i])) {
            C[i] = Character.toLowerCase(C[i]); 
            backtrack(i + 1, C, res); // for lowercase
            C[i] = Character.toUpperCase(C[i]);
            backtrack(i + 1, C, res); // for uppercase
        } else {
            backtrack(i + 1, C, res);
        }
    }
}

// solution - 2
// class Solution {
//     public List<String> letterCasePermutation(String s) {
//         List<String> res = new ArrayList<>();
//         backtrack(0, s, res, new StringBuilder());
//         return res;
//     }
    
//     public void backtrack(int ind, String s, List<String> res, StringBuilder sb) {
//         if (ind == s.length()) {
//             res.add(sb.toString());
//             return;
//         }
//         char c = s.charAt(ind);
//         if (Character.isLetter(c)) {
//             sb.append(Character.toLowerCase(c));
//             backtrack(ind + 1, s, res, sb); // for lowercase
//             sb.deleteCharAt(ind);

//             sb.append(Character.toUpperCase(c));
//             backtrack(ind + 1, s, res, sb); // for uppercase
//             sb.deleteCharAt(ind);
//         } else {
//             sb.append(c);
//             backtrack(ind + 1, s, res, sb);
//             sb.deleteCharAt(ind);
//         }
//     }
// }
