class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int curr = prices[i]-prices[j];
                profit = Math.max(profit,curr);
            }
        }
        return profit;
    }
}
