class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        int i;
        for(i=1;i<s.length();i=i+2){
            sb.append(s.charAt(i-1));
            char ch = shift(s.charAt(i-1),s.charAt(i)-'0');
            sb.append(ch);
        }
        if(i==s.length()){
        sb.append(s.charAt(s.length()-1));
        }
        return sb.toString();
    }
    public static char shift(char a, int b ){
        return (char)(a+b);
    }
}