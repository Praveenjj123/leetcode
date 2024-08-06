class Solution {
    public int maxProfit(int[] prices) {
       int buy,profit,i,cost;
       buy=prices[0];
       profit=0;
for(i=0;i<prices.length;i++)
{
     cost=prices[i]-buy;
     profit=Math.max(profit,cost);
     buy=Math.min(prices[i],buy);
}
return profit;


    }
}