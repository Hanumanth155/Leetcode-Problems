class Solution {
    public String finalString(String s) {
        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char x : ch){
            if(x=='i'){
                sb.reverse();
            }else{
            sb.append(x);
            }
        }
        return sb.toString();
    }
}