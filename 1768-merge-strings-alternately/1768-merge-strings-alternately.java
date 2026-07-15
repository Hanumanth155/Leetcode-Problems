class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0,j=0;
        String result = "";
        int pick=0;
        while(i<word1.length()&&j<word2.length()){
            if(pick==0){
                char ch = word1.charAt(i);
                result+=ch;
                i++;
                pick=1;
            }else{
                char ch = word2.charAt(j);
                result+=ch;
                j++;
                pick=0;
            }
        }
        while(i<word1.length()){
            char ch = word1.charAt(i);
            result+=ch;
            i++;
        }
        while(j<word2.length()){
            char ch = word2.charAt(j);
            result+=ch;
            j++;
        }
        return result;
    }
}