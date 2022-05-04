class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int index = word.indexOf(ch);
        
        if (index > 0) {
            sb.append(word.substring(0, index + 1)).reverse();
            sb.append(word.substring(index + 1));
            return sb.toString();
        }
        return word;
    }
}

// class Solution {
//     public String reversePrefix(String word, char ch) {
//         StringBuilder sb = new StringBuilder();
        
//         for(int i = 0; i < word.length(); i++) {
//             if (ch == word.charAt(i)) {
//                 sb.append(word.substring(0, i + 1)).reverse();
//                 sb.append(word.substring(i + 1));
//                 return sb.toString();
//             }
//         }
//         return word;
//     }
// }
