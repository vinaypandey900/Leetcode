class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int max=Integer.MIN_VALUE;
        for(int i=1;i<prices.length;i++){
            
            int temp=prices[i]-min;
            max=Math.max(temp,max);
            min=Math.min(min, prices[i]);
        }
        if(max<0)
          return 0;
        else
          return max;
    }
}