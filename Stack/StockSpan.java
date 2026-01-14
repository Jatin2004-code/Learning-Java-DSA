package Stack;

import java.util.Stack;

public class StockSpan {

    public static void stockSpan(int prices[], int span[]) {

        Stack<Integer> s = new Stack<>();
        // stack stores index

        span[0] = 1;
        s.push(0);

        for (int i = 1; i < prices.length; i++) {

            int currPrice = prices[i];

            // pop smaller or equal prices
            while (!s.isEmpty() && currPrice >= prices[s.peek()]) {
                s.pop();
            }

            // calculate span
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - s.peek();
            }

            // push current index
            s.push(i);
        }
    }

    public static void main(String[] args) {

        int prices[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[prices.length];

        stockSpan(prices, span);

        // print span
        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }
    }
}

