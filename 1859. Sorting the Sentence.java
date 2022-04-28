class Solution {
    public String sortSentence(String s) {
        String[] array = s.split(" ");
        String[] result = s.split(" ");
        
        for(String arr : array) {
            int index = arr.charAt(arr.length() - 1) - '0';
            result[index - 1] = arr.substring(0, arr.length() - 1);
        }
        
        return String.join(" ", result);    
    }
}
