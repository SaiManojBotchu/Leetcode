class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length() == 1) return true;
        
        int count1 = 0, count2 = 0;
        
        for(int i = 0; i < word.length(); i++) {
            if (word.charAt(i) <= 'Z') count1++;
            else if (word.charAt(i) >= 'a') count2++;
        }
        if (count1 == word.length()) return true;
        else if (count2 == word.length()) return true;
        else if (count2 == word.length() - 1 && word.charAt(0) <= 'Z') return true;
        else return false;
    }
}

// class Solution {
//     public boolean detectCapitalUse(String word) {
//         return word.equals(word.toUpperCase()) || word.equals(word.charAt(0) + word.substring(1).toLowerCase());
//     }
// }
