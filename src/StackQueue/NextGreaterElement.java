package StackQueue;
import java.util.*;
public class NextGreaterElement {
    public static void main(String[] args) {
        int[] elements = {6, 8, 0, 1, 3};
        int[] nums2 = {1,3,4,2};
        int [] nums1 ={4,1,2};
        System.out.println(Arrays.toString(nextGreaterElement1(nums1, nums2)));
        int[] ans = new int[elements.length];
        Stack<Integer> stack = new Stack<>();
        // traverse from right
        for (int i = elements.length - 1; i >= 0; i--) {
            // remove smaller or equal elements
            while (!stack.isEmpty() &&
                    elements[stack.peek()] <= elements[i]) {
                stack.pop();
            }
            // if no greater element
            if (stack.isEmpty()) {
                ans[i] = -1;
            }
            else {
                ans[i] = elements[stack.peek()];
            }
            // push INDEX
            stack.push(i);
        }
        // print answer
        for (int val : ans) {
            System.out.print(val + " ");
        }
    }
        public static int[] nextGreaterElement1(int[] nums1, int[] nums2) {
            Stack<Integer> stack = new Stack<>();
            HashMap<Integer, Integer> map = new HashMap<>();
            // process nums2 from right
            //sabse pahle nums 2 ke next greater find kar rahe by the approach given , usko ek map me store staore kar nums 1 ko traverse karke dehkkar kise kya ngreater chahiye directly access ho jayega
            for (int i = nums2.length - 1; i >= 0; i--) {
                while (!stack.isEmpty()
                        && stack.peek() <= nums2[i]) {
                    stack.pop();
                }
                // store NGE
                if (stack.isEmpty()) {
                    map.put(nums2[i], -1);
                }
                else {
                    map.put(nums2[i], stack.peek());
                }
                stack.push(nums2[i]);
            }
            // build answer
            int[] ans = new int[nums1.length];
            for (int i = 0; i < nums1.length; i++) {
                ans[i] = map.get(nums1[i]);
            }
            return ans;
        }
    }
