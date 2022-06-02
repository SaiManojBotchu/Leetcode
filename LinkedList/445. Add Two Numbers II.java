class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverseList(l1);
        l2 = reverseList(l2);
        
        ListNode resNode = null;
        int sum = 0;
        while (l1 != null || l2 != null || sum > 0) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            ListNode newNode = new ListNode(sum % 10);
            newNode.next = resNode;
            resNode = newNode;
            sum = sum / 10;
        }
        return resNode;
    }
    
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

// https://leetcode.com/problems/add-two-numbers-ii/discuss/2103329/Java-Solution
