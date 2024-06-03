class Solution {
    public int appendCharacters(String s, String t) {
        int j=0, k=0;

        while(j<s.length() && k<t.length()){
            if(s.charAt(j)==t.charAt(k)){
              j++;
              k++;
            }
            else
              j++;
        }
       return t.length()-k;
    }
}