class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxSum=0;
        for(int i=0;i<k;i++)
           maxSum+=nums[i];
        double wSum=maxSum;
        for(int i=k;i<nums.length;i++){
             wSum+=nums[i]-nums[i-k];
             maxSum=Math.max(wSum, maxSum);
        }
        System.out.print(maxSum);
        return maxSum/k;
    }
}