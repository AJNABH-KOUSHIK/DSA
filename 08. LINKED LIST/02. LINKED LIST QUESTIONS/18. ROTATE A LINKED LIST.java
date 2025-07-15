class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        ListNode oldTail = head;
        int len = 1;
        while (oldTail.next != null) {
            oldTail = oldTail.next;
            len++;
        }
        oldTail.next = head; // make it circular
        k %= len;
        ListNode newTail = head;
        for (int i = 0; i < len - k - 1; i++) newTail = newTail.next;
        ListNode newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }
}
