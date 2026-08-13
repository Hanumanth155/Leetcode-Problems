class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        int j=0;
        if(s1.length==0){
            return true;
        }
        for(char i : t1){
            if(j<s1.length){
            if(i==s1[j]){
                j++;
            }
            }
        }
        if(j==s1.length){
            return true;
        }
        return false;
    }
}