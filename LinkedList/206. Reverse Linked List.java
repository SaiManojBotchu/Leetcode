class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null, next = null;
        while (head != null) {
            next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
}
