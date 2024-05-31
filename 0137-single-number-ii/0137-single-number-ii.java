class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
        }
        System.out.println(map);
        for(Map.Entry<Integer, Integer> entry:map.entrySet())
        {
            if(entry.getValue()==1)
              return entry.getKey();
        }
        return -1;
    }
}