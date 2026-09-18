class Solution {
    public boolean detectCapitalUse(String word) {
        char[] ch = word.toCharArray();
        int cap=0;
        int small=0;
        boolean first=false;
        for(int i=0;i<ch.length;i++){
            if(ch[i]>=65 && ch[i]<=90){
                cap++;
                if(i==0){
                    first=true;
                }
            }
            if(ch[i]>=97 && ch[i]<=122){
                small++;
            }

        }
        if(cap==ch.length || small==ch.length || (first&&small==ch.length-1)){
            return true;
        }
        return false;
    }
}