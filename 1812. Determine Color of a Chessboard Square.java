class Solution {
    public boolean squareIsWhite(String coordinates) {
        int c1 = coordinates.charAt(0) - 'a' - 1;
        int c2 = coordinates.charAt(1) - '0';
        
        if ((c1 + c2) % 2 == 0) return false;
        return true;
    }
}
