package questions.leetcode;

import java.util.Arrays;

public class BuyTwoChocolates {
    public static void main(String[] args) {
        int[] prices = {3,2,3};
        int money = 3;

//        int result = buyChoco(prices, money);
        int result = buyChoco2(prices, money);

        System.out.println(result);

    }
    public static int buyChoco(int[] prices, int money) {
        int[] sorted = Arrays.stream(prices).sorted().toArray();

        for (int i = 0; i < sorted.length - 1; i++) {
            if (sorted[i] + sorted[i+1] <= money) {
                money = money - (sorted[i] + sorted[i+1]);
                return money;
            }
        }
        return money;
    }

    public static int buyChoco2(int[] prices, int money){
        Arrays.sort(prices);
        return prices[0] + prices[1] <= money ? money - (prices[0] + prices[1]):money;
    }
}
