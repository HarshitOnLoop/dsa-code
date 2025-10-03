class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int sell = 0;
int r=0;
        for (int i = 0; i < prices.length; i++) {
            if (buy > prices[i]) {
                buy = prices[i]; 
            }

            r = Math.max(r, prices[i] - buy);
        }
return r;

    }
}
