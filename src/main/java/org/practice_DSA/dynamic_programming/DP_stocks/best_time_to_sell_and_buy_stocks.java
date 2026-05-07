package org.practice_DSA.dynamic_programming.DP_stocks;

public class best_time_to_sell_and_buy_stocks {
    public static int space_optimization(int[] prices){
        int min=0,max=0,cost=0;
        for(int i=1;i<prices.length;i++) {
            cost = prices[i] - min;
            max = Math.max(max, cost);
            min = Math.min(min, cost);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println(space_optimization(prices));
    }
}
