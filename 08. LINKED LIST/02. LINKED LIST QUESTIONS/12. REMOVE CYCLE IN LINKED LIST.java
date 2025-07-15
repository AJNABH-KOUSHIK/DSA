class Solution {
    public void removeCycle(ListNode head) {
        ListNode slow = head, fast = head;

        // Detect cycle
        do {
            if (fast == null || fast.next == null) return;
            slow = slow.next;
            fast = fast.next.next;
        } while (slow != fast);

        // Find start of loop
        slow = head;
        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }

        // Remove loop
        fast.next = null;
    }
}
