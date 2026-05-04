////package LL;
////// leetcode -- delete duplicates...
////public class questions {
////    public ListNode removeDuplicates(ListNode node){
////        ListNode node = head;
////        while (node.next != null){
////            if(node.val==node.next.value) {
////                node.next = node.next.next;
////                size--;
////            } else{
////                node = node.next;
////
////            }
////        }
////        tail = node;
////        tail.next =null;
////    }
////    public static void main(String [] args){
////
////    }
////    questions list = new questions();
////    list.
////
////}
//    import java.util.*;
//
//public class questions {
//   public ListNode mergeSortLL(ListNode node){
//       if(head==null||head.next==null){
//           return head;
//       }
//       ListNode slow= head;
//       ListNode fast=head.next;
//       while(fast!=null&& fast.next!=null){
//           slow=slow.next;
//           fast=fast.next.next;
//       }
//       ListNode mid= slow.next;
//       slow.next=null;
//       ListNode left = sortList(head);
//       ListNode right = sortList(mid);
//       return merge(left,right);
//   }
//   public static ListNode merge(ListNode l1, ListNode l2){
//       ListNode dummy = new ListNode();
//       ListNode temp = dummy;
//       while(l1 !=null && l2!=null ){
//           if(l1.value<l2.value){
//               temp.next=l1;
//               l1=l1.next;
//           }else{
//               temp.next=l2;
//               l2=l2.next;
//           }
//           temp=temp.next;
//
//       }
//       if (l1 != null) temp.next = l1;
//       if (l2 != null) temp.next = l2;
//
//       return dummy.next;
//   }
//
//    static void main(String[] args) {
//
//    }
//}