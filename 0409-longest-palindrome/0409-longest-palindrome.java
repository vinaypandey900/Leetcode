class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),  0)+1);
        }
        int ans=0;
        boolean isFirstOdd=false;
        for(int a:map.values()){
           if(a%2==0){
             ans+=a;
           }
           else{
             if(isFirstOdd==false){
               ans+=a;
               isFirstOdd=true;
             }
             else
                ans+=a-1;
           }
        }
        return ans;
    }
}