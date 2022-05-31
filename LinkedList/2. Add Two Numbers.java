class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode cur = res;
        int sum = 0;
        
        while (l1 != null || l2 != null || sum == 1) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            // creating a node with sum by removing carry
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            // getting carry and using it for the next nodes
            sum = sum / 10;
        }
        return res.next;
    }
}
