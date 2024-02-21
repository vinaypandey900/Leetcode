class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int totalShift=0;
        while(left!=right){
            left=left>>1;
            right=right>>1;
            totalShift++;
        }
        return left<<totalShift;
    }
}