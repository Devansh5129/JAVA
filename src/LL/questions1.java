package LL;
public class questions1 {
    // ListNode class
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {
        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    // add two numbers
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {

            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            // create new node
            temp.next = new ListNode(sum % 10);

            // update carry
            carry = sum / 10;

            // move temp
            temp = temp.next;
        }

        return dummy.next;
    }

    // display linked list
    public static void display(ListNode head) {

        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }

        System.out.println("END");
    }

    // main method
    public static void main(String[] args) {

        questions1 obj = new questions1();

        // first number: 342
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // second number: 465
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = obj.addTwoNumbers(l1, l2);

        System.out.println("Result:");
        display(result);
    }
}