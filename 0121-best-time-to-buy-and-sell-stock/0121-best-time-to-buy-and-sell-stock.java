class Solution {
    public int maxProfit(int[] prices) {
        int maxNum =0;

         if (prices.length == 0) {  
            return 0;
        }

        int buyPrice = prices[0];
    
        for(int i=1; i<prices.length; i++){
                
            if(prices[i] - buyPrice>maxNum){
                maxNum = prices[i] - buyPrice;
            }

            if(prices[i]<buyPrice){
                buyPrice=prices[i];
            }
        }
        return maxNum;

    }
}