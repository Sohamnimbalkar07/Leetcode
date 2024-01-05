<<<<<<< HEAD
class Solution {
    public int maxProfit(int[] prices) {
        
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int maxProfit = 0;
        int minPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
        
            minPrice = Math.min(minPrice, prices[i]);

            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }

        return maxProfit;
    }
=======
class Solution {
    public int maxProfit(int[] prices) {
        
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int maxProfit = 0;
        int minPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
        
            minPrice = Math.min(minPrice, prices[i]);

            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }

        return maxProfit;
    }
>>>>>>> d01d636a86ee4c8f6902a6c21cd8cc1f81b4cb00
}