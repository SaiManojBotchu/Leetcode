class Solution {
    public int minSwaps(String s) {
        int open = 0, swap = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                open++;
            } else if (open == 0) {
                swap++;
            } else {
                open--;
            }
        }
        return (swap + 1) / 2;
    }
}
// https://youtu.be/3YDBT9ZrfaU
