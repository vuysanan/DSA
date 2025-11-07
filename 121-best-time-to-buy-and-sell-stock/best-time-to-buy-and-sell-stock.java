class Solution 
{
    public int maxProfit(int[] prices) 
    {
        // find the least price and buy on that day using minValue
        // find the max price in the positions(days) after the buying date using maxValue
        // then calc the diff between the prices

        /*int buy = 0, buyDate = 0;
        int sell = 0;
        //int profit = 0;
        int minValue = 9999;
        int maxValue = -9999;
        for (int i = 0; i < prices.length; i++)
        {
            if (prices[i] < minValue)
            {
                buy = prices[i];
                buyDate = i;
            }    
        }

        for (int x = buyDate; x < prices.length; x++)
        {
            if (prices[x] > maxValue)
            {
                sell = prices[x];
            }
        }

        return sell - buy;*/

        // find the least price and set it as the min buying price
        // continue to traverse the array then if you find a price > the min buying price then that will be the selling price
        // calc the profit
        // compare the profit to the max profit possible in the array 
        // return the max possible profit

        int minBuyPrice = 9999;
        int currentProfit = 0;
        int maxProfit = 0;

        for (int x = 0; x < prices.length; x++)
        {
            if (prices[x] < minBuyPrice)
            {
                minBuyPrice = prices[x];
            }
            else
            {
                currentProfit = prices[x] - minBuyPrice;
            }

            if (currentProfit > maxProfit)
                maxProfit = currentProfit;
        }

        return maxProfit;
    }
}