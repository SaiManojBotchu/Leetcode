class Solution {
    public boolean checkString(String s) {
        if (s.length() == 1) return true;
        // get index of last a and first b
        int lastA = s.lastIndexOf('a');
        int firstB = s.indexOf('b');
        
        // if lastA is less than 0, means there is no a in the string, so we can return true. same for firstB
        if (lastA < 0 || firstB < 0) return true;
        // if lastA is greater than firstB means lastA is after firstB index, so we can return false;
        else if (lastA > firstB) return false;
        // if above both cases are wrong then every 'a' appears before 'b', so we return true;
        return true;
    }
}
