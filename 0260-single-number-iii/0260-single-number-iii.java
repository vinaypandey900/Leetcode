class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map=new HashMap<>();
        int []arr=new int[2];
        for(int i=0;i<nums.length;i++){
           map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        int i=0;
        for(Map.Entry<Integer, Integer>entry:map.entrySet()){
            if(entry.getValue()==1){
                arr[i]=entry.getKey();
                i++;
            }
        }
        return arr;
    }
}