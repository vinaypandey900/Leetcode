class Solution {
    public int[] sortedSquares(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            nums[i]=(int)Math.pow(nums[i], 2);
        }
        int left=0;
        int right=nums.length-1;
        int index=nums.length-1;
        int sort[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
          if(nums[left]>nums[right]){
              sort[index]=nums[left];
              left++;
          }
          else{
              sort[index]=nums[right];
              right--;
          }
          index--;
        }
       
        return sort;
    }
}