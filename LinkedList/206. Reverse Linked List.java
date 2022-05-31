// Iterative
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null, nextNode = null;
        while (head != null) {
            nextNode = head.next;
            head.next = newHead;
            newHead = head;
            head = nextNode;
        }
        return newHead;
    }
}

// Recursive
// class Solution {
//     public ListNode reverseList(ListNode head) {
//         return reverseLL(head, null);
//     }
//     public ListNode reverseLL(ListNode head, ListNode newHead) {
//         if (head == null) {
//             return newHead;
//         }
//         ListNode nextNode = head.next;
//         head.next = newHead;
//         return reverseLL(nextNode, head);
//     }
// }
