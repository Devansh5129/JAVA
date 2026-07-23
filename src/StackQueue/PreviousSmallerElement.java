package StackQueue;

import java.util.ArrayList;
import java.util.Stack;

class PreviousSmallerElement {
    static ArrayList<Integer> prevSmaller(int arr[]) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();

        // way to initialize all elements as -1 in array
        for (int i = 0; i < n; i++) result.add(-1);

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            // pop elements from stack until a smaller
            // element is found or stack becomes empty
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }
            // if stack is not empty, top is nearest smaller
            if (!st.isEmpty()) {
                result.set(i, st.peek());
            }
            // push current element to stack
            st.push(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 0, 3, 4, 5};
        ArrayList<Integer> ans = prevSmaller(arr);
        System.out.println("the previous smaller array ");
        for (int x : ans) System.out.print(x + " ");
    }
}