class Solution {
    public boolean isSubsequence(String s, String t) {
        int pos=-1;
       
        for(int i=0;i<s.length();i++){
            boolean flag=false;
            for(int j=pos+1;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                     flag=true;
                     pos=j;
                     break;
                    }
            }
            if(!flag)
                return false;
        }
        return true;
    }
}