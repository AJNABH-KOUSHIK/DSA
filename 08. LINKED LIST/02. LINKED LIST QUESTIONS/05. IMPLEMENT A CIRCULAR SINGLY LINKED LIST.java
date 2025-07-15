public class CircularSinglyLinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        Node curr = head;
        while (curr.next != head) curr = curr.next;
        curr.next = newNode;
        newNode.next = head;
    }

    public void printList() {
        if (head == null) return;
        Node curr = head;
        do {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        } while (curr != head);
        System.out.println("(back to head)");
    }
}
