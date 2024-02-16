class Solution {
    public int searchInsert(int[] nums, int target) {
        List<Integer>list=new ArrayList<>();
        boolean found=false;
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
            if(nums[i]==target){
               found=true;
               return i;
               }
        }
        if(found==false){
            list.add(target);
            Collections.sort(list);
            System.out.println(list);
            for(int i=0;i<list.size();i++){
                if(list.get(i)==target)
                return i;
            }
        }
        return 1;
    }
}