public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    // ================= INSERT =================

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            insertFirst(val);
            return;
        }

        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    // Recursive insert
    public void insertRec(int val, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            size++;
            return new Node(val, node);
        }

        node.next = insertRec(val, index - 1, node.next);
        return node;
    }

    // ================= DELETE =================

    public int deleteFirst() {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }

        int val = head.value;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;

        tail = secondLast;
        tail.next = null;
        size--;

        return val;
    }

    public int delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            return deleteFirst();
        }

        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size--;

        return val;
    }

    // ================= HELPERS =================

    public Node find(int value) {
        Node node = head;

        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }

        return null;
    }

    public Node get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    // ================= DISPLAY =================

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println("END");
    }

    // ================= DUPLICATES =================

    public void duplicates() {
        if (head == null) return;

        Node node = head;

        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }

        tail = node;
    }

    // ================= MERGE =================

    public static LL merge(LL first, LL second) {
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }

        while (f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }

        while (s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }

        return ans;
    }

    // ================= BUBBLE SORT =================

    public void bubbleSort() {
        if (size < 2) return;

        for (int i = 0; i < size; i++) {
            Node current = head;
            Node prev = null;

            while (current != null && current.next != null) {
                Node next = current.next;

                if (current.value > next.value) {
                    // swap nodes
                    if (prev == null) {
                        head = next;
                    } else {
                        prev.next = next;
                    }

                    current.next = next.next;
                    next.next = current;

                    prev = next;
                } else {
                    prev = current;
                    current = current.next;
                }
            }
        }
    }

    // ================= REVERSE =================

    public void reverse() {
        if (size < 2) return;

        Node prev = null;
        Node present = head;

        while (present != null) {
            Node next = present.next;
            present.next = prev;
            prev = present;
            present = next;
        }

        head = prev;
    }

    // Recursive reverse
    public void reverseRecursion() {
        if (head == null) return;
        reverseRec(head);
    }

    private void reverseRec(Node node) {
        if (node == tail) { // iska mtlb pointer last pohoch gaya
            head = tail;
            return;
        }

        reverseRec(node.next); //pointer wapas ghuma do
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    // ================= NODE =================

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // ================= MAIN =================

    public static void main(String[] args) {

        LL first = new LL();
        LL second = new LL();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

        LL ans = LL.merge(first, second);
        ans.display();

        LL list = new LL();
        for (int i = 7; i > 0; i--) {
            list.insertLast(i);
        }

        list.display();
        list.bubbleSort();
        list.display();

        list.reverse();
        list.display();
    }
}