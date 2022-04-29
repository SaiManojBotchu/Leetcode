class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++) {
            if (i < s.length() - 2 && s.charAt(i+2) == '#') {
                int val = (s.charAt(i) - '0') * 10 + s.charAt(i+1) - '0';
                sb.append((char)(val + 96));
                i += 2;
            } else {
                sb.append((char)(s.charAt(i) - '0' + 96));
            }
        }
        
        return sb.toString();
    }
}
