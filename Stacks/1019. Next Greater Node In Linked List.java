class Solution {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> li = new ArrayList<>();
        while (head != null) {
            li.add(head.val);
            head = head.next;
        }
        
        int[] res = new int[li.size()];
        // Stack<Integer> st = new Stack<>();
        Deque<Integer> st = new ArrayDeque<>(); // faster
        for (int i = 0; i < li.size(); i++) {
            while (!st.isEmpty() && li.get(i) > li.get(st.peek())) {
                res[st.pop()] = li.get(i);
            }
            st.push(i);
        }
        return res;
    }
}
