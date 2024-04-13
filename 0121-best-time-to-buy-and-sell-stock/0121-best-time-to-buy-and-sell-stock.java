// Easy solution
class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 0;
        int gre_prof = 0;
        while(right<prices.length){
            if(prices[left]>=prices[right]) left = right;
            int curr_prof = prices[right] - prices[left];
            gre_prof = gre_prof>curr_prof ? gre_prof:curr_prof;
            right++;
        }
        return gre_prof;
    }
}