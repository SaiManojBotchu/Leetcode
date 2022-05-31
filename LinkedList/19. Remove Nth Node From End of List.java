class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode();
        start.next = head;
        ListNode fast = start;
        ListNode slow = start;     

        for(int i = 1; i <= n; ++i)
            fast = fast.next;
        while(fast.next != null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        
        return start.next;
    }
}

// Solution - 2
// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         ListNode slow = head, fast = head;
//         for (int i = 1; i <= n; i++) {
//             fast = fast.next;
//         }
//         // edge case if n == len
//         if (fast == null) return head.next;
        
//         while (fast.next != null) {
//             slow = slow.next;
//             fast = fast.next;
//         }
//         slow.next = slow.next.next;
        
//         return head;
//     }
// }
