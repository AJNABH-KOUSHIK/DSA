public void deleteNode(int key) {
    if (head == null) return;
    if (head.data == key) { head = head.next; return; }
    Node curr = head;
    while (curr.next != null && curr.next.data != key)
        curr = curr.next;
    if (curr.next != null)
        curr.next = curr.next.next;
}
