package impQ;
import java.util.*;
public class StockSpan {
    public static void main(String[] args) {
        // stock prices
        int[] price = {100, 80, 60, 70, 60, 75, 85};
        // answer array
        int[] ans = new int[price.length];
        // stack stores indices
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < price.length; i++) {
            // remove smaller or equal elements
            while (!stack.isEmpty() && price[stack.peek()] <= price[i]) {
                stack.pop();
            }
            // if no greater element on left
            if (stack.isEmpty()) {
                ans[i] = i + 1;
            }
            else {
                // distance from previous greater element
                ans[i] = i - stack.peek();
            }
            // push current index
            stack.push(i);
        }
        // print answer
        for (int val : ans) {
            System.out.print(val + " ");
        }
    }
}