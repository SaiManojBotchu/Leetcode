// TC - O(N), SC - O(1)
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                fast = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}

// TC - O(N), SC - O(N)
// public class Solution {
//     public ListNode detectCycle(ListNode head) {
//         HashSet<ListNode> set = new HashSet<>();
//         while (head != null) {
//             if (set.contains(head)) return head;
//             set.add(head);
//             head = head.next;
//         }
//         return null;
//     }
// }
