class Solution {
    public int maxProfit(int[] prices) {
        int lowest = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lowest) {
                lowest = prices[i];
            } else if (prices[i] - lowest > maxProfit) {
                maxProfit = prices[i] - lowest;
            }
        }

        return maxProfit;
    }

}
