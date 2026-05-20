package LL;
public class cll {
    private Node head;
    private Node tail;
    // constructor
    public cll() {
        this.head = null;
        this.tail = null;
    }
    // insert node
    public void insert(int val) {

        Node node = new Node(val);
        // first node
        if (head == null) {
            head = node;
            tail = node;
            node.next = head;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    // display circular linked list
    public void display() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.val + " -> ");
                node = node.next;
            } while (node != head);
        }

        System.out.println("HEAD");
    }
    // delete node
    public void delete(int val) {
        Node node = head;
        if (head == null) {
            return;
        }
        // single node case
        if (head == tail && head.val == val) {
            head = null;
            tail = null;
            return;
        }
        // delete head
        if (head.val == val) {

            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;

            if (n.val == val) {

                node.next = n.next;
                // deleting tail
                if (n == tail) {
                    tail = node;
                }

                break;
            }
            node = node.next;
        } while (node != head);
    }
    // node class
    private class Node {

        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
    // main method
    public static void main(String[] args) {

        cll list = new cll();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Original List:");
        list.display();

        list.delete(30);
        System.out.println("After deleting 30:");
        list.display();
        list.delete(10);
        System.out.println("After deleting 10:");
        list.display();
    }
}