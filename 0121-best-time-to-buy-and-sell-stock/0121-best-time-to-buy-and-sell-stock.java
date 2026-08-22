class Solution {
    public int maxProfit(int[] prices) { 
        int profit=0, minim=prices[0];
        for(int i=0;i<prices.length;i++)
        {
            profit=Math.max(profit,prices[i]-minim);
            minim=Math.min(minim,prices[i]);
        }
        return profit;
        
    }
}