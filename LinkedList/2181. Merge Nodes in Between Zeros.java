class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode res = new ListNode(), cur;
        cur = res;
        
        while (head.next != null) {
            cur.next = head;
            head = head.next;
            while (head != null && head.val != 0) {
                cur.next.val += head.val;
                head = head.next;
            }
            cur = cur.next;
        }
        cur.next = null;
        return res.next;
    }
}
