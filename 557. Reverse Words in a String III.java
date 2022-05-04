class Solution {
    public String reverseWords(String s) {
        if (s.length() == 1) return s;
        String[] words = s.split(" ");
        String[] result = new String[words.length];
        
        for(int i = 0; i < words.length; i++) {
            result[i] = (new StringBuilder().append(words[i]).reverse().toString());
        }
        return String.join(" ", result);
    }
}
