class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = strs[0].length();
        StringBuilder lcPrefix = new StringBuilder();
        
        for(int i = 1; i < strs.length; i++) {
            min = Math.min(min, strs[i].length());
        }
        for(int i = 0; i < min; i++) {
           char c = strs[0].charAt(i);
            for(String str : strs) {
                if(c != str.charAt(i)) {
                    return lcPrefix.toString();
                }
            }
            lcPrefix.append(c);
        }
        
        return lcPrefix.toString();
    }
}
