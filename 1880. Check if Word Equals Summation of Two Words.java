class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int n1 = 0, n2 = 0, n3 = 0;
        n1 = getStringValue(firstWord);
        n2 = getStringValue(secondWord);
        n3 = getStringValue(targetWord);
        
        return (n1 + n2) == n3;
    }
    
    public int getStringValue(String s) {
        int n;
        for(int i = 0; i < s.length(); i++) {
            n += (s.charAt(i) - 97) * Math.pow(10, s.length() - i - 1);
        }
        return n;
    }
}
