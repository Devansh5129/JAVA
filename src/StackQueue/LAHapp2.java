package StackQueue;
import java.util.*;

public class LAHapp2 {
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }
    public static int largestRectangleArea(int[] heights) {

        int n = heights.length;

        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> stack = new Stack<>();

        // Next Smaller Right (NSR
        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty()
                    && heights[stack.peek()] >= heights[i]) {

                stack.pop();
            }
            if (stack.isEmpty()) {
                right[i] = n;
            }
            else {
                right[i] = stack.peek();
            }

            stack.push(i);
        }
        // clear stack
        stack.clear();
        // Previous Smaller Left (NSL
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty()
                    && heights[stack.peek()] >= heights[i]) {

                stack.pop();
            }

            if (stack.isEmpty()) {
                left[i] = -1;
            }
            else {
                left[i] = stack.peek();
            }

            stack.push(i);
        }
        // --------------------------
        // Calculate Max Area
        // --------------------------
        int maxArea = 0;
        for (int i = 0; i < n; i++) {

            int width = right[i] - left[i] - 1;
            int area = heights[i] * width;

            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}