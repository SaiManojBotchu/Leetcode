class Solution {
    public int[] nextGreaterElements(int[] A) {
        int n = A.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);
        Stack<Integer> st = new Stack<>();
        
        for (int i = 0; i < n * 2; i++) {
            while (!st.isEmpty() && A[i % n] > A[st.peek()]) {
                res[st.pop()] = A[i % n];
            }
            st.push(i % n);
        }
        return res;
    }
}

// https://youtu.be/Du881K7Jtk8
