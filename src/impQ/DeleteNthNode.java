package impQ;

//public class deletion {
//    public ListNode removeNthFromEnd(ListNode head, int n){
//        //pehle size nikalte
//        int size =0;
//        ListNode curr=head;
//        while(curr!=null){
//            curr=curr.next;
//            size++;
//        }
//        //returning head.next becox while traversing from last , we will
//        //last at head , that must be present ...
//        if(n==size){
//            return head.next;
//        }
//
//        int index=size-n;
//        ListNode prev =head;
//        for (int i = 1; i < index; i++) {
//            prev = prev.next;
//        }
//        prev.next=prev.next.next;
//        return head;
//
//    }
//}
class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class DeleteNthNode {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode curr = head;

        // Step 1: find size
        while (curr != null) {
            curr = curr.next;
            size++;
        }

        // Step 2: if deleting head
        if (n == size) {
            return head.next;
        }

        // Step 3: find previous node
        int index = size - n;

        ListNode prev = head;
        for (int i = 1; i < index; i++) {
            prev = prev.next;
        }

        // Step 4: delete node
        prev.next = prev.next.next;

        return head;
    }

    // print function
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // create: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original List: ");
        printList(head);

        head = removeNthFromEnd(head, 2);

        System.out.print("After Deletion: ");
        printList(head);
    }
}