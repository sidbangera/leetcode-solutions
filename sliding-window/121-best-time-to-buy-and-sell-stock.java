class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;
        for(int price:prices){
            min = Math.min(min,price);
            int profit = price-min;
            maxProfit = Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}