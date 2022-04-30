class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        String say = "1";
        
        for(int i = 1; i < n; i++) {
            say = getCountAndSay(say);
        }
        return say;
    }
    
    public String getCountAndSay(String say) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        
        for(int i = 0; i < say.length(); i++) {
            if (i < say.length() - 1 && say.charAt(i) == say.charAt(i+1)) count++;
            else {
                sb.append(count);
                sb.append(say.charAt(i));
                count = 1;
            }
        }
        return sb.toString();   
    }
}
