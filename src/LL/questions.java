import java.util.*;

public class questions {

    // Definition of ListNode
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // 🔥 MERGE SORT ON LINKED LIST
    public static ListNode mergeSortLL(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // find middle
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode mid = slow.next;
        slow.next = null;

        ListNode left = mergeSortLL(head);
        ListNode right = mergeSortLL(mid);

        return merge(left, right);
    }

    public static ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }

        if (l1 != null) temp.next = l1;
        if (l2 != null) temp.next = l2;

        return dummy.next;
    }

    // 🔥 REVERSE BETWEEN
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) return head;

        ListNode curr = head;
        ListNode prev = null;

        for (int i = 0; i < left - 1; i++) {
            prev = curr;
            curr = curr.next;
        }

        ListNode last = prev;
        ListNode newEnd = curr;

        ListNode next = curr.next;

        for (int i = 0; i < right - left + 1; i++) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if (next != null) next = next.next;
        }

        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = curr;
        return head;
    }

    // 🔥 ROTATE RIGHT
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || k <= 0 || head.next == null) {
            return head;
        }

        ListNode last = head;
        int length = 1;

        while (last.next != null) {
            last = last.next;
            length++;
        }

        last.next = head;

        int rotations = k % length;
        int skip = length - rotations;

        ListNode newLast = head;

        for (int i = 0; i < skip - 1; i++) {
            newLast = newLast.next;
        }

        head = newLast.next;
        newLast.next = null;

        return head;
    }

    // 🔥 PRINT LINKED LIST
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("END");
    }

    // 🔥 MAIN METHOD (TEST EVERYTHING)
    public static void main(String[] args) {

        // Create list: 1 → 4 → 3 → 2 → 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        // 🔥 Merge Sort
        ListNode sorted = mergeSortLL(head);
        System.out.println("After Merge Sort:");
        printList(sorted);

        // 🔥 Reverse Between
        ListNode reversed = reverseBetween(sorted, 2, 4);
        System.out.println("After Reverse Between (2,4):");
        printList(reversed);

        // 🔥 Rotate Right
        ListNode rotated = rotateRight(reversed, 2);
        System.out.println("After Rotate Right by 2:");
        printList(rotated);
    }
}