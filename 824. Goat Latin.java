class Solution {
    public String toGoatLatin(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        
        int i = 1;
        for(String w : words) {
            char ch = w.toLowerCase().charAt(0);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                sb.append(w).append("ma");
            } else {
                sb.append(w.substring(1)).append(w.charAt(0)).append("ma");
            }
            sb.append("a".repeat(i++));
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
