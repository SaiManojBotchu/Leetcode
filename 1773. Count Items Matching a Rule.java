class Solution {
    public int countMatches(List<List<String>> items, String key, String value) {
        int count = 0;
        int index = 0;
        
        if (key.equals("type")) index = 0;
        else if (key.equals("color")) index = 1;
        else if (key.equals("name")) index = 2;
        
        for(int i = 0; i < items.size(); i++) {
            if (items.get(i).get(index).equals(value)) {
                count++;
            }
        }
        return count;
    }
}
