class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String s : sentences) {
            if(s.split(" ").length > max) {
                max = s.split(" ").length;
            }
        }
        return max;
    }
}
