class Solution {
    public int compareVersion(String a, String b) {
        String[] v1 = a.split("\\.");
        String[] v2 = b.split("\\.");
        
        int max = Math.max(v1.length, v2.length);
        for(int i = 0; i < max; i++) {
            int n1 = i >= v1.length ? 0 : Integer.parseInt(v1[i]);
            int n2 = i >= v2.length ? 0 : Integer.parseInt(v2[i]);
            if (n1 < n2) return -1;
            else if (n1 > n2) return 1;
        }
        return 0;
    }
}
