class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        boolean found=true;
        for(char i : word.toCharArray()){
            if(i==ch){
                sb.append(i);
                if(found){
                sb.reverse();
                found=false;
                }
            }else{
                sb.append(i);
            }
            
        }
        return sb.toString();
    }
}