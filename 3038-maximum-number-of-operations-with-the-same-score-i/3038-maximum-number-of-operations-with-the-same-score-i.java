class Solution {
    public int maxOperations(int[] nums) {
        int count=1;
        if(nums.length>=2){
             int sum=nums[0]+nums[1];
            for(int i=3;i<nums.length;i+=2){
               int nextSum=nums[i-1]+nums[i];
               if(nextSum==sum){
                 count++;
                 sum=nextSum;
                 nextSum=0;
               }
                else
                    break;
            }
        }
        return count;
    }
}