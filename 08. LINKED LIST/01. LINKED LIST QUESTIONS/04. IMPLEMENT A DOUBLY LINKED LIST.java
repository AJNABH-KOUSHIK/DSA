class DNode {
    int data;
    DNode prev, next;
    DNode(int d) { data = d; }
}

public class DoublyLinkedList {
    DNode head, tail;

    public void insertAtEnd(int data) {
        DNode newNode = new DNode(data);
        if (head == null) { head = tail = newNode; return; }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void printForward() {
        for (DNode curr = head; curr != null; curr = curr.next)
            System.out.print(curr.data + " <-> ");
        System.out.println("null");
    }

    public void printBackward() {
        for (DNode curr = tail; curr != null; curr = curr.prev)
            System.out.print(curr.data + " <-> ");
        System.out.println("null");
    }
}
