class Solution {
    public void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;
        for(int i=0;i<s.length/2;i++){
            char temp=s[right];
            s[right]=s[left];
            s[left]=temp;
            left++; right--;
        }
    }
}