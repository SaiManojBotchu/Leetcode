class Solution {
    int index = 0;
    
    public String decodeString(String s) {
    	int num = 0;
    	StringBuilder res = new StringBuilder();
        
    	while (index < s.length()) {
    		char c = s.charAt(index);
    		if (Character.isAlphabetic(c)) {
    			res.append(c);
    		} else if (Character.isDigit(c)) {
    			num = num * 10 + (c - '0');
    		} else if (c == ']') {
                break;
            } else if (c == '[') {
    			index++;  // skip the char '['
    			String str = decodeString(s);  // index is diff for each call
    			for (int i = 0; i < num; i++)
   					res.append(str);
    			num = 0;  // reset the num for next input
    		} 
    		index++;
    	}
    	return res.toString();
    }
}
