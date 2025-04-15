
import java.util.*;

class FinalPricesWithDiscount {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        for (int i = prices.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() > prices[i])
                stack.pop();
            int discount = stack.isEmpty() ? 0 : stack.peek();
            stack.push(prices[i]);
            prices[i] -= discount;
        }
        return prices;
    }
}
