class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            String str = words[i];
            String temp = str;
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<str.length();j++){
                char ch = str.charAt(j);
                sb.append(ch);
            }
            String res = sb.reverse().toString();
            if(res.equals(temp)){
                return res;
            }
        }
        return "";
    }
}