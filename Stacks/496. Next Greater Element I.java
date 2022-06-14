class Solution {
    public int[] nextGreaterElement(int[] A, int[] B) {
        Stack<Integer> st = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int ele : B) {
            while (!st.isEmpty() && ele > st.peek()) {
                // keeping track of next larger element for elements in array B
                map.put(st.pop(), ele);
            }
            st.push(ele);
        }
        for (int i = 0; i < A.length; i++) {
            // if ele has next larger -> map.(A[i])
            // else -1
            A[i] = map.getOrDefault(A[i], -1);
        }
        return A;
    }
}

// https://leetcode.com/problems/next-greater-element-i/discuss/97595/Java-10-lines-linear-time-complexity-O(n)-with-explanation
