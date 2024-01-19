class Solution {
    public int maxProfit(int[] prices) {

    int smallestPriceSoFar = prices[0];
    int profitToday = 0;
    int bestProfitSoFar = 0;
    for(int i = 0; i< prices.length; i++)
    {
        if(smallestPriceSoFar > prices[i])
            smallestPriceSoFar = prices[i];
        profitToday = prices[i] - smallestPriceSoFar;
        if(profitToday > bestProfitSoFar)
        {
            bestProfitSoFar = profitToday;
        }
    }
        return bestProfitSoFar;
    }
    
}
