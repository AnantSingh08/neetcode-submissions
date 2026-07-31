class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price: prices) {
            min = Math.min(price,min);
            int profit = price - min;
            maxProfit = Math.max(profit,maxProfit);
        }
        return maxProfit;
    }
}
