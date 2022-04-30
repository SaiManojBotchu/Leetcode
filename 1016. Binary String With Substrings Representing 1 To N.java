class Solution {
    public boolean queryString(String s, int n) {
        for(int i = 1; i <= n; i++)  {
            if( !s.contains(getBinary(i))) return false;
        }
        return true;
    }
    
    public String getBinary(int num) {
        StringBuilder sb = new StringBuilder();
        while(num != 0) {
            sb.append(num % 2);
            num = num / 2;
        }
        return sb.reverse().toString();
    }
}


// easy solution
/*
class Solution {
    public boolean queryString(String s, int n) {
        for(int i = 0; i < n; i++) {
            if ( !s.contains(Integer.toBinaryString(i+1)) ) {
                return false;
            }
        }
        return true;
    }
}
*/
