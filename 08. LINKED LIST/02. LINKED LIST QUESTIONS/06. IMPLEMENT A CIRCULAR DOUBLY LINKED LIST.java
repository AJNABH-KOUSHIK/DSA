public class CircularDoublyLinkedList {
    DNode head;

    public void insert(int data) {
        DNode newNode = new DNode(data);
        if (head == null) {
            head = newNode;
            head.next = head.prev = head;
            return;
        }
        DNode tail = head.prev;
        tail.next = newNode;
        newNode.prev = tail;
        newNode.next = head;
        head.prev = newNode;
    }

    public void printForward(int steps) {
        if (head == null) return;
        DNode curr = head;
        for (int i = 0; i < steps; i++) {
            System.out.print(curr.data + " <-> ");
            curr = curr.next;
        }
        System.out.println("...");
    }
}
