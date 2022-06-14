class Solution {
    public int[] nextGreaterElement(int[] A, int[] B) {
        Stack<Integer> st = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int ele : B) {
            while (!st.isEmpty() && ele > st.peek()) {
                map.put(st.pop(), ele);
            }
            st.push(ele);
        }
        for (int i = 0; i < A.length; i++) {
            A[i] = map.getOrDefault(A[i], -1);
        }
        return A;
    }
}

// https://leetcode.com/problems/next-greater-element-i/discuss/97595/Java-10-lines-linear-time-complexity-O(n)-with-explanation
