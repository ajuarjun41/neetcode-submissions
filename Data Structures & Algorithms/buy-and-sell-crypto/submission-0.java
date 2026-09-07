class Solution {
    public int maxProfit(int[] prices) {
        int max =0;
        int leastValue = prices[0];

        for(int i=0;i<prices.length;i++){
            max = Math.max(max,prices[i]-leastValue);
            leastValue = Math.min(leastValue,prices[i]);
        }

        return max;
        
    }
}
