class Solution {
    public String firstPalindrome(String[] words) {
        for(String str : words){
            String res = new StringBuilder(str).reverse().toString();
            if(res.equals(str)){
                return res;
            }
        }
        return "";
    }
}