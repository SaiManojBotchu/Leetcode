// TC - O(N/2)
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

// TC - O(N) + O(N/2)
// class Solution {
//     public ListNode middleNode(ListNode head) {
//         int count = 0;
//         ListNode temp = head;
//         while (temp != null) {
//             temp = temp.next;
//             count++;
//         }
//         for (int i = 1; i <= count / 2; i++) {
//             head = head.next;
//         }
//         return head;
//     }
// }
