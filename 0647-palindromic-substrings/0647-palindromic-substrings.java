class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String str = s.substring(i,j);
                String rev= new StringBuilder(str).reverse().toString();
                if(str.equals(rev)){
                    count++;
                }
            }
        }
        return count;
    }
}