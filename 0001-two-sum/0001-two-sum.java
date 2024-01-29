class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum[]=new int[2];
        
        for(int k=0;k<nums.length;k++){
            for(int j=k+1;j<nums.length;j++){
                if(nums[k]+nums[j]==target){
                    sum[0]=k;
                    sum[1]=j;
                    break;
                }
            }
        }
        return sum;

        }
    }