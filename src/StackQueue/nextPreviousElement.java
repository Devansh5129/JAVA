package StackQueue;

import java.util.*;

public class nextPreviousElement {

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};

        int[] ans = new int[arr.length];

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {

            // remove greater or equal elements
            while (!stack.isEmpty()
                    && stack.peek() >= arr[i]) {

                stack.pop();
            }
            // previous smaller
            if (stack.isEmpty()) {
                ans[i] = -1;
            }
            else {
                ans[i] = stack.peek();
            }
            // push current value
            stack.push(arr[i]);
        }
        // print answer
        System.out.println("Previous Smaller Elements:");

        for (int val : ans) {
            System.out.print(val + " ");
        }
    }
}