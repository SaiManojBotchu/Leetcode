class Solution {
    public List<String> cellsInRange(String s) {
        char col1 = s.charAt(0);
        char col2 = s.charAt(3);
        int row1 = s.charAt(1) - '0';
        int row2 = s.charAt(4) - '0';
        
        List<String> list = new ArrayList<String>();
        
        while(col1 <= col2) {
            for(int i = row1; i <= row2; i++) {
                list.add(new StringBuilder().append(col1).append(i).toString());
            }
            col1++;
        }
        
        return list;
    }
}
