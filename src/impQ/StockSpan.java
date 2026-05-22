package impQ;
//find : prevHIgh=> span - i - prevHIgh
import java.util.*;

class StockSpan{
    Stack<int[]> stack;
    public StockSpan() {
        stack = new Stack<>();
    }
    public int next(int price) {
        int span = 1;
        // remove smaller/equal prices
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }
        // store {price, span}
        stack.push(new int[]{price, span});
        return span;
    }

        public static void main(String[] args) {
            StockSpan ss = new StockSpan();
            int[] prices = {100, 80, 60, 70, 60, 75, 85};

            for (int price : prices) {
                System.out.println("Price: " + price +
                        " -> Span: " + ss.next(price));
            }
        }
}