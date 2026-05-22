package StackQueue;
import java.util.*;
public class NextGreaterElement {
    public static void main(String[] args) {
        int[] elements = {6, 8, 0, 1, 3};
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
}