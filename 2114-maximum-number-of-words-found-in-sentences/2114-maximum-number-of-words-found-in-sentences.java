class Solution {
    public int mostWordsFound(String[] s) {
        int max=0;
        for(String i : s){
            String[] words = i.split(" ");
            if(words.length>max){
                max=words.length;
            }
        }
        return max;
    }
}