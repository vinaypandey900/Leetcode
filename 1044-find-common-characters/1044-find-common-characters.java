class Solution {
    public List<String> commonChars(String[] words) {
        int count[]=new int[26];
        List<String>list=new ArrayList<>();
        fillWithArray(words[0], count);
        for(int i=1;i<words.length;i++){
            int temp[]=new int [26];
            fillWithArray(words[i], temp);
            
            for(int j=0;j<26;j++){
              count[j]=Math.min(count[j], temp[j]);
            }
        }
        for(int i=0;i<26;i++){
            while(count[i]>0){
                list.add(String.valueOf((char)(i+'a')));
                count[i]--;
            }
        }
        return list;
    }
    public void fillWithArray(String word, int[] count){
       for(char c: word.toCharArray()){
          count[c-'a']++;
       }
       
    }
}